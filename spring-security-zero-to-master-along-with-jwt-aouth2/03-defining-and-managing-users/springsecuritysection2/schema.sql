CREATE SCHEMA IF NOT EXISTS EAZYBANK;

SET search_path TO EAZYBANK;

CREATE TABLE IF NOT EXISTS users (
    id SERIAL,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    enabled INT NOT NULL,
    primary key (id)
);

CREATE TABLE IF NOT EXISTS authorities (
    id SERIAL,
    username VARCHAR(45) NOT NULL,
    authority VARCHAR(45) NOT NULL,
    primary key (id)
);

INSERT INTO users ( username, password, enabled ) VALUES ( 'happy', '12345', '1' );
INSERT INTO authorities ( username, authority ) VALUES ( 'happy', 'write' );

CREATE TABLE IF NOT EXISTS customer (
    id SERIAL,
    email VARCHAR(45) NOT NULL,
    pwd VARCHAR(45) NOT NULL,
    role VARCHAR(45) NOT NULL,
    primary key (id)
);

INSERT INTO customer ( email, pwd, role ) VALUES ( 'johndoe@example.com', '54321', 'admin' );