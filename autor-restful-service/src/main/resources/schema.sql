DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS APP_USER_APP_USER_ROLES;
DROP TABLE IF EXISTS cidade;
DROP TABLE IF EXISTS estado;
DROP TABLE IF EXISTS pais;
DROP TABLE IF EXISTS endereco;
DROP TABLE IF EXISTS autor;


CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  username VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);

CREATE TABLE APP_USER_APP_USER_ROLES (
  app_user_id INT AUTO_INCREMENT  PRIMARY KEY,
  app_user_roles VARCHAR(250) NOT NULL
);


CREATE TABLE autor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  username VARCHAR(250) NOT NULL,
  cpf VARCHAR(250) DEFAULT NULL,
  data_nascimento DATE
);

CREATE TABLE endereco (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  cep INT,
  logradouro VARCHAR(250),
  numero INT,
  complemento VARCHAR(250),
  autor_id INT,
  foreign key (autor_id) references autor(id)
);

CREATE TABLE cidade (
  id INT AUTO_INCREMENT  PRIMARY KEY,  
  sigla VARCHAR(10),
  nome VARCHAR(250),  
  endereco_id INT,
  foreign key (endereco_id) references endereco(id)
);

CREATE TABLE estado (
  id INT AUTO_INCREMENT  PRIMARY KEY,  
  sigla VARCHAR(10),
  nome VARCHAR(250),  
  endereco_id INT,
  foreign key (endereco_id) references endereco(id)
);

CREATE TABLE pais (
  id INT AUTO_INCREMENT  PRIMARY KEY,  
  sigla VARCHAR(10),
  nome VARCHAR(250),  
  endereco_id INT,
  foreign key (endereco_id) references endereco(id)
);
