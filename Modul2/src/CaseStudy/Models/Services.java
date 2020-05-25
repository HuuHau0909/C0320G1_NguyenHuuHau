package CaseStudy.Models;



public abstract class Services {
    private String id;
    private String serviceName;
    private double area;
    private double cost;
    private int maxPeople;
    private String typeRent;


    public Services() {
    }

    public Services(String id, String serviceName, double area, double cost, int maxPeople, String typeRent) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getArea() {
        return area;
    }

    public double getCost() {
        return cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", typeRent=" + typeRent +
                '}';
    }

    public String showInfo() {
        return "ServicesInterface{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", typeRent=" + typeRent +
                '}';
    }
}
