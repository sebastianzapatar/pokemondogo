package com.name.nombre.modelo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemondongo {

    @JsonIgnore
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private String[] categorias;
}
