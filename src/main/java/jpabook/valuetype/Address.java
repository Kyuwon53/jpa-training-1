package jpabook.valuetype;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {
    @Column(name = "city")
    private String city;
    private String street;
    private String state;
    @Embedded
    private Zipcode zipcode;

    public Address() {
    }

    public Address(String city, String street, String state, Zipcode zipcode) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Zipcode getZipcode() {
        return zipcode;
    }
}
