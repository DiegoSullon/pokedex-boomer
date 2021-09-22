package com.app.pokedex.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Pokedex {
    @Getter @Setter
    private int count;
    @Getter @Setter
    private String next;
    @Getter @Setter
    private String previous;
    @Getter @Setter
    private List<Object> results;

    public Pokedex() {
        // results = new ArrayList<Pokemon>();
    }
}
