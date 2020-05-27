package Commons;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.List;

import static Commons.FunctinWriteAndReadFileCSV.*;

public class FunctionGeneric {
    public enum EntityType {
        VILLA,
        HOUSE,
        ROOM,
        CUSTOMER,
        EMPLOYEE
    }

    public static <E> List <E> getListFromCSV(EntityType entityType){
        String csvPath = "";
        String[] headerRecord;
        switch (entityType) {
            case VILLA:
                csvPath = PATH_VILLA;
                headerRecord = FILE_HEADER_OF_VILLA;
                break;
            case HOUSE:
                csvPath = PATH_HOUSE;
                headerRecord = FILE_HEADER_OF_HOUSE;
                break;
            case ROOM:
                csvPath = PATH_ROOM;
                headerRecord = FILE_HEADER_OF_ROOM;
                break;
            case CUSTOMER:
                csvPath = PATH_CUSTOMER;
                headerRecord = FILE_HEADER_OF_CUSTOMER;
                break;
            case EMPLOYEE:
                csvPath = PATH_EMPLOYEE;
                headerRecord = FILE_HEADER_OF_EMPLOYEE;
                break;
            default:
                throw new IllegalStateException("Unexpected value!" + entityType);
        }
        Path path = Paths.get(csvPath);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(csvPath);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        ColumnPositionMappingStrategy<E> strategy = new ColumnPositionMappingStrategy<>();
        switch (entityType) {
            case VILLA:
                strategy.setType((Class<? extends E>) Villa.class);
                break;
            case HOUSE:
                strategy.setType((Class<? extends E>) House.class);
                break;
            case ROOM:
                strategy.setType((Class<? extends E>) Room.class);
                break;
            case CUSTOMER:
                strategy.setType((Class<? extends E>) Customer.class);
                break;
            case EMPLOYEE:
//                strategy.setType((Class<? extends E>) Employee.class);
                break;
            default:
        }
        strategy.setColumnMapping(headerRecord);
        CsvToBean<E> csvToBean = null;
        try{
            csvToBean = new CsvToBeanBuilder<E>(new FileReader(csvPath))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return (List<E>) csvToBean.parse();
    }
    public static <E>void displaylist(List<E> list){
        int i = 1;
        System.out.println("----------------------List----------------------------");
        for (E item:list){
            System.out.println("No: "+i);
            if (item instanceof Villa){
                ((Villa) item).showInfo();
            } else  if (item instanceof House){
                ((House) item).showInfo();
            } else if (item instanceof Room){
                ((Room) item).showInfo();
//            }else if (item instanceof Custo)
        }
            i++;
            System.out.println("--------------------------------------------------");
    }
}}
