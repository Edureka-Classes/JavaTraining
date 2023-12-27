package co.edureka.entity.HQL_ONE2ONEMAPPING;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    private String city;
    private String state;

    public Address () {
    }

    public Address (String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Integer getAddressId () {
        return this.addressId;
    }

    public void setAddressId (Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet () {
        return this.street;
    }

    public void setStreet (String street) {
        this.street = street;
    }

    public String getCity () {
        return this.city;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCountry () {
        return this.state;
    }

    public void setCountry ( String state) {
        this.state = state;
    }

    @Override
    public String toString () {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}
