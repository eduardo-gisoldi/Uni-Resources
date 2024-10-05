// inserção dos dados já feita

//ex 1 - Escreva uma consulta que liste todos os filmes, incluindo o nome do diretor diretamente do documento do filme.
db.filmes.find(
    {},
    {_id: 0, titulo: 1, ano: 1, nome_diretor: "$diretor.nome_diretor"}
)

//ex 2 - Escreva uma consulta que liste cada filme várias vezes, uma para cada ator principal, mostrando o nome do ator.
db.filmes.aggregate([
    {$unwind: "$atores"},
    {$project: {
        _id: 0,
        titulo: 1,
        ano: 1,
        "nome_ator": "$atores.nome_ator"
    }}
])

//ex 3 - Liste todos os filmes juntamente com a nacionalidade dos diretores.
db.filmes.aggregate([
    {$lookup: {
           from: "diretores",
           localField: "diretor.diretor_id",
           foreignField: "_id",
           as: "diretorLookup"
         }},
    {$unwind: "$diretorLookup"},
    {$project: {
        _id: 0,
        titulo: 1,
        ano: 1,
        "nome_diretor": "$diretor.nome_diretor",
        "diretor_nacionalidade": "$diretorLookup.nacionalidade"
    }}
])

//ex 4 - Escreva uma agregação que retorne as avaliações de um filme específico, incluindo o nome do usuário que fez cada avaliação.
db.avaliacoes.aggregate([
    {$match: {filme_id: ObjectId("64b7f0c3c3c3c3c3c3c3c3c1"}},
    {$lookup: {
        from: "usuarios",
        localField: "usuario_id",
        foreignField: "_id",
        as: "usuario"
    }},
    {$unwind: "$usuario"},
    {$project: {
        _id: 0,
        filme_id: 1,
        "nome_usuario": "$usuario.nome_usuario",
        nota: 1,
        comentario: 1
    }}
])

//ex 5 - Liste todos os filmes e inclua apenas os nomes dos atores de nacionalidade "Americana".
db.filmes.aggregate([
    {$lookup: {
       from: "atores",
       localField: "atores.ator_id",
       foreignField: "_id",
       as: "atoresLookup"
    }},
    {$match: {"atoresLookup.nacionalidade": "Americana"}},
    {$project: {
        _id: 0,
        titulo: 1,
        "atores_americanos": "$atoresLookup.nome"
    }}
])

//ex 6 - Para cada avaliação, liste o título do filme avaliado, o nome do usuário que fez a avaliação e a nacionalidade do diretor.
db.avaliacoes.aggregate([
    {$lookup: {
        from: "filmes",
        localField: "filme_id",
        foreignField: "_id",
        as: "filme"
    }},
    {$unwind: "$filme"},
    {$lookup: {
        from: "diretores",
        localField: "filme.diretor.diretor_id",
        foreignField: "_id",
        as: "diretor"
    }},
    {$unwind: "$diretor"},
    {$lookup: {
        from: "usuarios",
        localField: "usuario_id",
        foreignField: "_id",
        as: "usuario"
    }},
    {$unwind: "$usuario"},
    {$project: {
        _id: 0,
        "titulo_filme": "$filme.titulo",
        "diretor_nacionalidade": "$diretor.nacionalidade"
        "nome_usuario": "$usuario.nome_usuario",
        nota: 1,
        comentario: 1
    }}
])