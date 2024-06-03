
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
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    data_pedido VARCHAR(255) NOT NULL,
    quantidade_produto_pedido int(14) NOT NULL,
    valor_pedido VARCHAR(255) NOT NULL,
    user_id INT NOT NULL, 
    produto_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (produto_id) REFERENCES User(id)
);

CREATE TABLE IF NOT EXISTS Produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    quantidade INT (14) not null,
    descricao VARCHAR(50) NOT NULL,
    valor INT(14) NOT NULL
    );