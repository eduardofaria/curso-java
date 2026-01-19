SELECT * FROM estados e, cidades c
WHERE e.id = c.estado_id

SELECT e.nome as 'Estado', c.nome as 'Cidade', e.regiao as 'Região' FROM estados e, cidades c -- a coluna nome possui ambiguidade nas duas tabelas, logo o uso de alias previne erros
WHERE e.id = c.estado_id


SELECT
    c.nome as Cidades,
    e.nome as Estado,
    regiao as Região
from estados e
inner join cidades c on e.id = c.estado_id
