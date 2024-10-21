// Importações
const express = require("express");
const cors = require("cors");

// Servidor
const app = express();
const port = 3000;

// Configurações
app.use(express.json());
app.use(cors());

// Produtos
let produtos = [
  { descricao: "Produto A", quantidade: 10, valor: 29.99 },
  { descricao: "Produto B", quantidade: 5, valor: 49.99 },
];

// Listar
app.get("/produtos", (req, res) => {
  res.json(produtos);
});

// Adicionar
app.post("/produtos", (req, res) => {
  const newProduto = req.body;
  produtos.push(newProduto);
  res.status(201).json(newProduto);
});

// Atualizar
app.put("/produtos/:descricao", (req, res) => {
  const descricao = req.params.descricao;
  const index = produtos.findIndex((p) => p.descricao === descricao);
  if (index !== -1) {
    produtos[index] = { ...produtos[index], ...req.body };
    res.json(produtos[index]);
  } else {
    res.status(404).json({ message: "Produto não encontrado" });
  }
});

// Remover
app.delete("/produtos/:descricao", (req, res) => {
  const descricao = req.params.descricao;
  const index = produtos.findIndex((p) => p.descricao === descricao);
  if (index !== -1) {
    const removed = produtos.splice(index, 1);
    res.json(removed[0]);
  } else {
    res.status(404).json({ message: "Produto não encontrado" });
  }
});

// Iniciar
app.listen(port, () => {
  console.log(`Servidor iniciado na porta ${port}`);
});
