package com.name.nombre.modelo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@Table(name="pokemondogoncitos", uniqueConstraints = {
        @UniqueConstraint(columnNames = "nombre") // Garantiza que el nombre sea único en la BD
})
public class Pokemondongo {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Column(nullable = false, unique = true)
    private String nombre;

    @NotBlank(message = "La descripcion no puedes ser nula")
    @Column(nullable = false)
    private String descripcion;

    @NotBlank(message = "Imagen no puede ser nula")
    @Column(nullable = false)
    private String imagen;

}
