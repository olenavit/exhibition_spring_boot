package ua.com.vitkovska.exhibition.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import ua.com.vitkovska.exhibition.entity.Exhibition;
import ua.com.vitkovska.exhibition.service.AssortmentService;
import ua.com.vitkovska.exhibition.service.CityService;
import ua.com.vitkovska.exhibition.service.ExhibitionService;
import ua.com.vitkovska.exhibition.service.OrganizationService;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/exhibitions")
public class ExhibitionController {

    private final ExhibitionService exhibitionService;
    private final CityService cityService;
    private final OrganizationService organizationService;
    private final AssortmentService assortmentService;

    public ExhibitionController(ExhibitionService exhibitionService, CityService cityService, OrganizationService organizationService, AssortmentService assortmentService) {
        this.exhibitionService = exhibitionService;
        this.cityService = cityService;
        this.organizationService = organizationService;
        this.assortmentService = assortmentService;
    }

    @GetMapping("/list")
    public String listExhibitions(Model model) {
        model.addAttribute("exhibitions", exhibitionService.findAll());
        return "exhibition/exhibitions-list";
    }


    @GetMapping("/show")
    public String getExhibition(@RequestParam("exhibitionId") int exhibitionId, Model model) {
        Optional<Exhibition> exhibition = exhibitionService.findById(exhibitionId);
        exhibition.ifPresent(value -> model.addAttribute("exhibition", value));
        model.addAttribute("assortment", assortmentService.findAllByExhibitionId(exhibitionId));
        return "exhibition/exhibition-page";
    }

    @GetMapping("/create")
    public String showFormForAdd(Model theModel) {
        theModel.addAttribute("exhibition", new Exhibition());
        theModel.addAttribute("cities", cityService.findAll());
        theModel.addAttribute("organizations", organizationService.findAll());
        return "exhibition/exhibition-form";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("exhibitionId") int exhibitionId, Model model) {
        model.addAttribute("exhibition", exhibitionService.findById(exhibitionId));
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("organizations", organizationService.findAll());
        return "exhibition/exhibition-form";

    }

    @PostMapping("/save")
    public String saveExhibition(@ModelAttribute("exhibition") @Valid Exhibition exhibition, Errors errors) {
        if (errors.hasErrors()) {
            return "exhibition/exhibition-form";
        } else {
            exhibitionService.save(exhibition);
            return "redirect:/exhibitions/list";
        }
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("exhibitionId") int exhibitionId) {
        exhibitionService.deleteById(exhibitionId);
        return "redirect:/exhibitions/list";

    }

    @GetMapping("/search")
    public String delete(@RequestParam("exhibitionName") String name, Model model) {
        model.addAttribute("exhibitions", exhibitionService.searchByName(name));
        return "exhibition/exhibitions-list";

    }

}