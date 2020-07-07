package com.codegym.casestudymodule2javaweb.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accompanied_service")
public class AccompaniedService {
    @Id
    @Column(name = "id_accompanied_service")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_accompanied_service")
    private String nameAccompaniedService;

    @Column(name = "unit_accompanied_service")
    private String unitAccompaniedService;

    @Column(name = "price_accompanied_service")
    private double priceAccompaniedService;

    @OneToMany(mappedBy = "accompaniedService", cascade = CascadeType.ALL)
    private Set<ContractDetail> contractDetails;

    public AccompaniedService() {
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAccompaniedService() {
        return nameAccompaniedService;
    }

    public void setNameAccompaniedService(String nameAccompaniedService) {
        this.nameAccompaniedService = nameAccompaniedService;
    }

    public String getUnitAccompaniedService() {
        return unitAccompaniedService;
    }

    public void setUnitAccompaniedService(String unitAccompaniedService) {
        this.unitAccompaniedService = unitAccompaniedService;
    }

    public double getPriceAccompaniedService() {
        return priceAccompaniedService;
    }

    public void setPriceAccompaniedService(double priceAccompaniedService) {
        this.priceAccompaniedService = priceAccompaniedService;
    }
}
