INSERT INTO estados (id, nome, sigla, regiao, populacao)
    values (1000, 'Novo', 'NV', 'Sul', 2.54)
-- mesmo o campo sendo auto incrementavél, eu posso forçar um ID específico, desde que não entre em conflito com um já existente.

SELECT * from `estados`

INSERT INTO estados (nome, sigla, regiao, populacao) values ('Mais Novo', 'MN', 'Norte', 2.51)

SELECT * from `estados`

-- num campo de auto incremento ele vai sempre pegar o último ID utilizado e incrementar a partir desse novo marco.