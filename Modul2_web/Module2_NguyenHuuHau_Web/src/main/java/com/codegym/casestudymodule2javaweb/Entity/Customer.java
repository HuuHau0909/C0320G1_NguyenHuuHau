package com.codegym.casestudymodule2javaweb.Entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "name_customer")
    @NotBlank(message = "Name not empty")
    @Size(min = 2, max = 30, message = "Length from 2 to 30 character")
    private String nameCustomer;

    @Column(name = "birthday_customer")
    private Date birthdayCustomer;

    @Column(name = "gender_customer")
    private String genderCustomer;

    @Column(name = "cmnd_customer")
    @Min(value = 2, message = "must more than 2")
    private long cmndCustomer;

    @Column(name = "phone_customer")
    private long phoneCustomer;

    @Column(name = "email_customer")
    private String emailCustomer;

    @Column(name = "type_customer")
    private String typeCustomer;

    @Column(name = "address_customer")
    private String addressCustomer;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Contract> contractsCustomer;

    @Column(name = "isDelete")
    private Boolean isDelete = false;

    public Customer() {
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Date getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(Date birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

//    public long getCmndCustomer() {
//        return cmndCustomer;
//    }
//
//    public void setCmndCustomer(long cmndCustomer) {
//        this.cmndCustomer = cmndCustomer;
//    }

    public long getCmndCustomer() {
        return cmndCustomer;
    }

    public void setCmndCustomer(long cmndCustomer) {
        this.cmndCustomer = cmndCustomer;
    }

    public long getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(long phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Set<Contract> getContractsCustomer() {
        return contractsCustomer;
    }

    public void setContractsCustomer(Set<Contract> contractsCustomer) {
        this.contractsCustomer = contractsCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Set<Contract> getContracts() {
        return contractsCustomer;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contractsCustomer = contracts;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
