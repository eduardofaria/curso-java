UPDATE estados
SET nome = 'Maranhão' -- SET -> o nome do atributo que quer alterar
-- sem WHERE ele atualizaria todos os nomes em todos os lugares para 'Maranhão'
WHERE sigla = 'MA' -- como sigla 'MA' é única, apenas o nome em 'Maranhao' será atualizado para 'Maranhão'


SELECT nome FROM estados WHERE sigla = 'MA' -- aspas simples ou duplas "MA"
-- não pode se usar `MA` (backstick) para strings, mas pode usar para nomes de colunas como em `nome`

-- Também pode se usar assim:
SELECT estados.`nome` from estados WHERE sigla = 'MA'
-- ou
SELECT estados.nome from estados WHERE sigla = 'MA'
-- ou
SELECT est.`nome` from estados est WHERE sigla = 'MA'
-- Usam est como "apelido" de estados
SELECT est.nome from estados est WHERE sigla = 'MA'
-- apelidos como "est" são uteis quando há conflitos de colunas Ex: Tanto numa tabela de estados quanto de cidades haverá uma coluna 'nome'

UPDATE `estados` SET nome = 'Paraná', populacao = 11.32
    WHERE sigla = "PR"

SELECT nome, populacao from `estados` WHERE  sigla = 'PR'
