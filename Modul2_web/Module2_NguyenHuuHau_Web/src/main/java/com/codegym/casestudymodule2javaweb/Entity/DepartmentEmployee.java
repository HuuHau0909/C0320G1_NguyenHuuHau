//package com.codegym.casestudymodule2javaweb.Entity;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "department_employee")
//public class DepartmentEmployee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_department_employee")
//    private Long idDepartment;
//
//    @Column(name = "department_employee")
//    private String departmentEmployee;
//
//    @Column(name = "isDelete")
//    private Boolean isDelete = false;
//
//    @OneToMany(mappedBy = "departmentEmployee", cascade = CascadeType.ALL)
//    private Set<Employee> employeesDepartment;
//
//    public DepartmentEmployee() {
//    }
//
//    public Long getIdDepartment() {
//        return idDepartment;
//    }
//
//    public void setIdDepartment(Long idDepartment) {
//        this.idDepartment = idDepartment;
//    }
//
//    public String getDepartmentEmployee() {
//        return departmentEmployee;
//    }
//
//    public void setDepartmentEmployee(String departmentEmployee) {
//        this.departmentEmployee = departmentEmployee;
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
//    public Set<Employee> getEmployeesDepartment() {
//        return employeesDepartment;
//    }
//
//    public void setEmployeesDepartment(Set<Employee> employeesDepartment) {
//        this.employeesDepartment = employeesDepartment;
//    }
//}
