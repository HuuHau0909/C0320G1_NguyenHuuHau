package com.codegym.casestudymodule2javaweb.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @Column(name = "id_service")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;

    @Column(name = "name_service")
    private String nameService;

    @Column(name = "area_service")
    private double areaService;

    @Column(name = "rent_cost_service")
    private double rentCostService;

    @Column(name = "max_people_service")
    private long maxPeopleService;

    @ManyToOne
    @JoinColumn(name = "type_rent_service")
    private TypeRent typeRent;

    @Column(name = "standard_service")
    private String standardService;

//    @Column(name = "convenient_service")
//    private String convenientService;

    @Column(name = "pool_area_service")
    private double poolAreaService;

    @Column(name = "number_floor_service")
    private int numberFloorService;

    @Column(name = "free_include_service")
    private String freeIncludeService;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<Contract> contractsService;


//    @Column(name = "isDelete")
//    private Boolean isDelete = false;

    public List<Contract> getContractsService() {
        return contractsService;
    }

    public void setContractsService(List<Contract> contractsService) {
        this.contractsService = contractsService;
    }

//    public Boolean getDelete() {
//        return isDelete;
//    }
//
//    public void setDelete(Boolean delete) {
//        isDelete = delete;
//    }

    public Service() {
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaService() {
        return areaService;
    }

    public void setAreaService(double areaService) {
        this.areaService = areaService;
    }

    public double getRentCostService() {
        return rentCostService;
    }

    public void setRentCostService(double rentCostService) {
        this.rentCostService = rentCostService;
    }

    public long getMaxPeopleService() {
        return maxPeopleService;
    }

    public void setMaxPeopleService(long maxPeopleService) {
        this.maxPeopleService = maxPeopleService;
    }

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public String getStandardService() {
        return standardService;
    }

    public void setStandardService(String standardService) {
        this.standardService = standardService;
    }

//    public String getConvenientService() {
//        return convenientService;
//    }
//
//    public void setConvenientService(String convenientService) {
//        this.convenientService = convenientService;
//    }

    public double getPoolAreaService() {
        return poolAreaService;
    }

    public void setPoolAreaService(double poolAreaService) {
        this.poolAreaService = poolAreaService;
    }

    public int getNumberFloorService() {
        return numberFloorService;
    }

    public void setNumberFloorService(int numberFloorService) {
        this.numberFloorService = numberFloorService;
    }

    public String getFreeIncludeService() {
        return freeIncludeService;
    }

    public void setFreeIncludeService(String freeIncludeService) {
        this.freeIncludeService = freeIncludeService;
    }
}
