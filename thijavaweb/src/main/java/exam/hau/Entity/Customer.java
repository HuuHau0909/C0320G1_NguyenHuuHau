package exam.hau.Entity;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "id_customer")
    private String idCustomer;

    @Column(name = "name_customer")
//    @NotBlank(message = "Name not empty")
//    @Size(min = 2, max = 30, message = "Length from 2 to 30 character")
    private String nameCustomer;

    @Column(name = "birthday_customer")
    private Date birthdayCustomer;

    @Column(name = "gender_customer")
    private String genderCustomer;

    @Column(name = "cmnd_customer")
//    @Min(value = 2, message = "must more than 2")
    private long cmndCustomer;

    @Column(name = "phone_customer")
    private long phoneCustomer;

    @Column(name = "email_customer")
    private String emailCustomer;

    @Column(name = "type_customer")
    private String typeCustomer;

    @Column(name = "address_customer")
    private String addressCustomer;

    public Customer() {
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
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

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }
}
