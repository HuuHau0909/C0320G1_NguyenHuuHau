package CaseStudy.Models;



public class Villa extends Services {
    private String villaStandard;
    private double swimmingPoolArea;
    private String convenientDescription;
    private int numberOfFloors;

    public Villa() {
    }


    public Villa(String id, String serviceName, double area, double cost, int maxPeople, String typeRent, String villaStandard, double swimmingPoolArea, String convenientDescription, int numberOfFloors) {
        super(id, serviceName, area, cost, maxPeople, typeRent);
        this.villaStandard = villaStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getvillaStandard() {
        return villaStandard;
    }

    public void setvillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
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
    public String showInfo() {
        return "Villa{" +
                "id='" + super.getId() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", area=" + super.getArea() +
                ", cost=" + super.getCost() +
                ", maxPeople=" + super.getMaxPeople() +
                ", typeRent=" + super.getTypeRent() +
                "villaStandard='" + villaStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", convenientDescription='" + convenientDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }




}
