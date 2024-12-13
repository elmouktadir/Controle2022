CREATE DATABASE ctrl2;

USE ctrl2;

CREATE TABLE membre(
    id VARCHAR(50)  PRIMARY KEY,
    nom VARCHAR(30) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    email VARCHAR(40) NOT NULL,
    phone VARCHAR(20) NOT NULL
);

CREATE TABLE incident(
    reference VARCHAR(50) PRIMARY KEY,
    time DATE NOT NULL,
    status VARCHAR(50) NOT NULL,
    membreId VARCHAR(50) NOT NULL ,
    FOREIGN KEY (membreId) REFERENCES membre(id)
);