CREATE DATABASE spice_shop;

USE spice_shop;

CREATE TABLE item (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(100) NOT NULL,
                      category VARCHAR(50),
                      quantity INT NOT NULL,
                      price DOUBLE NOT NULL
);

CREATE TABLE sale (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      date DATETIME DEFAULT CURRENT_TIMESTAMP,
                      total DOUBLE
);

CREATE TABLE sale_item (
                           sale_id INT,
                           item_id INT,
                           quantity INT,
                           price DOUBLE,
                           FOREIGN KEY (sale_id) REFERENCES sale(id),
                           FOREIGN KEY (item_id) REFERENCES item(id)
);
