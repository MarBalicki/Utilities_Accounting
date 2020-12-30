package pl.accounting.utilities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pl.accounting.utilities.dto.PropertyDto;
import pl.accounting.utilities.dto.TenantDto;
import pl.accounting.utilities.service.PropertyService;

import java.text.ParseException;
import java.util.List;

@Controller
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/addProperty")
    public ModelAndView addProperty() {
        ModelAndView mav = new ModelAndView("addProperty");
        mav.addObject("newProperty", new PropertyDto());
        return mav;
    }

    @PostMapping("/addProperty")
    public RedirectView addProperty(@ModelAttribute("newProperty") PropertyDto propertyDto, Model model) {
        model.addAttribute("newProperty", propertyDto);//check if can be remove
        propertyService.addProperty(propertyDto);
        return new RedirectView("properties");
    }

    @GetMapping("/properties")
    public ModelAndView allProperties() {
        ModelAndView mav = new ModelAndView("properties");
        List<PropertyDto> properties = propertyService.getAllProperties();
        mav.addObject("properties", properties);
        return mav;
    }

    @GetMapping("/property/{id}/addTenant")
    public ModelAndView addTenantToProperty(@PathVariable("id") Long propertyId) {
        //todo if is in null then have to pick property
        ModelAndView mav = new ModelAndView("addTenant");
        mav.addObject("newTenant", new TenantDto());
        mav.addObject("propertyId", propertyId);
        return mav;
    }

    @PostMapping("/property/{id}/addTenant")
    public RedirectView addTenantToProperty(@PathVariable("id") Long propertyId,
                                            @ModelAttribute("newTenant") TenantDto tenantDto) {
        propertyService.addTenantToProperty(tenantDto, propertyId);
        return new RedirectView("tenants");
    }

}
