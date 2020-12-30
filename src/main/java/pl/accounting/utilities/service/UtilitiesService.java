package pl.accounting.utilities.service;

import org.springframework.stereotype.Service;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.dto.UtilitiesDto;
import pl.accounting.utilities.repository.UtilitiesRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtilitiesService {

    private final UtilitiesRepository utilitiesRepository;

    public UtilitiesService(UtilitiesRepository utilitiesRepository) {
        this.utilitiesRepository = utilitiesRepository;
    }

    public List<UtilitiesDto> getAllUtilities() {
        return utilitiesRepository.findAll()
                .stream()
                .map(UtilitiesDto::apply)
                .collect(Collectors.toList());
    }

    public List<UtilitiesDto> getAllUtilitiesByTenantId(Long tenantId) {
        return utilitiesRepository.findAllByTenantId(tenantId)
                .stream()
                .map(UtilitiesDto::apply)
                .collect(Collectors.toList());
    }
}
