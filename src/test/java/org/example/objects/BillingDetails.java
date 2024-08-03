package org.example.objects;

public class BillingDetails {
    private String firstname;
    private String lastname;
    private String country;
    private String address_line1;
    private String city;
    private String state;
    private String zip;
    private String email;

    public BillingDetails(String firstname, String lastname, String address_line1, String city, String zip, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address_line1 = address_line1;
        this.city = city;
        this.zip = zip;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
