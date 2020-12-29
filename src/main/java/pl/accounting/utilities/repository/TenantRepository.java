package pl.accounting.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.accounting.utilities.model.Tenant;

import java.util.List;

public interface TenantRepository extends JpaRepository<Tenant, Long> {

    List<Tenant> findAllByPropertyId(Long propertyId);
}
