package com.codegym.casestudymodule2javaweb.Entity;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.Date;

import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract")
    private Long idContract;

    @Column(name = "start_day_contract")
    private Date startDayContract;

    @Column(name = "end_day_contract")
    private Date endDayContract;

    @Column(name = "deposit_contract")
    private double depositContract;

    @Column(name = "total_pay_contract")
    private double totalPayContract;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @Column(name = "isDelete")
    private Boolean isDelete = false;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL)
    private Set<ContractDetail> contractDetails;

    public Contract() {
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Long getIdContract() {
        return idContract;
    }

    public void setIdContract(Long idContract) {
        this.idContract = idContract;
    }

    public Date getStartDayContract() {
        return startDayContract;
    }

    public void setStartDayContract(Date startDayContract) {
        this.startDayContract = startDayContract;
    }

    public Date getEndDayContract() {
        return endDayContract;
    }

    public void setEndDayContract(Date endDayContract) {
        this.endDayContract = endDayContract;
    }

    public double getDepositContract() {
        return depositContract;
    }

    public void setDepositContract(double depositContract) {
        this.depositContract = depositContract;
    }

    public double getTotalPayContract() {
        return totalPayContract;
    }

    public void setTotalPayContract(double totalPayContract) {
        this.totalPayContract = totalPayContract;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
