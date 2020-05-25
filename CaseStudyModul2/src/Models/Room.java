package Models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String id, String serviceName, double areaUse, double rentalCosts, int maxNumberOfPeople, String rentType, String freeServices) {
        super(id, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
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
                        "\nFree Services: " + this.freeServices
        );
    }
}
