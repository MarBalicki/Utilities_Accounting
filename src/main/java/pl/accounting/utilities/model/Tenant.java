package pl.accounting.utilities.model;

import pl.accounting.utilities.dto.TenantDto;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Set;

@Entity
public class Tenant extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Property property;
    private SimpleDateFormat leaseStart;
    private SimpleDateFormat leaseEnd;
    private boolean current;
    @OneToMany(mappedBy = "tenant", fetch = FetchType.LAZY)
    private Set<Utilities> utilitiesSet;

    public static Tenant apply(TenantDto tenantDto) {
        Tenant tenant = new Tenant();
        tenant.firstName = tenantDto.getTenantFirstName();
        tenant.lastName = tenantDto.getTenantLastName();
        tenant.phoneNumber = tenantDto.getTenantPhoneNumber();
//        tenant.leaseStart = new SimpleDateFormat(tenantDto.getLeaseStart());
//        tenant.leaseEnd = new SimpleDateFormat(tenantDto.getLeaseEnd());
        return tenant;
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

    public SimpleDateFormat getLeaseStart() {
        return leaseStart;
    }

    public void setLeaseStart(SimpleDateFormat leaseStart) {
        this.leaseStart = leaseStart;
    }

    public SimpleDateFormat getLeaseEnd() {
        return leaseEnd;
    }

    public void setLeaseEnd(SimpleDateFormat leaseEnd) {
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
