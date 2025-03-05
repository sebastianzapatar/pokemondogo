package com.name.nombre.service;

import com.name.nombre.modelo.Pokemondongo;

import java.util.List;
import java.util.Optional;

public interface IServicePokemon {
    public List<Pokemondongo> getPokemon();
    public Pokemondongo addPokemon(Pokemondongo pokemon);
    public Optional<Pokemondongo> getPokemonById(Long id);
    public List<Pokemondongo> getPokemonByName(String name);
}
