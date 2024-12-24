CREATE TABLE IF NOT EXISTS JOGADORES (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(20),
    codinome VARCHAR(255) NOT NULL,
    grupo_codinome VARCHAR(255) NOT NULL,
    CONSTRAINT unique_codinome_grupo UNIQUE (codinome, grupo_codinome)
);