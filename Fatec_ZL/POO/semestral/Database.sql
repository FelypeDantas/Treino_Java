CREATE DATABASE hospitaldb
USE hospitaldb

CREATE TABLE pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cadastro DATE NOT NULL DEFAULT CURRENT_DATE,
    sexo VARCHAR(10) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(15),
    email VARCHAR(255),
    cartao_sus VARCHAR(20) NOT NULL
);

CREATE TABLE agendamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT NOT NULL,
    tipo_exame VARCHAR(255) NOT NULL,
    data_hora_agendamento DATETIME NOT NULL,
    data_criacao DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) NOT NULL,
    medico_responsavel VARCHAR(255),
    unidade_exame VARCHAR(255),
    observacoes TEXT,
    forma_pagamento VARCHAR(50),
    FOREIGN KEY (id_paciente) REFERENCES pacientes(id)
);

SELECT * FROM pacientes;
SELECT * FROM agendamentos;