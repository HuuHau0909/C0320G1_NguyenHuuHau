package hau.example.test_province.entities;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First Name not blank")
    @Size(min = 2, max = 8, message = "min 0 and max 8")
    @Column(name = "first_name")
    private String firstName;


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

    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        String firstName = customer.getFirstName();
        if (firstName==null){
            errors.rejectValue("firstName","customer.firstname.empty");
        }
//       else if(firstName.length()<2||firstName.length()>10){
//            errors.rejectValue();
//        }
    }
}
