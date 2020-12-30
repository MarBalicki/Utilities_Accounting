package pl.accounting.utilities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.dto.UtilitiesDto;
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

    @GetMapping("/tenant/{id}/addUtilities")
    public ModelAndView addUtilitiesToTenant(@PathVariable("id") Long tenantId) {
        //todo if is in null then have to pick tenant
        ModelAndView mav = new ModelAndView("addUtilities");
        mav.addObject("newUtilities", new UtilitiesDto());
        mav.addObject("tenantId", tenantId);
        return mav;
    }


    @PostMapping("/tenant/{id}/addUtilities")
    public RedirectView addUtilitiesToTenant(@PathVariable("id") Long tenantId,
                                            @ModelAttribute("newUtilities") UtilitiesDto utilitiesDto) {
        tenantService.addUtilitiesToTenant(utilitiesDto, tenantId);
        return new RedirectView("utilities");
    }



}
