CREATE TABLE `empresa`.`products` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `amount` INT NULL,
  `price` DOUBLE NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `empresa`.`products` (`id`,`name`,`amount`,`price`)
	VALUES (1, "Two-door wardrobe", 100, 80);
INSERT INTO `empresa`.`products` (`id`,`name`,`amount`,`price`)
	VALUES (2, "Dining table", 1000, 560);
INSERT INTO `empresa`.`products` (`id`,`name`,`amount`,`price`)
	VALUES (3, "Towel holder", 10000, 5.50);
INSERT INTO `empresa`.`products` (`id`,`name`,`amount`,`price`)
	VALUES (4, "Computer desk", 350, 100);
INSERT INTO `empresa`.`products` (`id`,`name`,`amount`,`price`)
	VALUES (5, "Chair", 3000, 210.64);
INSERT INTO `empresa`.`products` (`id`,`name`,`amount`,`price`)
	VALUES (6, "Single bed", 750, 99);
    
SELECT id, name FROM products 
	WHERE price < 10 or price > 100