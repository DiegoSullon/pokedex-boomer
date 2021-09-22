package com.app.pokedex.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.app.pokedex.models.Pokedex;
import com.app.pokedex.models.Pokemon;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {
    HttpHeaders headers = new HttpHeaders();
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> entity;

    public PokedexService(){
        this.headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        this.headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        this.entity = new HttpEntity<String>("parameters", headers);
    }

    public Pokedex getPokedex(int page){
        String url = "https://pokeapi.co/api/v2/pokemon-species?offset="+ page * 20+"&limit=20";
        Pokedex pokedex = new Pokedex();
        try {
            pokedex = restTemplate.exchange(url, HttpMethod.GET,entity,Pokedex.class).getBody();
            System.out.println("Pokedex: "+ pokedex.getCount());
            System.out.println("Pokedex: "+ pokedex.getResults().get(0));

            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        

        // Map<String, Object> pokemon = (Map<String, Object>) pokedex.getResults().get(0);
        // System.out.println("Name: "+ pokemon.get("name"));
        // System.out.println("Url: "+ pokemon.get("url"));

        return  pokedex;
    }
    // public List

    public Pokemon getPokemon(String id){
        String url = "https://pokeapi.co/api/v2/pokemon-species/"+id+"/";
        Pokemon pokemon = restTemplate.getForObject(url, Pokemon.class);
        System.out.println("Pokemon: "+ pokemon.getName());
        return pokemon;
    }
}
