package com.aluracursos.forohub.controller;

import com.aluracursos.forohub.domain.topicos.Curso;
import com.aluracursos.forohub.domain.topicos.DatosCursoRegistro;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @PostMapping
    public ResponseEntity<Curso> registrarCurso(@RequestBody @Valid DatosCursoRegistro datosCursoRegistro) {
        // Simulación de persistencia:
        Curso nuevoCurso = new Curso(
                null, // ID se genera automáticamente
                datosCursoRegistro.curso(),
                datosCursoRegistro.categoria()
        );

        return ResponseEntity.ok(nuevoCurso);
    }
}
