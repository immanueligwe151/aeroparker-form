CREATE DATABASE aeroparker;

CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON aeroparker.* TO 'springuser'@'localhost';
FLUSH PRIVILEGES;

CREATE TABLE customers (
	id INT AUTO_INCREMENT PRIMARY KEY,
    registered DATETIME NOT NULL,
    email_address VARCHAR(255) NOT NULL UNIQUE,
    title VARCHAR(5) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
	address_line_1 VARCHAR(255) NOT NULL,
	address_line_2 VARCHAR(255),
	city VARCHAR(255),
	postcode VARCHAR(10) NOT NULL,
	phone_number VARCHAR(20)
);