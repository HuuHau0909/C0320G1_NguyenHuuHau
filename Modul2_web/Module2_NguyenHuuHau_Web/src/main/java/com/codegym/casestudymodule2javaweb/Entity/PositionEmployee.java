//package com.codegym.casestudymodule2javaweb.Entity;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "position_employee")
//public class PositionEmployee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_position_employee")
//    private Long idPosition;
//
//    @Column(name = "position_employee")
//    private String positionEmployee;
//
//    @Column(name = "isDelete")
//    private Boolean isDelete=false;
//
//    @OneToMany(mappedBy = "positionEmployee",cascade = CascadeType.ALL)
//    private Set<Employee> employeesPosition;
//
//    public PositionEmployee() {
//    }
//
//    public Long getId() {
//        return idPosition;
//    }
//
//    public void setId(Long id) {
//        this.idPosition = id;
//    }
//
//    public String getLevelEmployee() {
//        return positionEmployee;
//    }
//
//    public void setLevelEmployee(String levelEmployee) {
//        this.positionEmployee = levelEmployee;
//    }
//
//    public Boolean getDelete() {
//        return isDelete;
//    }
//
//    public void setDelete(Boolean delete) {
//        isDelete = delete;
//    }
//
//    public Set<Employee> getEmployeesPosition() {
//        return employeesPosition;
//    }
//
//    public void setEmployeesPosition(Set<Employee> employeesPosition) {
//        this.employeesPosition = employeesPosition;
//    }
//}
