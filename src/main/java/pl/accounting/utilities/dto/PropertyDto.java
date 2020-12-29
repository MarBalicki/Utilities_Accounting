package pl.accounting.utilities.dto;

import pl.accounting.utilities.model.Property;

public class PropertyDto {

    private Long id;
    private String name;
    private String street;
    private String zipCode;
    private String city;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerPhoneNumber;

    public PropertyDto() {
    }

    public PropertyDto(String name, String street, String zipCode, String city,
                       String ownerFirstName, String ownerLastName, String ownerPhoneNumber) {
//        this.id = id;
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public static PropertyDto apply(Property property) {
        PropertyDto propertyDto = new PropertyDto();
        propertyDto.setId(property.getId());
        propertyDto.setName(property.getName());
        propertyDto.setStreet(property.getAddress().getStreet());
        propertyDto.setCity(property.getAddress().getCity());
        propertyDto.setZipCode(property.getAddress().getZipCode());
        propertyDto.setOwnerFirstName(property.getOwner().getFirstName());
        propertyDto.setOwnerLastName(property.getOwner().getLastName());
        propertyDto.setOwnerPhoneNumber(property.getOwner().getPhoneNumber());
        return propertyDto;
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

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }
}
