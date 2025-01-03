package com.aluracursos.forohub.domain.perfiles;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "perfil")
@Table(name = "perfiles")
@Getter
@NoArgsConstructor
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Agregamos getters manuales en caso de que Lombok falle
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
