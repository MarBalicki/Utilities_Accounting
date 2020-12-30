package pl.accounting.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.accounting.utilities.model.Utilities;

import java.util.List;

@Repository
public interface UtilitiesRepository extends JpaRepository<Utilities, Long> {

    List<Utilities> findAllByTenantId(Long tenantId);
}
