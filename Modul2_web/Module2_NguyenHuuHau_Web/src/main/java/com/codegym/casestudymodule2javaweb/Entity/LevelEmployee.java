//package com.codegym.casestudymodule2javaweb.Entity;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "level_employee")
//public class LevelEmployee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_level_employee")
//    private Long idLevel;
//
//    @Column(name = "level_employee")
//    private String levelEmployee;
//
//    @Column(name = "isDelete")
//    private Boolean isDelete=false;
//
//    @OneToMany(mappedBy = "levelEmployee",cascade = CascadeType.ALL)
//    private Set<Employee> employeesLevel;
//
//    public LevelEmployee() {
//    }
//
//    public Long getIdLevel() {
//        return idLevel;
//    }
//
//    public void setIdLevel(Long idLevel) {
//        this.idLevel = idLevel;
//    }
//
//    public String getLevelEmployee() {
//        return levelEmployee;
//    }
//
//    public void setLevelEmployee(String levelEmployee) {
//        this.levelEmployee = levelEmployee;
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
//    public Set<Employee> getEmployeesLevel() {
//        return employeesLevel;
//    }
//
//    public void setEmployeesLevel(Set<Employee> employeesLevel) {
//        this.employeesLevel = employeesLevel;
//    }
//}
