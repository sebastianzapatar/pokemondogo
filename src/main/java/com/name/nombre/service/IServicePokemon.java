package com.name.nombre.service;

import com.name.nombre.modelo.Pokemondongo;

import java.util.List;

public interface IServicePokemon {
    public List<Pokemondongo> getPokemon();
    public void addPokemon(Pokemondongo pokemon);

}
