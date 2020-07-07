package com.codegym.casestudymodule2javaweb.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_rent")
public class TypeRent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_rent")
    private Long idTypeRent;

    @Column(name = "name_type_rent")
    private String nameTypeRent;

    @Column(name = "type_rent_discount")
    private double discountTypeRent;

    @Column(name = "isDelete")
    private Boolean isDelete = false;

    @OneToMany(mappedBy = "typeRent", cascade = CascadeType.ALL)
    private List<Service> servicesTypeRent;

    public TypeRent() {
    }

    public Long getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(Long idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public String getNameTypeRent() {
        return nameTypeRent;
    }

    public void setNameTypeRent(String nameTypeRent) {
        this.nameTypeRent = nameTypeRent;
    }

    public double getPriceTypeRent() {
        return discountTypeRent;
    }

    public void setPriceTypeRent(double priceTypeRent) {
        this.discountTypeRent = priceTypeRent;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public List<Service> getServices() {
        return servicesTypeRent;
    }

    public void setServices(List<Service> services) {
        this.servicesTypeRent = services;
    }
}
