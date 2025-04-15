-- V2: Migrations para adicionar coluna de altura na tabela de cadastro.

ALTER TABLE tb_cadastro
ADD COLUMN altura VARCHAR(50);

-- Estamos criando uma nova coluna na nossa tabela, onde adicionamos a coluna altura com uma string de 50 caracteres;
-- ALTER = Alterar Table = Tabela "NOME DA TABELA", no caso (tb_cadastro) e em baixo, adicionar coluna de string 50 caracteres.