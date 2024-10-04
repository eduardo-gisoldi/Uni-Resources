// inserção dos dados já feita

//ex 1 - Escreva uma consulta que liste todos os filmes, incluindo o nome do diretor diretamente do documento do filme.
db.filmes.find(
    {},
    {_id: 0, titulo: 1, ano: 1, nome_diretor: "$diretor.nome_diretor"}
)

//ex 2 - Escreva uma consulta que liste cada filme várias vezes, uma para cada ator principal, mostrando o nome do ator.
db.filmes.aggregate(
    {},
    {_id: 0, titulo: 1, ano: 1, "diretor.nome_diretor": 1}
)

//ex 3 - Liste todos os filmes juntamente com a nacionalidade dos diretores.

//ex 4 - Liste todos os filmes juntamente com a nacionalidade dos diretores.

//ex 5 - Liste todos os filmes juntamente com a nacionalidade dos diretores.

//ex 6 - Liste todos os filmes juntamente com a nacionalidade dos diretores.
