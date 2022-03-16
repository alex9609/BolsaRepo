DROP TABLE `a2censo`.`campaign`;
CREATE TABLE IF NOT EXISTS `a2censo`.`campaign` (
`idcampaign` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(200) NOT NULL,
`amount` DECIMAL(12) NOT NULL,
`requested_amount` DECIMAL(12) NOT NULL,
`admin_rate` DECIMAL(12) NULL,
PRIMARY KEY (`idcampaign`))
ENGINE = InnoDB;

INSERT INTO campaign (name,amount,requested_amount) VALUES('RobinFood 2.0', 200000000, 250000000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('T4 Tea For U', 1000000000, 1200000000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Smoking Burgers', 200000000, 200000000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Rappi', 313622, 21222);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Dominos', 4541111, 1029192919);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Crepes & Wafles', 5561111, 34111111);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Kokoriko', 212333, 500000000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Nu Bank', 34555555555, 12666666666);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Scotia Bank', 4500000, 111111111);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Mercado Libre', 6500000000, 45555555555);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Platzi', 56000000, 120000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Udemy', 205600000, 200000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Merkeo', 210000, 250000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Mensajeros Urbanos', 3511111, 3431111);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Nequi', 900000, 98000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Daviplata', 45000, 55000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('La haus', 3120000, 450000);
INSERT INTO campaign (name,amount,requested_amount) VALUES('Addi', 200000000, 200000000);

SELECT * FROM a2censo.campaign;

SELECT `name`FROM a2censo.campaign ORDER BY amount asc;
SELECT `name`FROM a2censo.campaign ORDER BY amount desc;
SELECT `name`FROM a2censo.campaign ORDER BY requested_amount asc;
SELECT `name`FROM a2censo.campaign ORDER BY requested_amount desc;
