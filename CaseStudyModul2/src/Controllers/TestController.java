package Controllers;


import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

public class TestController {
    public static void main(String[] args) {
        Services villa = new Villa();
        villa.showInfo();
        System.out.println("------------------------");
        House house = new House();
        house.showInfo();
        System.out.println("------------------------");
        Room room = new Room();
        room.showInfo();
    }
}
