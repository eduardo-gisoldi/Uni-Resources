-- criação das tabelas --
CREATE DATABASE exsProcedure;
CREATE TABLE depto (cod_depto INT PRIMARY KEY auto_increment, nome VARCHAR(50));
CREATE TABLE empregado (
	cod_empregado INT PRIMARY KEY auto_increment,
    nome VARCHAR(50),
    dt_nascimento date,
    sexo CHAR(1),
    dt_admissao date,
    est_civil CHAR(1),
    salario decimal(10, 2),
    cod_depto INT,
    foreign key (cod_depto) REFERENCES depto(cod_depto)
);
CREATE TABLE dependente (
	cod_dependente INT PRIMARY KEY auto_increment,
    nome VARCHAR(50),
    dt_nascimento date,
    sexo CHAR(1),
    cod_empregado INT,
    foreign key (cod_empregado) REFERENCES empregado(cod_empregado)
);

-- ex 2 --
INSERT INTO depto (nome) 
	VALUES ('Desenvolvimento');
INSERT INTO empregado (nome, dt_nascimento, sexo, dt_admissao, est_civil, salario, cod_depto)
	VALUES ('Ana Silva', '1990-05-12', 'F', '2020-01-10', 'C', 3000.00, 1);
INSERT INTO empregado (nome, dt_nascimento, sexo, dt_admissao, est_civil, salario, cod_depto)
	VALUES ('Ana Silva 2', '1990-05-12', 'F', '2020-01-10', 'C', 7000.00, 1);
INSERT INTO empregado (nome, dt_nascimento, sexo, dt_admissao, est_civil, salario, cod_depto)
	VALUES ('Ana Silva 3', '1990-05-12', 'F', '2020-01-10', 'C', 1500.00, 1);
INSERT INTO depto (nome) 
	VALUES ('Analise');
INSERT INTO empregado (nome, dt_nascimento, sexo, dt_admissao, est_civil, salario, cod_depto)
	VALUES ('Ana Silva 4', '1990-05-12', 'F', '2020-01-10', 'C', 3000.00, 2);

-- ex 3 --
DELIMITER $$
CREATE PROCEDURE SalariosDepto (IN cod_depto INT)
BEGIN
	SELECT 
		SUM(salario) AS soma_salarios,
		AVG(salario) AS media_salarial,
		MAX(salario) AS maior_salario,
		MIN(salario) AS menor_salario
	FROM empregado
	
    WHERE cod_depto = cod_depto;
END $$
DELIMITER ;

CALL SalariosDepto(1);

-- ex 4 --
DELIMITER $$
CREATE PROCEDURE SexosDepto (IN nome_depto VARCHAR(50))
BEGIN
	SELECT 
		COUNT(CASE WHEN sexo = 'M' THEN 1 END) AS qntdd_Masc,
		COUNT(CASE WHEN sexo = 'F' THEN 1 END) AS qntdd_Fem
	FROM empregado
		JOIN depto ON empregado.cod_depto = depto.cod_depto
	
    WHERE depto.nome = nome_depto;
END $$
DELIMITER ;

CALL SexosDepto("Desenvolvimento");

-- ex 5 --
DELIMITER $$
CREATE PROCEDURE InserirDepto (IN cod INT, IN nome VARCHAR(50))
BEGIN
	INSERT INTO depto (cod_depto, nome) 
		VALUES (cod, nome);
END $$
DELIMITER ;

CALL InserirDepto(3, "Controle de Qualidade");

-- ex 6 --
	-- Desabilitar o safe update mode temporariamente
SET SQL_SAFE_UPDATES = 0;

DELIMITER $$
CREATE PROCEDURE Aumento5Fem ()
BEGIN
	UPDATE empregado
	SET salario = salario * 1.05
	WHERE sexo = 'F' AND cod_empregado IS NOT NULL;
END $$
DELIMITER ;

CALL Aumento5Fem();
	-- Habilitar novamente o safe update mode
SET SQL_SAFE_UPDATES = 1;

-- ex 7 --
	-- Desabilitar o safe update mode temporariamente
SET SQL_SAFE_UPDATES = 0;

DELIMITER $$
CREATE PROCEDURE AumentoMasc (IN aumento INT)
BEGIN
	UPDATE empregado
	SET salario = salario * (1 + (aumento / 100))
	WHERE sexo = 'M' AND cod_empregado IS NOT NULL;
END $$
DELIMITER ;

CALL AumentoMasc(15);
	-- Habilitar novamente o safe update mode
SET SQL_SAFE_UPDATES = 1;

-- ex 8 --
CREATE TABLE sexo (cod_sexo CHAR(1) PRIMARY KEY);
ALTER TABLE empregado
	ADD cod_sexo CHAR(1),
	ADD FOREIGN KEY (cod_sexo) REFERENCES sexo(cod_sexo);

-- ex 9 --
CREATE TABLE estado_civil (cod_estado_civil CHAR(1) PRIMARY KEY);
ALTER TABLE empregado
	ADD cod_estado_civil CHAR(1),
	ADD FOREIGN KEY (cod_estado_civil) REFERENCES estado_civil(cod_estado_civil);

-- ex 10 --
INSERT INTO dependente (nome, dt_nascimento, sexo, cod_empregado)
	VALUES ('João da Silva', '1990-05-13', 'M', 1);
INSERT INTO dependente (nome, dt_nascimento, sexo, cod_empregado)
	VALUES ('Abdré da Silva', '1990-05-14', 'M', 1);

DELIMITER $$
CREATE PROCEDURE ExibeDependentes (IN nome_input VARCHAR(50))
BEGIN
	SELECT dependente.nome, dependente.dt_nascimento, dependente.sexo
	FROM dependente
		JOIN empregado ON empregado.cod_empregado = dependente.cod_empregado
	WHERE empregado.nome = nome_input;
END $$
DELIMITER ;

CALL ExibeDependentes('Ana Silva');