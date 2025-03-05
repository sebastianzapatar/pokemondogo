package com.name.nombre.service;

import com.name.nombre.modelo.Pokemondongo;
import com.name.nombre.repository.IPokemondongoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class PokemonService implements IServicePokemon{
    @Autowired
    private IPokemondongoRepository pokemondongoRepository;

    @Override
    public List<Pokemondongo> getPokemon() {

        return this.pokemondongoRepository.findAll();
    }

    @Override
    public Pokemondongo addPokemon(@Valid Pokemondongo pokemon) {
        try {
            return pokemondongoRepository.save(pokemon);
        } catch (DataIntegrityViolationException e) {
            throw new IllegalArgumentException("El nombre '" + pokemon.getNombre() + "' ya está en uso.");
        }
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
