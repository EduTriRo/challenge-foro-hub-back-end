package com.aluracursos.forohub.controller;

import com.aluracursos.forohub.domain.usuarios.Usuario;
import com.aluracursos.forohub.domain.usuarios.DatosUsuarioRegistro;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody @Valid DatosUsuarioRegistro datosUsuarioRegistro) {
        // Aquí iría el servicio para guardar al usuario en la base de datos.
        // Esto es un ejemplo básico:
        Usuario nuevoUsuario = new Usuario(
                null, // El ID se genera automáticamente
                datosUsuarioRegistro.nombre(),
                datosUsuarioRegistro.correoElectronico(),
                datosUsuarioRegistro.contrasena(),
                null // Aquí podrías asignar un perfil por defecto si es necesario
        );

        // Simulación de persistencia, luego implementaremos el servicio
        return ResponseEntity.ok(nuevoUsuario);
    }
}
