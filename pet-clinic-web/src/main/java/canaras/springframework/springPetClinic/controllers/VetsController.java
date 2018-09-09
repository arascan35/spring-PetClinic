package canaras.springframework.springPetClinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"/vets/index","/vets","/vets/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
