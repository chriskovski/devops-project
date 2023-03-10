CREATE DATABASE mydatabase;
USE mydatabase;

CREATE TABLE mytable (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    PRIMARY KEY (id)
);

INSERT INTO mytable (name, age) VALUES ('Chris', 27);
INSERT INTO mytable (name, age) VALUES ('Felix', 26);
