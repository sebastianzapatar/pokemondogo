package com.name.nombre.controllers;

import com.name.nombre.modelo.Pokemondongo;
import com.name.nombre.service.IServicePokemon;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Pokemondongo", description = "API para gestionar tus Pokemon")
public class Controladoricito {
    @Autowired
    private IServicePokemon servicePokemon;

    @GetMapping("/")
    @Operation(summary = "Obtener todos los pokemon", description = "Devuelve todos los pokemon")
    public List<Pokemondongo> index() {
        return this.servicePokemon.getPokemon();
    }
    @PostMapping("/")
    public Pokemondongo add(@RequestBody Pokemondongo pokemond) {
        this.servicePokemon.addPokemon(pokemond);
        return pokemond;
    }
    @GetMapping("/buscar/{id}")
    public Pokemondongo buscar(@PathVariable Long id) {
       return this.servicePokemon.getPokemonById(id)
                .orElse(null);
    }
    @GetMapping("/buscarNombre/{nombre}")
    public List<Pokemondongo> buscarNombre(@PathVariable String nombre) {
        return this.servicePokemon.getPokemonByName(nombre);
    }
}
