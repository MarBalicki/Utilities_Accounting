package pl.accounting.utilities.model;

import pl.accounting.utilities.dto.OwnerDto;

import javax.persistence.Embeddable;

@Embeddable
public class Owner extends Person {

    public static Owner apply(OwnerDto ownerDto) {
        Owner owner = new Owner();
        owner.setFirstName(owner.getFirstName());
        owner.setLastName(ownerDto.getLastName());
        owner.setPhoneNumber(ownerDto.getPhoneNumber());
        return owner;
    }
}
