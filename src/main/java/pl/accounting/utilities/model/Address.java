package pl.accounting.utilities.model;

import pl.accounting.utilities.dto.AddressDto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String zipCode;
    private String city;

    public static Address apply(AddressDto addressDto) {
        Address address = new Address();
        address.street = addressDto.getStreet();
        address.city = addressDto.getCity();
        address.zipCode = addressDto.getZipCode();
        return address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
