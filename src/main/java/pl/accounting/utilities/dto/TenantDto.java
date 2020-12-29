package pl.accounting.utilities.dto;

import pl.accounting.utilities.model.Tenant;

public class TenantDto {

    private Long id;
    private String propertyName;
    private String tenantFirstName;
    private String tenantLastName;
    private String tenantPhoneNumber;
    private String leaseStart;
    private String leaseEnd;
    private boolean current;


    public static TenantDto apply(Tenant tenant) {
        TenantDto tenantDto = new TenantDto();
        tenantDto.setId(tenant.getId());
        tenantDto.setPropertyName(tenant.getProperty().getName());
        tenantDto.setTenantFirstName(tenant.getFirstName());
        tenantDto.setTenantLastName(tenant.getLastName());
        tenantDto.setTenantPhoneNumber(tenant.getPhoneNumber());
        tenantDto.setLeaseStart(String.valueOf(tenant.getLeaseStart()));
        tenantDto.setLeaseEnd(String.valueOf(tenant.getLeaseEnd()));
        tenantDto.setCurrent(tenant.isCurrent());
        return tenantDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getTenantFirstName() {
        return tenantFirstName;
    }

    public void setTenantFirstName(String tenantFirstName) {
        this.tenantFirstName = tenantFirstName;
    }

    public String getTenantLastName() {
        return tenantLastName;
    }

    public void setTenantLastName(String tenantLastName) {
        this.tenantLastName = tenantLastName;
    }

    public String getTenantPhoneNumber() {
        return tenantPhoneNumber;
    }

    public void setTenantPhoneNumber(String tenantPhoneNumber) {
        this.tenantPhoneNumber = tenantPhoneNumber;
    }

    public String getLeaseStart() {
        return leaseStart;
    }

    public void setLeaseStart(String leaseStart) {
        this.leaseStart = leaseStart;
    }

    public String getLeaseEnd() {
        return leaseEnd;
    }

    public void setLeaseEnd(String leaseEnd) {
        this.leaseEnd = leaseEnd;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }
}
