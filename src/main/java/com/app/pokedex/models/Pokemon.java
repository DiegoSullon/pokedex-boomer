package com.app.pokedex.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String url;
    @Getter
    @Setter
    private int base_happiness;
    @Getter
    @Setter
    private int capture_rate;
    @Getter
    @Setter
    private List<Object> egg_groups;
    @Getter
    @Setter
    private Object evolution_chain;
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private int order;
}
