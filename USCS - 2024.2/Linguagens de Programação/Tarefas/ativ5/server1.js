// Importações
const express = require("express");
const cors = require("cors");

// Servidor
const app = express();

// Porta
const port = 3000;

// Configurações
app.use(express.json());
app.use(cors());

// Produtos
let produtos = [
  { id: 1, nome: "Produto A" },
  { id: 2, nome: "Produto B" },
];

// Listar
app.get("/produtos", (req, res) => {
  console.log("get");
  res.json(produtos);
});

// Obter
app.get("/produtos/:id", (req, res) => {
  const id = parseInt(req.params.id);
  const produto = produtos.find((produto) => produto.id === id);
  if (produto) {
    res.json(produto);
  } else {
    res.status(404).json({ message: "Produto não encontrado" });
  }
});

// Adicionar
app.post("/produtos", (req, res) => {
  const newproduto = req.body;
  produtos.push(newproduto);
  res.status(201).json(newproduto);
});

// Atualizar
app.put("/produtos/:id", (req, res) => {
  const id = parseInt(req.params.id);
  const updatedproduto = req.body;
  const index = produtos.findIndex((produto) => produto.id === id);
  if (index !== -1) {
    produtos[index] = { ...produtos[index], ...updatedproduto };
    res.json(produtos[index]);
  } else {
    res.status(404).json({ message: "Produto não encontrado" });
  }
});

// Remover
app.delete("/produtos/:id", (req, res) => {
  const id = parseInt(req.params.id);
  const index = produtos.findIndex((produto) => produto.id === id);
  if (index !== -1) {
    const removedproduto = produtos.splice(index, 1);
    res.json(removedproduto[0]);
  } else {
    res.status(404).json({ message: "Produto não encontrado" });
  }
});

// Iniciar
app.listen(port, () => {
  console.log(`Servidor iniciado na porta ${port}`);
});
