package pl.accounting.utilities.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

    private String firstName;
    private String lastName;
    private String phoneNumber;

}
