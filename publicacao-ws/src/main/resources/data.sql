INSERT INTO autor (id,cpf, nome) VALUES (1,'12723786323','Eric A. Marks,Michael Bell');
INSERT INTO autor (id,cpf, nome) VALUES (2,'01712423860','Nathan Austin');
INSERT INTO autor (id,cpf, nome) VALUES (3,'11516241525','Nasser Modiri');
INSERT INTO autor (id,cpf, nome) VALUES (4,'15676599502','da Silva, A. F., Azevedo');
INSERT INTO autor (id,cpf, nome) VALUES (5,'45231585335','L. G., Ohta, R. L.');
INSERT INTO autor (id,cpf, nome) VALUES (6,'75231672335','Binotto, A. P. D.dos Santos');
INSERT INTO autor (id,cpf, nome) VALUES (7,'91115923382','dos Santos, M. N');
INSERT INTO autor (id,cpf, nome) VALUES (8,'45815519197','Gandour, F. L');

INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (1,'SOA Technology and Services Integration Model',1,10,2020);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (2,'Enterprise Integration Using Service Oriented Architecture',30,70,2010);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (3,'Arriving at a Service-Oriented Architecture As a Solution for Integrated Justice Information',1,17,2019);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (4,'Trends and best practices for integration using SOA. Overview. Contents',10,30,2021);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (5,'Issues in Information Systems',15,20,2021);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (6,'A cloud-based architecture for the internet of things targeting industrial engine remote monitoring',15,20,2021);

INSERT INTO autor_publicacao(autor_id,publicao_id) values (1,1);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (1,2);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (2,1);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (2,2);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (3,2);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (3,3);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (4,6);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (5,6);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (6,6);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (7,6);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (8,6);