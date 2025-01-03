CREATE TABLE perfiles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    perfil VARCHAR(50) NOT NULL
);

CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(255) NOT NULL,
    correo_electronico VARCHAR(255) NOT NULL UNIQUE,
    contrasena VARCHAR(255) NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    perfil_id BIGINT,
    FOREIGN KEY (perfil_id) REFERENCES perfil(id)
);

CREATE TABLE cursos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    curso VARCHAR(255) NOT NULL,
    categoria VARCHAR(255) NOT NULL
);

CREATE TABLE topicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    topico VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) DEFAULT 'ACTIVO',
    autor_id BIGINT,
    curso_id BIGINT,
    FOREIGN KEY (autor_id) REFERENCES usuario(id),
    FOREIGN KEY (curso_id) REFERENCES curso(id)
);

CREATE TABLE respuestas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mensaje TEXT NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    solucion BOOLEAN DEFAULT FALSE,
    autor_id BIGINT,
    topico_id BIGINT,
    FOREIGN KEY (autor_id) REFERENCES usuario(id),
    FOREIGN KEY (topico_id) REFERENCES topico(id)
);
