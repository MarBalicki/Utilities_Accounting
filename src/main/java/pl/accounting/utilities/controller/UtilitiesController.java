package pl.accounting.utilities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.dto.UtilitiesDto;
import pl.accounting.utilities.service.UtilitiesService;

import java.util.List;

@Controller
public class UtilitiesController {

    private final UtilitiesService utilitiesService;

    public UtilitiesController(UtilitiesService utilitiesService) {
        this.utilitiesService = utilitiesService;
    }

    @GetMapping("/utilities")
    public ModelAndView allUtilities() {
        ModelAndView mav = new ModelAndView("utilities");
        List<UtilitiesDto> allUtilities = utilitiesService.getAllUtilities();
        mav.addObject("allUtilities", allUtilities);
        return mav;
    }

    @GetMapping("/tenant/{id}/utilities")
    public ModelAndView allTenantUtilities(@PathVariable("id") Long tenantId) {
        ModelAndView mav = new ModelAndView("utilities");
        List<UtilitiesDto> allUtilitiesOfCurrentTenant = utilitiesService.getAllUtilitiesByTenantId(tenantId);
        mav.addObject("allUtilities", allUtilitiesOfCurrentTenant);
        mav.addObject("tenantId", tenantId);
        return mav;
    }
}
