insert into tb_participante (name, email ) values ('Jose Silva','jose@gmail.com');
insert into tb_participante (name, email ) values ('Tiago Faria','tiago@gmail.com');
insert into tb_participante (name, email ) values ('Maria do rosario','maria@gmail.com');
insert into tb_participante (name, email ) values ('Jose Silva','jose@gmail.com');

insert into tb_categoria (descripcion) values ('Curso');
insert into tb_categoria (descripcion) values ('Oficina');


insert into tb_atividade (name, description, valor,categoria_id) values ('Curso de HTML', 'Aprenda HTML de forma pratica', 50.00, 1);
insert into tb_atividade (name, description, valor, categoria_id) values ('Oficina de Github', 'Controle de versoes de seus projetos', 50.00, 2);



INSERT INTO tb_bloco ( comeco, fim, bloco_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z',1);
INSERT INTO tb_bloco ( comeco, fim , bloco_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z',2);
INSERT INTO tb_bloco ( comeco, fim , bloco_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', 2);

