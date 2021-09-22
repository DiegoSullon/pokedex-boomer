package com.app.pokedex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.app.pokedex.models.Pokedex;
import com.app.pokedex.models.Pokemon;
import com.app.pokedex.service.PokedexService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PokedexApplicationTests {

	@Autowired
	PokedexService pokedexService;
	@Test
	void getPokemons() {
		Pokedex pokedex = pokedexService.getPokedex(0);
		assertEquals(898,pokedex.getCount());

	}

	@Test
	void getPokemon() {

		Pokemon pokemon = pokedexService.getPokemon("1");
		assertEquals("bulbasaur",pokemon.getName());
	}

}
