package com.aluracursos.forohub.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
    @GetMapping
    public String listarTopicos() {
        return "Listar tópicos (provisional)";
    }

    @PostMapping
    public String crearTopico() {
        return "Crear tópico (provisional)";
    }

    @PutMapping("/{id}")
    public String actualizarTopico(@PathVariable Long id) {
        return "Actualizar tópico con ID " + id + " (provisional)";
    }

    @DeleteMapping("/{id}")
    public String eliminarTopico(@PathVariable Long id) {
        return "Eliminar tópico con ID " + id + " (provisional)";
    }
}
