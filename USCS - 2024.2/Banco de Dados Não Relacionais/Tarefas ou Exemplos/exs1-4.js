db.paises.insertMany([{
    nome: "Brasil",
    sigla: "BRA",
    continente: "America do Sul",
    estados: [
       {sigla: "SP", nome: "São Paulo", populacao: 13},
       {sigla: "RJ", nome: "Rio de Janeiro", populacao: 23},
       {sigla: "MG", nome: "Minas Gerais", populacao: 32},
       {sigla: "ES", nome: "Espirito Santo", populacao: 21}
        ]
    }, {
    nome: "Estados Unidos da America",
    sigla: "USA",
    continente: "America do Norte",
    estados: [
       {sigla: "MI", nome: "Miami", populacao: 13},
       {sigla: "CA", nome: "California", populacao: 23},
       {sigla: "NY", nome: "New York", populacao: 32},
       {sigla: "WS", nome: "Washington", populacao: 21}
        ]
    }, {
    nome: "Alemanha",
    sigla: "GER",
    continente: "Europa",
    estados: [
        {sigla: "BW", nome: "Baden-Württemberg", populacao: 13},
        {sigla: "BY", nome: "Bavaria", populacao: 23},
        {sigla: "BE", nome: "Berlin", populacao: 32},
        {sigla: "HH", nome: "Hamburg", populacao: 21}
        ]
    }])
    
    
    
    