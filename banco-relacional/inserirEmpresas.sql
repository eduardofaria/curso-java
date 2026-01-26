INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Bradesco', 95694186000132),
    ('Vale', 27887148000146),
    ('Cielo', 01598317000134); -- Antes do ALTER TABLE abaixo, geraria o erro de que o valor informado é maior do que o espaço que o INT armazena por padrão.

-- Consertando o campo CNPJ de INT para VARCHAR com 14 caracteres que é o padrão para CNPJs
ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

-- OBS: Mesmo sem o cnpj do INSERT estar sem "aspas" foi possível inserir os números no espaço modificado para VARCHAR


DESC empresas; -- descreve o conteúdo da tabela
DESC prefeitos;

SELECT * FROM empresas;
SELECT * FROM cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);