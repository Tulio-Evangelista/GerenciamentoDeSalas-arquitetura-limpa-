-- V1 criar tabela gerenciamento.sql




CREATE TABLE sala_reserva (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    quantidade_de_lugares INT NOT NULL,
    descricao TEXT,
    data_inicio TIMESTAMP NOT NULL,
    data_encerramento TIMESTAMP NOT NULL,
    tipo_de_sala VARCHAR(100) NOT NULL,
    localizacao VARCHAR(255) NOT NULL,
    responsavel VARCHAR(255) NOT NULL
);
