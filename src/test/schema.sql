
CREATE TABLE IF NOT EXISTS User (
    id VARCHAR(36) NOT NULL,
    username VARCHAR(50) NOT NULL,
    cnpj VARCHAR(14) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    address VARCHAR(255),
    cellPhone VARCHAR(20),
    adm CHAR(1),
    PRIMARY KEY (id)
    );


    CREATE TABLE IF NOT EXISTS Orders (
    id VARCHAR(255) NOT NULL,
    data_pedido VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
    );
