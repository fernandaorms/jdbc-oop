CREATE TABLE vehicles (
    id SERIAL PRIMARY KEY,
    model VARCHAR(50),
    brand VARCHAR(50),
    price DECIMAL(10,2)
);

INSERT INTO vehicles (model, brand, price)
VALUES ('Argo', 'Fiat', 78000.00);

INSERT INTO vehicles (model, brand, price)
VALUES ('Onix', 'Chevrolet ', 82000.00);

INSERT INTO vehicles (model, brand, price)
VALUES ('HB20', 'Hyundai', 79000.00);