CREATE TABLE IF NOT EXISTS cidades (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    estado_id int UNSIGNED NOT NULL, -- padronização: nome da tabela que faz referência (estados) só que no singular, seguido de _ (underline) o nome da culuna a que faz referêreferência, id neste caso.
    area DECIMAL(10,2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) REFERENCES estados (id)
); -- se houverem vários "CREATE" deve-se terminar com ";".


-- como não é casesensitive, ao invés de camelCase, se usa "_" underline para separar as palavras do nome.

-- serverStatus	2 -> execução normal (OK)


CREATE TABLE IF NOT EXISTS teste (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY
);

DROP TABLE IF EXISTS teste