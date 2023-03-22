package com.example.petclinic.controller;

import com.example.petclinic.Service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model) {
        var list = vetService.findAll().stream()
                .sorted((a, b) -> a.getId() > b.getId() ? 1 : 0);
        model.addAttribute("vets", list);
        return "vet/index";
    }
}
