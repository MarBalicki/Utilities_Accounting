package pl.accounting.utilities.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Owner {

    @Embedded
    private Person owner;


}
