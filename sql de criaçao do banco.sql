create database aula2410;
use aula2410;

create table pedidos (
	CODIGO int auto_increment, 
        CLIENTE varchar(50),
        ENDERECO varchar(50),
        ESTADO varchar(2),
        ITENS varchar(50),
        TOTAL double,
        primary key(CODIGO)
);
	
