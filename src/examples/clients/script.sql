CREATE TABLE clients (
    id SERIAL PRIMARY KEY,
	firstName VARCHAR(50),
    cpf VARCHAR(14),
    phone VARCHAR(14)
);

INSERT INTO CLIENTES (firstName, cpf, phone) 
VALUES ('Cliente 1', '111.111.111-11', '(11) 1111-1111');

INSERT INTO CLIENTES (firstName, cpf, phone) 
VALUES ('Cliente 2', '222.222.222-22', '(22) 2222-2222');

INSERT INTO CLIENTES (firstName, cpf, phone) 
VALUES ('Cliente 3', '333.333.333-33', '(33) 3333-3333');