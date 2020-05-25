package Models;

public class Villa extends Services {
    private String roomStandard;
    private double swimmingPoolArea;
    private String convenientDescription;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String serviceName, double areaUse, double rentalCosts, int maxNumberOfPeople, String rentType, String roomStandard, double swimmingPoolArea, String convenientDescription, int numberOfFloors) {
        super(id, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Service ID: " + super.getId() +
                "\nService Name: " + super.getServiceName() +
                "\nArea Use: " + super.getAreaUse() +
                "\nRental Costs: " + super.getRentalCosts() +
                "\nMax Number Of People: " + super.getMaxNumberOfPeople() +
                "\nType Rent: " + super.getRentType() +
                "\nRoom Standard: " + this.roomStandard +
                "\nSwimming Pool Area=" + this.swimmingPoolArea +
                "\nConvenient Description='" + this.convenientDescription +
                "\nNumber Of Floors=" + this.numberOfFloors
        );
    }
}
