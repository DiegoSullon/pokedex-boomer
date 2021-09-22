package com.app.pokedex.controllers;

import com.app.pokedex.models.Pokedex;
import com.app.pokedex.models.Pokemon;
import com.app.pokedex.service.PokedexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokedexController {

    @Autowired
    PokedexService pokedexService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("page", 0);
        return "redirect:/0";
    }

    @GetMapping("/{page}")
    public String getPokedex(@PathVariable("page") int page, Model model){
        Pokedex  pokedex = pokedexService.getPokedex(page);
        int totalPages = pokedex.getCount()/20;
        if(page>totalPages || page<0){
            return "redirect:/0";
        }
        model.addAttribute("page", page);
        model.addAttribute("pokemonList", pokedex.getResults());
        return "index";
    }
    @GetMapping("/pokemon/{id}")
    public String getPokemon(@PathVariable("id") String id, Model model){
        Pokemon  pokemon = pokedexService.getPokemon(id);
        model.addAttribute("pokemon", pokemon);
        return "pokemon";
    }
    @GetMapping("/pokemon/")
    public String getPokemonId(@RequestParam( value = "url", defaultValue = "https://pokeapi.co/api/v2/pokemon-species/1/") String url, Model model){
        String id = url.substring(42, url.length()-1);
        // System.out.println("Id:"+id);
        return "redirect:/pokemon/"+id;
    }


    
}
