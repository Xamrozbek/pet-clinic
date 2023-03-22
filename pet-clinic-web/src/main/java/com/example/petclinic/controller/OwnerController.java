package com.example.petclinic.controller;

import com.example.petclinic.Service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        var list = ownerService.fintAll().stream().sorted((a, b) -> a.getId() > b.getId() ? 1 : 0);
        model.addAttribute("owners", list);
        return "owner/index";
    }
}
