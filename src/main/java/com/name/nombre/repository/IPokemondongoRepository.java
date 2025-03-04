package com.name.nombre.repository;

import com.name.nombre.modelo.Pokemondongo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPokemondongoRepository
        extends JpaRepository<Pokemondongo,Long> {
    public List<Pokemondongo> findByNombre(String nombre);
    public List<Pokemondongo> findByNombreContaining(String nombre);
}
