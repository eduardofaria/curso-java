CREATE TABLE IF NOT EXISTS empresas (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj INT UNSIGNED, -- Não faz sentido criar um campo como CNPJ, CPF ou RG como INT, pois não irá fazer operações matemáticas com este campo.
    PRIMARY KEY (id),
    UNIQUE KEY (cnpj)
);
-- OBS: Não é por que o campo só tem números que ele deve ser um INT, pode sim ser um VARCHAR de números. Principalmente se esse campo não for usado em operações matemáticas

-- cidades_empresas
CREATE TABLE IF NOT EXISTS empresas_unidades (
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY (empresa_id, cidade_id)
);