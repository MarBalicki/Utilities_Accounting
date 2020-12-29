package pl.accounting.utilities.service;

import org.springframework.stereotype.Service;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.repository.TenantRepository;

import java.util.List;
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

}
