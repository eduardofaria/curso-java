SELECT * FROM estados;

SELECT nome, sigla from estados

SELECT Sigla, nome as 'Nome do Estado' from estados -- Funcionaria sem o AS também ex: nome 'Nome do Estado'
    WHERE regiao = 'Sul';

SELECT nome, regiao, populacao FROM estados
    WHERE populacao >= 10
    order by populacao desc; -- O padrão é CRESCENTE mas ao usar o parâmetro DESC, ele retorna o resultado na ordem decrescente.
