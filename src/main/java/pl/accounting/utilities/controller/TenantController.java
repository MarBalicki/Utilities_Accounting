package pl.accounting.utilities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.service.TenantService;

import java.util.List;

@Controller
public class TenantController {

    private final TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @GetMapping("/tenants")
    public ModelAndView allTenants() {
        ModelAndView mav = new ModelAndView("tenants");
        List<TenantDto> allTenants = tenantService.getAllTenants();
        mav.addObject("allTenants", allTenants);
        return mav;
    }

    @GetMapping("/property/{id}/tenants")
    public ModelAndView allPropertyTenants(@PathVariable("id") Long propertyId) {
        ModelAndView mav = new ModelAndView("tenants");
        List<TenantDto> allTenantsOfCurrentProperty = tenantService.getAllTenantsByPropertyId(propertyId);
        mav.addObject("allTenants", allTenantsOfCurrentProperty);
        mav.addObject("propertyId", propertyId);
        return mav;
    }



}
