package Models;

import Models.Services;

public class Customer {
    private String fullName;
    private String birthday;
    private String gender;
    private String ID;
    private String phone;
    private String email;
    private String customerType;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer(String fullName, String birthday, String gender, String ID, String phone, String email, String customerType, String address, Services services) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.ID = ID;
        this.phone = phone;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.services = services;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public void showInfo() {
        System.out.println(
                "Full Name: " + fullName +
                        "\nBirthday: " + birthday +
                        "\nGender: " + gender +
                        "\nCustomer ID: " + ID +
                        "\nPhone Number: " + phone +
                        "\nEmail: " + email +
                        "\nType Customer: " + customerType +
                        "\nAddress: " + address
        );
    }
}
