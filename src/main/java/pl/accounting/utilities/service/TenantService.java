package pl.accounting.utilities.service;

import org.springframework.stereotype.Service;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.dto.UtilitiesDto;
import pl.accounting.utilities.model.Tenant;
import pl.accounting.utilities.model.Utilities;
import pl.accounting.utilities.repository.TenantRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TenantService {

    private final TenantRepository tenantRepository;

    public TenantService(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    public List<TenantDto> getAllTenantsByPropertyId(Long propertyId) {
        return tenantRepository.findAllByPropertyId(propertyId)
                .stream()
                .map(TenantDto::apply)
                .collect(Collectors.toList());
    }

    public List<TenantDto> getAllTenants() {
        return tenantRepository.findAll()
                .stream()
                .map(TenantDto::apply)
                .collect(Collectors.toList());
    }

    public void addUtilitiesToTenant(UtilitiesDto utilitiesDto, Long tenantId) {
        if (!utilitiesDto.getHeatingQuantity().equals("")) {
            //todo check if there is previous quantity and if so
            // (current quantity - previous quantity - sum(predicted months) * stake) = upgrade heating balance
        }
        Utilities utilities = Utilities.apply(utilitiesDto);
        Optional<Tenant> tenantOptional = tenantRepository.findById(tenantId);
        if (tenantOptional.isPresent()) {
            Tenant tenant = tenantOptional.get();
            tenant.addUtilities(utilities);
            tenantRepository.save(tenant);
        }
    }
}
