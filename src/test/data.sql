/*
INSERT INTO User (id, username, cnpj, email, password, address, cellPhone, adm) VALUES
('1', 'admin', '12345678901234', 'admin@example.com', 'admin123', 'Admin Address', 1234567890, 'Y'),
('2', 'user1', '98765432109876', 'user1@example.com', 'user123', 'User1 Address', 9876543210, 'N');*//*



use woodstock;

select * from User;

DROP table User;

INSERT INTO User (username, cnpj, email, password, address, cell_phone, adm) VALUES
                                                                                 ('admin', '12345678901234', 'admin@example.com', 'admin123', 'Admin Address', 1234567890, 'Y'),
                                                                                 ('user1', '98765432109876', 'user1@example.com', 'user123', 'User1 Address', 9876543210, 'N');


CREATE TABLE IF NOT EXISTS User (
                                    id INT AUTO_INCREMENT PRIMARY KEY,
                                    username VARCHAR(50) NOT NULL,
                                    cnpj VARCHAR(14) NOT NULL,
                                    email VARCHAR(100) NOT NULL,
                                    password VARCHAR(100) NOT NULL,
                                    address VARCHAR(255),
                                    cell_phone VARCHAR(30),
                                    adm CHAR(1)
);*/
