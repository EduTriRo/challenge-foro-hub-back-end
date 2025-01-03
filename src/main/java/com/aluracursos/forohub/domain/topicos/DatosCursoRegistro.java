package com.aluracursos.forohub.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosCursoRegistro(
        @NotBlank String curso,
        @NotBlank String categoria
) {}
