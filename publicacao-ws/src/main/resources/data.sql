INSERT INTO autor (id,cpf, nome) VALUES (1,'111111111111','teste111');
INSERT INTO autor (id,cpf, nome) VALUES (2,'222222222222','teste222');
INSERT INTO autor (id,cpf, nome) VALUES (3,'333333333333','teste333');

INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (1,'TITULO11111',1,10,2020);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (2,'TITULO22222',1,10,2020);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (3,'TITULO33333',1,10,2020);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (4,'TITULO44444',1,10,2020);
INSERT INTO publicacao (id, titulo, pagina_inicial, pagina_final, ano_publicao) VALUES (5,'TITULO55555',1,10,2020);

INSERT INTO autor_publicacao(autor_id,publicao_id) values (1,1);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (1,2);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (2,1);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (2,2);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (3,2);
INSERT INTO autor_publicacao(autor_id,publicao_id) values (3,3);