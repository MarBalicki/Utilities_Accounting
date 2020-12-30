package pl.accounting.utilities.model;

import pl.accounting.utilities.dto.TenantDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Tenant extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Property property;
    private LocalDate leaseStart;
    private LocalDate leaseEnd;
    private boolean current = true;
    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Utilities> utilitiesSet;

    public static Tenant apply(TenantDto tenantDto) {
        Tenant tenant = new Tenant();
        tenant.firstName = tenantDto.getTenantFirstName();
        tenant.lastName = tenantDto.getTenantLastName();
        tenant.phoneNumber = tenantDto.getTenantPhoneNumber();
        tenant.leaseStart = LocalDate.parse(tenantDto.getLeaseStart());
        if (!tenantDto.getLeaseEnd().equals("")) {
            tenant.leaseEnd = LocalDate.parse(tenantDto.getLeaseEnd());
            tenant.current = false;
        }
        return tenant;
    }

    public void addUtilities(Utilities utilities) {
        utilitiesSet.add(utilities);
        utilities.setTenant(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public LocalDate getLeaseStart() {
        return leaseStart;
    }

    public void setLeaseStart(LocalDate leaseStart) {
        this.leaseStart = leaseStart;
    }

    public LocalDate getLeaseEnd() {
        return leaseEnd;
    }

    public void setLeaseEnd(LocalDate leaseEnd) {
        this.leaseEnd = leaseEnd;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public Set<Utilities> getUtilitiesSet() {
        return utilitiesSet;
    }

    public void setUtilitiesSet(Set<Utilities> utilitiesSet) {
        this.utilitiesSet = utilitiesSet;
    }

}
