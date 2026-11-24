DROP DATABASE IF EXISTS currency_converter;

CREATE DATABASE currency_converter;

USE currency_converter;

CREATE TABLE Currency (
        id INT NOT NULL AUTO_INCREMENT,
        abbreviation VARCHAR(50) NOT NULL UNIQUE,
        name VARCHAR(50) NOT NULL,
        rate DECIMAL(11,8) NOT NULL,
        PRIMARY KEY (id)
     );

INSERT INTO Currency (abbreviation, name, rate) VALUES
    ('USD', 'US Dollar', 1.00000000),
    ('EUR', 'Euro', 0.91175539),
    ('GBP', 'British Pound', 0.76437942),
    ('CAD', 'Canadian Dollar', 1.43569473),
    ('AUD', 'Australian Dollar', 1.50942996),
    ('CHF', 'Swiss Franc', 0.84253997),
    ('JPY', 'Japanese Yen', 158.98183045),
    ('SEK', 'Swedish Krona', 10.26975493);

DROP user IF EXISTS 'appuser'@'localhost';

CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';

GRANT SELECT, INSERT, UPDATE, DELETE ON currency_converter.* TO 'appuser'@'localhost';
