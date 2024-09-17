create database ex5;
CREATE TABLE categories (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25)
);
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25),
    amount DECIMAL(10, 2),
    price DECIMAL(10, 2),
    id_categories INT, 
		FOREIGN KEY (id_categories) REFERENCES categories(id)
);
INSERT INTO categories (name) 
	VALUES
        ('old stock'), 
        ('new stock'),  
        ('modern'), 
        ('commercial'), 
        ('recyclabe'), 
        ('executive'), 
        ('superior'), 
		('wood'), 
        ('super luxury'),
        ('vintage');
INSERT INTO products (name, amount, price, id_categories)
	VALUES 
		('Lampshade', 100, 800.00, 4),
		('Table for painting', 1000, 560.00, 9),
		('Notebook desk', 10000, 25.50, 9),
		('Computer desk', 350, 320.50, 6),
		('Chair', 3000, 210.64, 9),
		('Home alarm', 750, 460.00, 4);  

SELECT id, name FROM products
    WHERE id_categories = 9;
    
    
create database ex6;
CREATE TABLE providers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25),
    street VARCHAR(25),
    city VARCHAR(25),
    state CHAR(2)
);
INSERT INTO providers (name, street, city, state)
	VALUES
		("Henrique", "Av Brasil", "Rio de Janeiro", "RJ"),
		("Marcelo Augusto", "Rua Imigrantes", "Belo Horizonte", "MG"),
		("Caroline Silva", "Av São Paulo", "Salvador", "BA"),
		("Guilerme Staff", "Rua Central", "Porto Alegre", "RS"),
		("Isabela Moraes", "Av Juiz Grande", "Curitiba", "PR"),
		("Francisco Accerr", "Av Paulista", "São Paulo", "SP");

SELECT DISTINCT city FROM providers ORDER BY city ASC;

create database ex7;
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25),
    amount DECIMAL(10, 2),
    price DECIMAL(10, 2)
);
INSERT INTO products (name, amount, price)
	VALUES 
		('Two-doors wardrobe', 100, 800.00),
		('Dining table', 1000, 560.00),
		('Tower holder', 10000, 25.50),
		('Computer desk', 350, 320.50),
		('Chair', 3000, 210.64),
		('Single bed', 750, 460.00);  

SELECT max(price), min(price) FROM products;


create database ex8;
CREATE TABLE categories (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25)
);
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25),
    amount DECIMAL(10, 2),
    price DECIMAL(10, 2),
    id_categories INT, 
		FOREIGN KEY (id_categories) REFERENCES categories(id)
);
INSERT INTO categories (name) 
	VALUES 
		('wood'), 
        ('luxury'), 
        ('vintage'), 
        ('modern'), 
        ('super luxury');
INSERT INTO products (name, amount, price, id_categories)
	VALUES 
		('Two-doors wardrobe', 100, 800.00, 1),
		('Dining table', 1000, 560.00, 3),
		('Tower holder', 10000, 25.50, 4),
		('Computer desk', 350, 320.50, 2),
		('Chair', 3000, 210.64, 4),
		('Single bed', 750, 460.00, 1);  

SELECT categories.name, sum(products.amount)
	FROM products
    INNER JOIN categories ON products.id_categories = categories.id
    GROUP BY categories.name;
    
    
create database ex9;
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25),
    amount DECIMAL(10, 2),
    price DECIMAL(10, 2)
);
INSERT INTO products (name, amount, price)
	VALUES 
		('Two-doors wardrobe', 100, 800.00),
		('Dining table', 1000, 560.00),
		('Tower holder', 10000, 25.50),
		('Computer desk', 350, 320.50),
		('Chair', 3000, 210.64),
		('Single bed', 750, 460.00);  
        
SELECT ROUND(AVG(price), 2) FROM products;


CREATE database ex10;
CREATE TABLE genres (
    id INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255)
);
CREATE TABLE movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60),
    id_genres INT,
		FOREIGN KEY (id_genres) REFERENCES genres(id)
);
INSERT INTO genres (description) 
	VALUES
		('Animation'),
		('Horror'),
		('Action'),
		('Drama'),
		('Comedy');
INSERT INTO movies (name, id_genres) 
	VALUES
		('Batman', 3),
		('The Battle of the Dark River', 3),
		('White Duck', 1),
		('Breaking Barriers', 4),
		('The Two Hours', 2);

SELECT movies.id, movies.name FROM movies
	JOIN genres ON movies.id_genres = genres.id
	WHERE genres.description = 'Action';


CREATE database ex11;
CREATE TABLE prices (
    id INT AUTO_INCREMENT PRIMARY KEY,
    categorie VARCHAR(60),
    value DECIMAL(10, 2)
);
CREATE TABLE movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60),
    id_prices INT,
		FOREIGN KEY (id_prices) REFERENCES prices(id)
);
INSERT INTO prices (categorie, value) 
	VALUES
		('Releases', 3.50),
		('Bronze Seal', 2.00),
		('Silver Seal', 2.50),
		('Gold Seal', 3.00),
		('Promotion', 1.50);
INSERT INTO movies (name, id_prices) 
	VALUES
		('Batman', 3),
		('The Battle of the Dark River', 3),
		('White Duck', 5),
		('Breaking Barriers', 4),
		('The Two Hours', 2);

SELECT movies.id, movies.name FROM movies
	JOIN prices ON movies.id_prices = prices.id
	WHERE prices.value < 2.00;


CREATE database ex12;
CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60),
    street VARCHAR(60),
    city VARCHAR(60)
);
CREATE TABLE rentals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    rentals_date DATE,
    id_customers INT,
		FOREIGN KEY (id_customers) REFERENCES customers(id)
);
INSERT INTO customers (name, street, city) 
	VALUES
		('Giovanna G. Oliveira', 'Rua Mato Grosso', 'Canoas'),
		('Kauã Azevedo Ribeiro', 'Travessa Ibiá', 'Uberlândia'),
		('Rebeca Barbosa Santos', 'Rua Observatório Meteorológico', 'Salvador'),
		('Sarah Carvalho Correia', 'Rua Antônio Carlos da Silva', 'Apucarana'),
		('João Almeida Lima', 'Rua Rio Taiuva', 'Ponta Grossa'),
		('Diogo Melo Dias', 'Rua Duzentos e Cinqüenta', 'Várzea Grande');
INSERT INTO rentals (rentals_date, id_customers) 
	VALUES
		('2016-09-10', 3),
		('2016-02-09', 1),
		('2016-02-08', 4),
		('2016-02-09', 2),
		('2016-02-03', 6),
		('2016-04-04', 4);

SELECT customers.name, rentals.rentals_date
	FROM rentals
	JOIN customers ON rentals.id_customers = customers.id
	WHERE rentals.rentals_date BETWEEN '2016-09-01' AND '2016-09-30';

