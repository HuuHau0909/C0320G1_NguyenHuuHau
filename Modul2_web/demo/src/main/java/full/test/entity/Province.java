package full.test.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "province")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_province")
    private String nameProvince;

    @Column(name = "isDelete")
    private Long isDelete;

//    @OneToMany(mappedBy = "province_id")
//    private Set<Customer> customers;

    @OneToMany(targetEntity = Customer.class, cascade = ALL)
    private List<Customer> employees;

    public List<Customer> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Customer> employees) {
        this.employees = employees;
    }

    public Province() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }


}
