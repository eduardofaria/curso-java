SELECT regiao as 'Região', 
sum(populacao) as Total
FROM `estados`
GROUP BY regiao
ORDER BY Total desc



SELECT sum(populacao) as Total
FROM `estados`


SELECT regiao as 'Região', 
avg(populacao) as Total -- avg -> média
FROM `estados`
GROUP BY regiao
ORDER BY Total desc



SELECT avg(populacao) from `estados`

