package com.app.pokedex.controllers;

import java.util.ArrayList;
import java.util.List;

import com.app.pokedex.models.Pokedex;
import com.app.pokedex.service.PokedexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokedexController {

    @Autowired
    PokedexService pokedexService;
    
    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "World", required= true) String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
    @GetMapping("/")
    public String getPokedex(Model model){
        Pokedex  pokedex = pokedexService.getPokedex(0);
        // List<String> asd = new ArrayList();
        // asd.add("asdasd");
        // asd.add("qweqwe");
        // String[] hola = {"asdasd", "qweqwe"};
        model.addAttribute("productList", "asd");
        return "index";

    }
}
