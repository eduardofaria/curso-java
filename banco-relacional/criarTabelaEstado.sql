-- Comando CREATE, Criando a tabela estado!
create table estados (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    sigla VARCHAR(2) NOT NULL,
    regiao ENUM('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') NOT NULL,
    populacao DECIMAL(5,2) NOT NULL, -- Aceita 5 dígitos aceitando duas casas decimais (2 pontos flutuantes ",00") [Unidade serás MILHÕES ou seja, 800 mil = 0,8]
    PRIMARY KEY (id), -- poderia ser uma chave primária formada por duas colunas, ex: (id, nome).
    UNIQUE KEY (nome), -- sem duplicidade no nome e na sigla
    UNIQUE KEY (sigla)
);
