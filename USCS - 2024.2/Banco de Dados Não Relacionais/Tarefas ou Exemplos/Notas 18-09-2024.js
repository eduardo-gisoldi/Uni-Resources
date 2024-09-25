// Exercicio 1
use dbpaises2024B

db.paises.insertOne({
    nome: "Brasil",
    sigla: "BR",
    continente: "America do Sul",
    estados: [
       {sigla: "SP", nome: "São Paulo", populacao: 5},
       {sigla: "XX", nome: "XXX XXXXX", populacao: 8},
       {sigla: "X1", nome: "XX1 XXXXX", populacao: 9},
       {sigla: "X2", nome: "XX2 XXXXX", populacao: 7},
    ]
})

db.paises.insertMany([
    {
        nome: "Argentina",
        sigla: "ARG",
        continente: "America do Sul",
        estados: [
               {sigla: "YY", nome: "São Paulo", populacao: 5},
               {sigla: "XX", nome: "XXX XXXXX", populacao: 8},
               {sigla: "X1", nome: "XX1 XXXXX", populacao: 9},
               {sigla: "X2", nome: "XX2 XXXXX", populacao: 7},
            ]
    },
    {
        nome: "EUA",
        sigla: "USA",
        continente: "America do Norte",
        estados: [
               {sigla: "PP", nome: "São Paulo", populacao: 5},
               {sigla: "XX", nome: "XXX XXXXX", populacao: 8},
               {sigla: "X1", nome: "XX1 XXXXX", populacao: 9},
               {sigla: "X2", nome: "XX2 XXXXX", populacao: 7},
            ]
    }
])


db.paises.find()


// Exercicio 2

use dbredesocial2024b;

db.usuarios.insertMany([
    {_id: 1, nome: "Joao Silva", email: "j@j.com", nasc: ISODate("2000-01-05")}, 
    {_id: 2, nome: "Maria", email: "m@m.com", nasc: ISODate("2005-10-15")},
])

db.postagens.insertOne({
   _id: 100,
   titulo: "Novidades tech",
   mensagem: "Em 2024 blba blabla",
   data_postagem: ISODate("2024-09-18"),
   usuario: {_id: 1, nome: "Joao Silva", email: "j@j.com"},
   comentarios: [
       {    comentario: "Olá", 
            data_comentario: ISODate("2024-09-18"),
            usuario: {_id: 2, nome: "Maria", email: "m@m.com"}
       },
       {    comentario: "Olá Maria", 
            data_comentario: ISODate("2024-09-18"),
            usuario: {_id: 1, nome: "Joao Silva", email: "j@j.com"}
       },
   ]
})

db.usuarios.find()

db.postagens.find()

// Exercicio 3

use dbseriados2024b

db.seriados.insertOne({
    _id: 100,
    nome: "Leftovers",
    ano_lancamento: ISODate("2021-01-01"),
    episodios: [
        {titulo: "Tit01", descricao: "Desc01", duracao: 45, lancado_em: ISODate("2021-01-01")},
        {titulo: "Tit02", descricao: "Desc02", duracao: 45, lancado_em: ISODate("2021-02-01")},
        {titulo: "Tit03", descricao: "Desc03", duracao: 45, lancado_em: ISODate("2021-03-01")},
    ]
})

db.seriados.find( )

// Parte do exercício 4
show collections
db.paises.drop()
db.dropDatabase()

show collections
db.postagens.drop()
db.usuarios.drop()
db.dropDatabase()

show collections
db.seriados.drop()
db.dropDatabase()

// parte de arrays do PDF 

use dbfilmes2024B

db.filmes.insertOne({
    _id: 100,
    nome: "Forest Gump",
    genero: ["Drama"]
})


db.filmes.updateOne(
    {_id: 100},
    { $push: { genero: "Comédia" }}
)

db.filmes.updateOne(
    {_id: 100},
    { $push: { genero: {$each: ["Ação", "Terror"]} }}
)

db.filmes.updateOne(
    {_id: 100},
    { $push: { genero: "Comédia" }}
)

db.filmes.updateOne(
    {_id: 100},
    { $pull: { genero: "Comédia" }}
)


db.filmes.updateOne(
    {_id: 100},
    { $push: { genero: "Drama" }}
)

db.filmes.updateOne(
    {_id: 100},
    { $push: { genero: "Drama" }}
)

db.filmes.updateOne(
    {_id: 100},
    { $pop: { genero: 1 }}
)

db.filmes.updateOne(
    {_id: 100},
    { $pop: { genero: -1 }}
)

db.filmes.updateOne(
    {_id: 100},
    { $set: { "genero.2": "Ficção" }}
)


db.filmes.updateOne(
    {_id: 100},
    { $addToSet: { genero: "Terror" }}
)


db.filmes.find({_id: 100})





