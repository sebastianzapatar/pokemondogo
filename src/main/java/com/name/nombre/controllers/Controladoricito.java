package com.name.nombre.controllers;

import com.name.nombre.modelo.Pokemondongo;
import com.name.nombre.service.IServicePokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controladoricito {
    @Autowired
    private IServicePokemon servicePokemon;

    @GetMapping("/")
    public List<Pokemondongo> index() {
        return this.servicePokemon.getPokemon();
    }
    @PostMapping("/")
    public Pokemondongo add(@RequestBody Pokemondongo pokemond) {
        this.servicePokemon.addPokemon(pokemond);
        return pokemond;
    }
}
