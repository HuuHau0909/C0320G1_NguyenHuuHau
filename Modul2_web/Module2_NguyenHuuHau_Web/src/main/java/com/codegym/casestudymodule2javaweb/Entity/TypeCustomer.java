//package com.codegym.casestudymodule2javaweb.Entity;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "type_customer")
//public class TypeCustomer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_type_customer")
//    private Long idTypeCustomer;
//
//    @Column(name = "type_customer")
//    private String typeCustomer;
//
//    @OneToMany(mappedBy = "typeCustomer",cascade = CascadeType.ALL)
//    private Set<Customer> customersType;
//
//    public TypeCustomer() {
//    }
//
//    public Long getTypeCustomerId() {
//        return idTypeCustomer;
//    }
//
//    public void setTypeCustomerId(Long typeCustomerId) {
//        this.idTypeCustomer = typeCustomerId;
//    }
//
//    public String getTypeCustomer() {
//        return typeCustomer;
//    }
//
//    public void setTypeCustomer(String typeCustomer) {
//        this.typeCustomer = typeCustomer;
//    }
//
//
//    public Set<Customer> getCustomersType() {
//        return customersType;
//    }
//
//    public void setCustomersType(Set<Customer> customersType) {
//        this.customersType = customersType;
//    }
//}
