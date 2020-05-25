package CaseStudy.Models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String id, String serviceName, double area, double cost, int maxPeople, String typeRent, String freeServices) {
        super(id, serviceName, area, cost, maxPeople, typeRent);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room: " +
                "id='" + super.getId() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", area=" + super.getArea() +
                ", cost=" + super.getCost() +
                ", maxPeople=" + super.getMaxPeople() +
                ", typeRent=" + super.getTypeRent() +
                "freeServices='" + freeServices + '\''
                ;
    }
}
