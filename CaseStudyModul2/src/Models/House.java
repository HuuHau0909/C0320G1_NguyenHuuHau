package Models;

public class House extends Services {
    private String roomStandard;
    private String convenientDescription;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String serviceName, double areaUse, double rentalCosts, int maxNumberOfPeople, String rentType, String roomStandard, String convenientDescription, int numberOfFloors) {
        super(id, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                        "\nConvenient Description='" + this.convenientDescription +
                        "\nNumber Of Floors=" + this.numberOfFloors
        );
    }
}
