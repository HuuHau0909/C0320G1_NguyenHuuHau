package CaseStudy.Models;

import java.util.Date;

public class House extends Services {
    private String houseStandard;
    private String convenientDescription;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String serviceName, double area, double cost, int maxPeople, String typeRent, String houseStandard, String convenientDescription, int numberOfFloors) {
        super(id, serviceName, area, cost, maxPeople, typeRent);
        this.houseStandard = houseStandard;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String gethouseStandard() {
        return houseStandard;
    }

    public void sethouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
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
    public String showInfo() {
        return "House:" +"\n"+
                "id='" + super.getId() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", area=" + super.getArea() +
                ", cost=" + super.getCost() +
                ", maxPeople=" + super.getMaxPeople() +
                ", typeRent=" + super.getTypeRent() +
                "houseStandard='" + houseStandard + '\'' +
                ", convenientDescription='" + convenientDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors;
    }
}
