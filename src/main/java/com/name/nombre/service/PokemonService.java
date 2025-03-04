package com.name.nombre.service;

import com.name.nombre.modelo.Pokemondongo;
import com.name.nombre.repository.IPokemondongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PokemonService implements IServicePokemon{
    @Autowired
    private IPokemondongoRepository pokemondongoRepository;

    @Override
    public List<Pokemondongo> getPokemon() {

        return this.pokemondongoRepository.findAll();
    }

    @Override
    public void addPokemon(Pokemondongo pokemon) {

       this.pokemondongoRepository.save(pokemon);
    }

    @Override
    public Optional<Pokemondongo> getPokemonById(Long id) {
        return this.pokemondongoRepository.findById(id);
    }
    @Override
    public List<Pokemondongo> getPokemonByName(String name){
        return this.pokemondongoRepository.findByNombre(name);
    }
}
