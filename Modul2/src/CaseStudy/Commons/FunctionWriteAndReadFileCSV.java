package CaseStudy.Commons;


import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionWriteAndReadFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_OF_VILLA = "id,nameService,areaUse,rentalCost,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,areaPool,numberOfFloors";
    private static final String FILE_HEADER_OF_HOUSE = "id,nameService,areaUse,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,numberOfFloors";
    private static final String FILE_HEADER_OF_ROOM = "id,nameService,areaUse,rentalCosts,maxNumberOfPeople,typeRent,freeService";
//    private static final String[] FILE_HEADER_OF_CUSTOMER = {"id", " nameCustomer", "idCard", " birthday", " gender", " phoneNumber", " email", " typeCustomer", " address"};
//    private static final String[] FILE_HEADER_OF_BOOKING = {"id", " nameCustomer", "idCard", " birthday", " gender", " phoneNumber", " email", " typeCustomer", " address", "idService", "nameService", "areaUse", "rentalCost", "maxNumberOfPeople", "typeRent",};
    private static final String PATH_FILE_VILLA = "src/CaseStudy/Data/Villa.csv";
    private static final String PATH_FILE_HOUSE = "src/CaseStudy/Data/House.csv";
    private static final String PATH_FILE_ROOM = "src/CaseStudy/Data/Room.csv";

    public static void writeVillaToFile(ArrayList<Villa> listVillas) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_VILLA);
            fileWriter.append(FILE_HEADER_OF_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVillas) {
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getvillaStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getSwimmingPoolArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error while writer Villa to file");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error while flush or close!");
            }
        }

    }
    public static ArrayList<Villa> getVillaFromFileCSV() {
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_VILLA));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setServiceName(splitData[1]);
                villa.setArea(Double.parseDouble(splitData[2]));
                villa.setCost(Double.parseDouble(splitData[3]));
                villa.setMaxPeople(Integer.parseInt(splitData[4]));
                villa.setTypeRent(splitData[5]);
                villa.setvillaStandard(splitData[6]);
                villa.setSwimmingPoolArea(Double.parseDouble(splitData[7]));
                villa.setConvenientDescription(splitData[8]);
                villa.setNumberOfFloors(Integer.parseInt(splitData[9]));
                listVilla.add(villa);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        return listVilla;
    }

    public static void writeHouseToFile(ArrayList<House> listHouses) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_HOUSE);
            fileWriter.append(FILE_HEADER_OF_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : listHouses) {
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.gethouseStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloors()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error while writer house to file!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error while flush or close!");
            }
        }

    }
    public static ArrayList<House> getHouseFromFileCSV() {
        BufferedReader br = null;
        ArrayList<House> listHouses = new ArrayList<House>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_HOUSE));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setId(splitData[0]);
                house.setServiceName(splitData[1]);
                house.setArea(Double.parseDouble(splitData[2]));
                house.setCost(Double.parseDouble(splitData[3]));
                house.setMaxPeople(Integer.parseInt(splitData[4]));
                house.setTypeRent(splitData[5]);
                house.sethouseStandard(splitData[6]);
                house.setConvenientDescription(splitData[7]);
                house.setNumberOfFloors(Integer.parseInt(splitData[8]));
                listHouses.add(house);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        return listHouses;
    }

    public static void writeRoomToFile(ArrayList<Room> listRooms) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_ROOM);
            fileWriter.append(FILE_HEADER_OF_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room : listRooms) {
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeServices());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error while writer Room to file!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error while flush or close!");
            }
        }

    }
    public static ArrayList<Room> getRoomFromFileCSV() {
        BufferedReader br = null;
        ArrayList<Room> listRooms = new ArrayList<Room>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH_FILE_ROOM));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Room room = new Room();
                room.setId(splitData[0]);
                room.setServiceName(splitData[1]);
                room.setArea(Double.parseDouble(splitData[2]));
                room.setCost(Double.parseDouble(splitData[3]));
                room.setMaxPeople(Integer.parseInt(splitData[4]));
                room.setTypeRent(splitData[5]);
                room.setFreeServices(splitData[6]);
                listRooms.add(room);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        return listRooms;
    }

}
