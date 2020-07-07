package com.codegym.casestudymodule2javaweb.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(name = "name_employee")
    private String nameEmployee;

    @Column(name = "birthday_employee")
    private Date birthdayEmployee;

    @Column(name = "cmnd_employee")
    private long cmndEmployee;

    @Column(name = "phone_employee")
    private long phoneEmployee;

    @Column(name = "email_employee")
    private String emailEmployee;


    @Column(name = "level_employee")
    private String levelEmployee;


    @Column(name = "position_employee")
    private String positionEmployee;

    @Column(name = "department_employee")
    private String departmentEmployee;

    @Column(name = "salary_employee")
    private long salaryEmployee;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Contract> contractsEmployee;

    @Column(name = "isDelete")
    private Boolean isDelete = false;

    public List<Contract> getContractsEmployee() {
        return contractsEmployee;
    }

    public void setContractsEmployee(List<Contract> contractsEmployee) {
        this.contractsEmployee = contractsEmployee;
    }

    public Employee() {
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Date getBirthdayEmployee() {
        return birthdayEmployee;
    }

    public void setBirthdayEmployee(Date birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
    }

    public long getCmndEmployee() {
        return cmndEmployee;
    }

    public void setCmndEmployee(long cmndEmployee) {
        this.cmndEmployee = cmndEmployee;
    }

    public long getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(long phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public String getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(String departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    public long getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(long salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
