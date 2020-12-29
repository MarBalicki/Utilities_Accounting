package pl.accounting.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.accounting.utilities.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {


}
