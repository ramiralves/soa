INSERT INTO autor (id,nome,username, cpf, data_nascimento) VALUES (1,'RAMIR','RAMIRALVES','111111111',CURRENT_TIMESTAMP());
INSERT INTO endereco (id,cep,logradouro, numero, complemento, autor_id) VALUES (1,2072000,'TESTE LOGRADORO1', 80,'COMPLEMENTO TESTE', 1);
INSERT INTO endereco (id,cep,logradouro, numero, complemento, autor_id) VALUES (2,2072000,'TESTE LOGRADORO2', 80,'COMPLEMENTO TESTE', 1);

INSERT INTO pais (id, sigla, nome,endereco_id) VALUES (1,'BR','Brasil',1);
INSERT INTO cidade (id, sigla, nome,endereco_id) VALUES (1,'RJ','Rio de Janeiro',1);
INSERT INTO estado (id, sigla, nome,endereco_id) VALUES (1,'RJ','Rio de Janeiro',1);

INSERT INTO pais (id, sigla, nome,endereco_id) VALUES (2,'BR','Brasil',2);
INSERT INTO cidade (id, sigla, nome,endereco_id) VALUES (2,'RJ','Rio de Janeiro',2);
INSERT INTO estado (id, sigla, nome,endereco_id) VALUES (2,'RJ','Rio de Janeiro',2);