package pl.accounting.utilities.model;

import pl.accounting.utilities.dto.AddressDto;
import pl.accounting.utilities.dto.OwnerDto;
import pl.accounting.utilities.dto.PropertyDto;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    private String name;
    @Embedded
    private Address address;
    @Embedded
    private Owner owner;
    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Tenant> tenants = new HashSet<>();

    public static Property apply(PropertyDto propertyDto) {
        Property property = new Property();
        property.id = propertyDto.getId();
        property.name = propertyDto.getName();
        property.address = Address
                .apply(new AddressDto(propertyDto.getStreet(),
                        propertyDto.getCity(), propertyDto.getZipCode()));
        property.owner = Owner
                .apply(new OwnerDto(propertyDto.getOwnerFirstName(),
                        propertyDto.getOwnerLastName(),
                        propertyDto.getOwnerPhoneNumber()));
        return property;
    }

    public void addTenant(Tenant tenant) {
        tenants.add(tenant);
        tenant.setProperty(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Set<Tenant> getTenants() {
        return tenants;
    }

    public void setTenants(Set<Tenant> tenants) {
        this.tenants = tenants;
    }
}
