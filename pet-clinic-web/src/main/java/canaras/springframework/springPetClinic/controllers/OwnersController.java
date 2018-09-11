package canaras.springframework.springPetClinic.controllers;

import canaras.springframework.springPetClinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

    @RequestMapping({"","/index.html","/index"})
    public String listOwners(){
        return "owners/index";
    }
}
