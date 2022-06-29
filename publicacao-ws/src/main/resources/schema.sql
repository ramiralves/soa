/*
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS publicacao;
DROP TABLE IF EXISTS autor_publicacao;

CREATE TABLE autor (
    id   INTEGER      	NOT NULL AUTO_INCREMENT,
    cpf VARCHAR(12) 	NOT NULL,
    nome VARCHAR(128) 	NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE publicacao (
    id   INTEGER      		NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) 	NOT NULL,
    pagina_inicial INTEGER 	NULL,
    pagina_final INTEGER 	NULL,
    ano_publicao INTEGER 	NULL,
    autor_id INTEGER 		NOT NULL,
    PRIMARY KEY (id)  
);

CREATE TABLE autor_publicacao (
    autor_id   	INTEGER      		NOT NULL,
    publicao_id INTEGER      		NOT NULL,
    PRIMARY KEY (autor_id,publicao_id),
    foreign key(autor_id) references autor(id),
    foreign key(publicao_id) references publicacao(id)
);
*/
  

 