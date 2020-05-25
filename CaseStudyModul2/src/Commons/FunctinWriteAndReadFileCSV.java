package Commons;

import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class FunctinWriteAndReadFileCSV {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final char DEFAULT_QUOTE = '"';
    public static final int NUM_OF_LINE_SKIP = 1;


    //    public static final String COMMA_DELIMITER = ",";
//    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String PATH_VILLA = "src/Data/Villa.csv";
    public static final String PATH_HOUSE = "src/Data/House.csv";
    public static final String PATH_ROOM = "src/Data/Room.csv";
    public static final String PATH_CUSTOMER = "src/Data/Customer.csv";
    public static final String PATH_EMPLOYEE = "src/Data/Employee.csv";
    public static final String PATH_BOOKING = "src/Data/Booking.csv";
    public static final String[] FILE_HEADER_OF_VILLA = {"id", "nameService", "areaUse", "rentalCost", "maxNumberOfPeople", "typeRent", "roomStandard", "convenientDescription", "areaPool", "numberOfFloors"};
    public static final String[] FILE_HEADER_OF_HOUSE = {"id", "nameService", "areaUse", "rentalCosts", "maxNumberOfPeople", "typeRent", "roomStandard", "convenientDescription", "numberOfFloors"};
    public static final String[] FILE_HEADER_OF_ROOM = {"id", "nameService", "areaUse", "rentalCosts", "maxNumberOfPeople", "typeRent", "freeService"};
    public static final String[] FILE_HEADER_OF_CUSTOMER = {"id", "nameCustomer", "idCard", " birthday", " gender", " phoneNumber", " email", " typeCustomer", " address"};
    public static final String[] FILE_HEADER_OF_EMPLOYEE = {"id", "fullname", "age", "address"};
    public static final String[] FILE_HEADER_OF_BOOKING = {"id", "nameCustomer", "idCard", " birthday", " gender", " phoneNumber", " email", " typeCustomer", " address", "idService", "nameService", "areaUse", "rentalCost", "maxNumberOfPeople", "typeRent",};

    public static void writeVillaToFileCsv(List<Villa> list) {
        try (
                Writer writer = new FileWriter(PATH_VILLA);
                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(FILE_HEADER_OF_VILLA);
            for (Villa villa : list) {
                csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getServiceName(), String.valueOf(villa.getAreaUse()), String.valueOf(villa.getRentalCosts()), String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getRentType(), villa.getRoomStandard(), villa.getConvenientDescription(), String.valueOf(villa.getSwimmingPoolArea()), String.valueOf(villa.getNumberOfFloors())});
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeHouseToFileCsv(List<House> list) {
        try (
                Writer writer = new FileWriter(PATH_HOUSE);
                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(FILE_HEADER_OF_HOUSE);
            for (House house : list) {
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getServiceName(), String.valueOf(house.getAreaUse()), String.valueOf(house.getRentalCosts()), String.valueOf(house.getMaxNumberOfPeople()),
                        house.getRentType(), house.getRoomStandard(), house.getConvenientDescription(), String.valueOf(house.getNumberOfFloors())});
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeRoomToFileCsv(List<Room> list) {
        try (
                Writer writer = new FileWriter(PATH_ROOM);
                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(FILE_HEADER_OF_ROOM);
            for (Room room : list) {
                csvWriter.writeNext(new String[]{
                        room.getId(), room.getServiceName(), String.valueOf(room.getAreaUse()), String.valueOf(room.getRentalCosts()), String.valueOf(room.getMaxNumberOfPeople()),
                        room.getRentType(), room.getFreeServices()});
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
