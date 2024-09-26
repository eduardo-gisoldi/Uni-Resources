use estudantes

// inserir dados fornecidos
db.estudantes.insertOne({
  nome: "João Silva",
  idade: 22,
  disciplinas: ["Matemática", "Programação", "Banco de Dados"],
  projetos: [
    { nome_projeto: "Projeto A", nota_projeto: 8.5, carga_horaria: 40 },
    { nome_projeto: "Projeto B", nota_projeto: 9.0, carga_horaria: 60 }
  ]
});

db.estudantes.insertOne({
  nome: "Maria Costa",
  idade: 19,
  disciplinas: ["Lógica", "Estruturas de Dados", "Álgebra"],
  projetos: [
    { nome_projeto: "Projeto X", nota_projeto: 7.0, carga_horaria: 30 },
    { nome_projeto: "Projeto Y", nota_projeto: 8.0, carga_horaria: 50 }
  ]
});

db.estudantes.insertOne({
  nome: "Paulo Souza",
  idade: 21,
  disciplinas: ["Banco de Dados", "Métodos Ágeis", "Segurança da Informação"],
  projetos: [
    { nome_projeto: "Projeto BD", nota_projeto: 9.0, carga_horaria: 60 },
    { nome_projeto: "Projeto Segurança", nota_projeto: 9.5, carga_horaria: 80 }
  ]
});

db.estudantes.insertOne({
  nome: "Ana Lima",
  idade: 23,
  disciplinas: ["Engenharia de Software", "Álgebra", "Cálculo"],
  projetos: [
    { nome_projeto: "Projeto Software", nota_projeto: 8.0, carga_horaria: 70 },
    { nome_projeto: "Projeto Cálculo", nota_projeto: 7.5, carga_horaria: 50 }
  ]
});

db.estudantes.insertOne({
  nome: "Lucas Pereira",
  idade: 20,
  disciplinas: ["Lógica", "NoSQL", "Computação Gráfica"],
  projetos: [
    { nome_projeto: "Projeto Lógica", nota_projeto: 7.0, carga_horaria: 40 },
    { nome_projeto: "Projeto Gráfica", nota_projeto: 8.5, carga_horaria: 70 }
  ]
});

db.estudantes.insertOne({
  nome: "Carlos Oliveira",
  idade: 24,
  disciplinas: ["Cálculo", "Física", "Banco de Dados"],
  projetos: [
    { nome_projeto: "Projeto Física", nota_projeto: 7.5, carga_horaria: 50 },
    { nome_projeto: "Projeto BD", nota_projeto: 8.0, carga_horaria: 40 }
  ]
});

db.estudantes.insertOne({
  nome: "Fernanda Souza",
  idade: 22,
  disciplinas: ["Algoritmos", "Inteligência Artificial", "NoSQL"],
  projetos: [
    { nome_projeto: "Projeto AI", nota_projeto: 9.5, carga_horaria: 60 },
    { nome_projeto: "Projeto NoSQL", nota_projeto: 8.5, carga_horaria: 40 }
  ]
});

db.estudantes.insertOne({
  nome: "Rodrigo Ferreira",
  idade: 21,
  disciplinas: ["Engenharia de Software", "Lógica", "Estruturas de Dados"],
  projetos: [
    { nome_projeto: "Projeto Lógica", nota_projeto: 8.0, carga_horaria: 40 },
    { nome_projeto: "Projeto Estruturas", nota_projeto: 7.5, carga_horaria: 50 }
  ]
});

db.estudantes.insertOne({
  nome: "Isabela Santos",
  idade: 20,
  disciplinas: ["Programação", "Banco de Dados", "Métodos Ágeis"],
  projetos: [
    { nome_projeto: "Projeto Métodos Ágeis", nota_projeto: 9.0, carga_horaria: 60 },
    { nome_projeto: "Projeto Programação", nota_projeto: 8.0, carga_horaria: 40 }
  ]
});

db.estudantes.insertOne({
  nome: "Julia Moreira",
  idade: 23,
  disciplinas: ["Física", "Cálculo", "Inteligência Artificial"],
  projetos: [
    { nome_projeto: "Projeto IA", nota_projeto: 9.0, carga_horaria: 70 },
    { nome_projeto: "Projeto Cálculo", nota_projeto: 8.5, carga_horaria: 50 }
  ]
});

db.estudantes.insertOne({
  nome: "Gabriel Nascimento",
  idade: 25,
  disciplinas: ["NoSQL", "Segurança da Informação"],
  projetos: [
    { nome_projeto: "Projeto Segurança", nota_projeto: 9.0, carga_horaria: 80 },
    { nome_projeto: "Projeto NoSQL", nota_projeto: 8.0, carga_horaria: 50 }
  ]
});

db.estudantes.insertOne({
  nome: "Patrícia Dias",
  idade: 26,
  disciplinas: ["Programação", "Cálculo", "Banco de Dados"],
  projetos: [
    { nome_projeto: "Projeto Programação", nota_projeto: 7.5, carga_horaria: 40 },
    { nome_projeto: "Projeto BD", nota_projeto: 8.0, carga_horaria: 50 }
  ]
});

db.estudantes.insertOne({
  nome: "Bruno Mendes",
  idade: 22,
  disciplinas: ["Algoritmos", "Banco de Dados", "Lógica"],
  projetos: [
    { nome_projeto: "Projeto Algoritmos", nota_projeto: 7.5, carga_horaria: 50 },
    { nome_projeto: "Projeto BD", nota_projeto: 8.0, carga_horaria: 40 }
  ]
});

db.estudantes.insertOne({
  nome: "Laura Martins",
  idade: 23,
  disciplinas: ["Cálculo", "Lógica"],
  projetos: [
    { nome_projeto: "Projeto Cálculo", nota_projeto: 8.0, carga_horaria: 40 },
    { nome_projeto: "Projeto Programação", nota_projeto: 7.5, carga_horaria: 60 }
  ]
});

db.estudantes.insertOne({
  nome: "Ricardo Almeida",
  idade: 24,
  disciplinas: ["Inteligência Artificial", "Métodos Ágeis", "Banco de Dados"],
  projetos: [
    { nome_projeto: "Projeto AI", nota_projeto: 9.0, carga_horaria: 60 },
    { nome_projeto: "Projeto Métodos", nota_projeto: 7.5, carga_horaria: 40 }
  ]
});



//RESPOSTAS MULTIPLA ESCOLHA
/*
1: a)
2: b)
3: b)
4: b)
5: a)
6: b)
7: c)
8: b)
9: a)
10:a)
*/


//ex 1 - Escreva uma consulta para encontrar todos os estudantes com mais de 20 anos de idade.
db.estudantes.find(
    {idade: {$gt: 20}}
)

//ex 2 - Usando o operador $push, escreva uma atualização que adicione a disciplina "Inteligência Artificial" ao array disciplinas de um estudante com o nome "João Silva"
db.estudantes.updateOne(
    {nome: "João Silva"}, 
    {$push: {disciplinas: "Inteligência Artificial"}}
)

//ex 3 - Escreva uma consulta para encontrar todos os estudantes que possuem exatamente 3 disciplinas no array disciplinas.
db.estudantes.find(
    {disciplinas: {$size: 3}}
)

//ex 4 - Usando o operador $pull, escreva uma atualização para remover a disciplina "Álgebra" do array disciplinas de todos os estudantes.
db.estudantes.updateMany(
    {}, 
    {$pull: {disciplinas: "Álgebra"}}
)

//ex 5 - Usando o operador $addToSet, adicione a disciplina "Engenharia de Software" ao array disciplinas de Paulo Souza, garantindo que o valor não será duplicado.
db.estudantes.updateOne(
    {nome: "Paulo Souza"}, 
    {$addToSet: {disciplinas: "Engenharia de Software"}}

//ex 6 - Escreva uma consulta usando $elemMatch para encontrar estudantes que possuem um projeto com nome "Projeto A" e carga horária de 40 horas.
db.estudantes.find(
    {projetos: {$elemMatch: {
        nome_projeto: "Projeto A",
        carga_horaria: 40
        }}
    }    
)

//ex 7 - Escreva uma atualização para remover o primeiro elemento do array disciplinas de todos os estudantes.
db.estudantes.updateMany(
    {}, 
    {$pop: {disciplinas: -1}}
)

//ex 8 - Usando o operador $pop, remova o último projeto do array projetos de Ana Lima.
db.estudantes.updateOne(
    {nome: "Ana Lima"}, 
    {$pop: {disciplinas: 1}}
)

//ex 9 - Escreva uma consulta que retorne todos os estudantes com mais de 2 projetos no array projetos.
db.estudantes.find(
    {$where: "this.projetos.length > 2"}
)

//ex 10 - Usando o operador $inc, incremente a nota final de todos os estudantes no primeiro projeto (nota_projeto) em 1.5 pontos.
db.estudantes.updateMany(
  {},
  {$inc: { "projetos.0.nota_projeto": 1.5 }}
)

