package ua.com.vitkovska.exhibition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.vitkovska.exhibition.entity.Organization;
import ua.com.vitkovska.exhibition.service.AssortmentService;
import ua.com.vitkovska.exhibition.service.CityService;
import ua.com.vitkovska.exhibition.service.OrganizationService;

import javax.validation.Valid;
import java.util.Optional;


@Controller
@RequestMapping("/organizations")
public class OrganizationController {


    private final OrganizationService organizationService;
    private final AssortmentService assortmentService;
    private final CityService cityService;

    @Autowired
    public OrganizationController(OrganizationService organizationService, AssortmentService assortmentService, CityService cityService) {
        this.organizationService = organizationService;
        this.assortmentService = assortmentService;
        this.cityService = cityService;
    }

    @GetMapping("/organization")
    public String getOrganizationPage(@RequestParam("organizationId") int organizationId, Model model) {
        Optional<Organization> organization = organizationService.findById(organizationId);
        organization.ifPresent(value -> model.addAttribute("organization", organization.get()));
        model.addAttribute("assortment", assortmentService.findAllByOrganizationId(organizationId));
        return "organization/organization-page";
    }

    @GetMapping("/create")
    public String showFormForAdd(Model theModel) {
        theModel.addAttribute("organization", new Organization());
        theModel.addAttribute("cities", cityService.findAll());
        return "organization/organization-form";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("organizationId") int organizationId, Model theModel) {
        theModel.addAttribute("organization", organizationService.findById(organizationId));
        theModel.addAttribute("cities", cityService.findAll());
        return "organization/organization-form";

    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("organization")@Valid Organization organization, Errors errors) {
        if (errors.hasErrors()) {
            return "organization/organization-form";
        } else {
            organizationService.save(organization);
            return "redirect:/exhibitions/list";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("organizationId") int organizationId) {
        organizationService.deleteById(organizationId);
        return "redirect:/exhibitions/list";

    }
}
