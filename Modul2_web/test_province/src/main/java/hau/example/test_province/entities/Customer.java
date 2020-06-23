package hau.example.test_province.entities;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First Name not blank")
    @Size(min = 2,max = 8,message = "min 0 and max 8")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "First Name not blank")
    @Size(min = 2,max = 10,message = "min 0 and max 10")
    @Column(name = "last_Name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    @Column(name = "isDelete")
    private Boolean isDelete = false;

    public Customer() {
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
