package com.name.nombre.service;

import com.name.nombre.modelo.Pokemondongo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService implements IServicePokemon{
    List<Pokemondongo> pokemon=new ArrayList<>();

    @Override
    public List<Pokemondongo> getPokemon() {

        return this.pokemon;
    }

    @Override
    public void addPokemon(Pokemondongo pokemon) {
        this.pokemon.add(pokemon);
    }
}
