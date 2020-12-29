package pl.accounting.utilities.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String zipCode;
    private String city;


}
