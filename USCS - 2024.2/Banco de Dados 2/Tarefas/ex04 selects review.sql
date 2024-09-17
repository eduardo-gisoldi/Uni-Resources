ALTER TABLE `empresa`.`products` 
ADD COLUMN `id_providers` INT NULL AFTER `price`,
ADD COLUMN `id_categories` INT NULL AFTER `id_providers`;

UPDATE products SET id_providers = 6, id_categories = 8 WHERE id = 1;
UPDATE products SET id_providers = 1, id_categories = 9 WHERE id = 2;
UPDATE products SET id_providers = 5, id_categories = 1 WHERE id = 3;
UPDATE products SET id_providers = 4, id_categories = 6 WHERE id = 4;
UPDATE products SET id_providers = 3, id_categories = 6 WHERE id = 5;
UPDATE products SET id_providers = 1, id_categories = 2 WHERE id = 6;

SELECT name, id_providers FROM products 
	WHERE id_categories = 6