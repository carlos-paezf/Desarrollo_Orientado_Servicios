CREATE TABLE department (
    id_department SMALLSERIAL PRIMARY KEY,
    name VARCHAR(30) NOT NULL
) ;

CREATE TABLE city (
    id_city SMALLSERIAL PRIMARY KEY,
    id_department SMALLINT NOT NULL,
    name VARCHAR(40) NOT NULL
) ;

CREATE TABLE warehouse(
    id_warehouse SMALLSERIAL PRIMARY KEY,
    id_city SMALLINT NOT NULL,
    address VARCHAR(70) NOT NULL,
    administrator VARCHAR(50) NOT NULL,
    capacity_per_m2 VARCHAR(13) NOT NULL
) ;

CREATE TABLE stock (
    id_stock BIGSERIAL PRIMARY KEY,
    id_warehouse SMALLINT NOT NULL,
    units SMALLINT NOT NULL,
    unitary_cost REAL NOT NULL,
    id_supplier SMALLINT NOT NULL,
    id_product SMALLINT NOT NULL
) ;

CREATE TABLE product (
    id_product SMALLSERIAL PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    description VARCHAR(200) NOT NULL
) ;

CREATE TABLE client (
    id_client BIGSERIAL PRIMARY KEY,
    birthdate DATE NOT NULL,
    name VARCHAR(60) NOT NULL,
    document VARCHAR(11) NOT NULL,
    contact_number VARCHAR(13),
    contact_email VARCHAR(30),
    gender VARCHAR(1) NOT NULL
) ;

CREATE TABLE invoice (
    id_invoice BIGSERIAL PRIMARY KEY,
    sale_date TIMESTAMP NOT NULL,
    sold_units SMALLINT NOT NULL,
    sell_price REAL NOT NULL,
    id_client BIGINT,
    id_stock BIGINT NOT NULL
) ;

CREATE TABLE supplier (
    id_supplier SMALLSERIAL PRIMARY KEY,
    company_name VARCHAR(30) NOT NULL,
    incharge_person VARCHAR(60) NOT NULL,
    contact_number VARCHAR(13) NOT NULL
) ;


ALTER TABLE city
    ADD CONSTRAINT FK_City_Department
    FOREIGN KEY (id_department)
    REFERENCES department (id_department)
    ON DELETE CASCADE;

ALTER TABLE warehouse
    ADD CONSTRAINT FK_City_Warehouse
    FOREIGN KEY (id_city)
    REFERENCES city (id_city)
    ON DELETE CASCADE;

ALTER TABLE stock
    ADD CONSTRAINT FK_Stock_Warehouse
    FOREIGN KEY (id_warehouse)
    REFERENCES warehouse (id_warehouse)
    ON DELETE CASCADE,
    ADD CONSTRAINT FK_Product_Stock
    FOREIGN KEY (id_product)
    REFERENCES product (id_product)
    ON DELETE CASCADE,
    ADD CONSTRAINT FK_Stock_Supplier
    FOREIGN KEY (id_supplier)
    REFERENCES supplier (id_supplier)
    ON DELETE CASCADE;

ALTER TABLE invoice
    ADD CONSTRAINT FK_Client_Invoice
    FOREIGN KEY (id_client)
    REFERENCES client (id_client)
    ON DELETE CASCADE,
    ADD CONSTRAINT FK_Invoice_Stock
    FOREIGN KEY (id_stock)
    REFERENCES stock (id_stock)
    ON DELETE CASCADE;
