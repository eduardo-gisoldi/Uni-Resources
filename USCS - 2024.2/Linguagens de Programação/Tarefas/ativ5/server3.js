// Importações
const express = require("express");
const mysql = require("mysql2");
const cors = require("cors");

// Servidor
const app = express();
const port = 3000;

// Configurações
app.use(express.json());
app.use(cors());

// Banco
const db = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "yourpassword",
  database: "yourdatabase"
});

// Conectar
db.connect((err) => {
  if (err) {
    console.error("Erro ao conectar ao MySQL:", err);
  } else {
    console.log("Conectado ao MySQL");
  }
});

// Listar
app.get("/produtos", (req, res) => {
  db.query("SELECT * FROM Produtos", (err, results) => {
    if (err) {
      res.status(500).json({ message: "Erro ao buscar produtos" });
    } else {
      res.json(results);
    }
  });
});

// Adicionar
app.post("/produtos", (req, res) => {
  const { descricao, quantidade, valor } = req.body;
  db.query(
    "INSERT INTO Produtos (descricao, quantidade, valor) VALUES (?, ?, ?)",
    [descricao, quantidade, valor],
    (err, results) => {
      if (err) {
        res.status(500).json({ message: "Erro ao adicionar produto" });
      } else {
        res.status(201).json({ id: results.insertId, descricao, quantidade, valor });
      }
    }
  );
});

// Atualizar
app.put("/produtos/:id", (req, res) => {
  const id = req.params.id;
  const { descricao, quantidade, valor } = req.body;
  db.query(
    "UPDATE Produtos SET descricao = ?, quantidade = ?, valor = ? WHERE id = ?",
    [descricao, quantidade, valor, id],
    (err, results) => {
      if (err) {
        res.status(500).json({ message: "Erro ao atualizar produto" });
      } else {
        res.json({ id, descricao, quantidade, valor });
      }
    }
  );
});

// Remover
app.delete("/produtos/:id", (req, res) => {
  const id = req.params.id;
  db.query("DELETE FROM Produtos WHERE id = ?", [id], (err, results) => {
    if (err) {
      res.status(500).json({ message: "Erro ao remover produto" });
    } else {
      res.json({ message: "Produto removido com sucesso" });
    }
  });
});

// Iniciar
app.listen(port, () => {
  console.log(`Servidor iniciado na porta ${port}`);
});
