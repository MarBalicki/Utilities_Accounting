package pl.accounting.utilities.service;

import org.springframework.stereotype.Service;
import pl.accounting.utilities.dto.PropertyDto;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.model.Property;
import pl.accounting.utilities.model.Tenant;
import pl.accounting.utilities.repository.PropertyRepository;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public void addProperty(PropertyDto propertyDto) {
        Property property = Property.apply(propertyDto);
        propertyRepository.save(property);
    }

    public List<PropertyDto> getAllProperties() {
        return propertyRepository
                .findAll()
                .stream()
                .map(PropertyDto::apply)
                .collect(Collectors.toList());
    }

    public void addTenantToProperty(TenantDto tenantDto, Long propertyId) {
        Tenant tenant = Tenant.apply(tenantDto);
        Optional<Property> propertyOptional = propertyRepository.findById(propertyId);
        if (propertyOptional.isPresent()) {
            Property property = propertyOptional.get();
            property.addTenant(tenant);
            propertyRepository.save(property);
        }
    }
}
