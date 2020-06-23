package com.codegym.casestudymodule2javaweb.Entity;

public class Employee {
    private String serviceName;
    private Double useArea;
    private Double rentCost;
    private Integer maxNumber;
    private String typerent;

    public Employee() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUseArea() {
        return useArea;
    }

    public void setUseArea(Double useArea) {
        this.useArea = useArea;
    }

    public Double getRentCost() {
        return rentCost;
    }

    public void setRentCost(Double rentCost) {
        this.rentCost = rentCost;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getTyperent() {
        return typerent;
    }

    public void setTyperent(String typerent) {
        this.typerent = typerent;
    }
}
