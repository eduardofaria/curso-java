SELECT * FROM `prefeitos`;
select * FROM cidades;

SELECT * from cidades c inner join prefeitos p on c.id = p.cidade_id;

SELECT * FROM cidades c LEFT JOIN prefeitos p on c.id = p.cidade_id;
SELECT * FROM cidades c LEFT OUTER JOIN prefeitos p on c.id = p.cidade_id; -- é a mesma coisa que o comando acima

SELECT * FROM cidades c right join prefeitos p on c.id = p.cidade_id;

-- SELECT * FROM cidades c FULL join prefeitos p on c.id = p.cidade_id; -- comando FULL JOIN não é supoertado por todos os bancos de dados
-- Para contornar isso, abaixo, se usa o UNION para realizar a mesma proposta de FULL JOIN
    SELECT * FROM cidades c LEFT JOIN prefeitos p on c.id = p.cidade_id
UNION
    SELECT * FROM cidades c right join prefeitos p on c.id = p.cidade_id;
-- Se usar UNION ALL ele trará até as duplicações

