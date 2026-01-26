SELECT e.nome Empresa, c.nome AS Cidade -- com AS e sem AS dá no mesmo
FROM empresas e, empresas_unidades u, cidades c
WHERE e.id = u.empresa_id -- cláusula 1 verdadeira
AND c.id = u.cidade_id -- cláusula 2 verdadeira
AND sede -- cláusula 3, pode usar, ao invés de "sede = 1", apenas sede, pois ele entende que apenas "sede" já condiz em ser diferente de "0"