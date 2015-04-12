/* Eric probably already has this database CREATE DATABASE honorsmedicaldoctor; */

CREATE USER 'HonorsAdmin'@'localhost' IDENTIFIED BY 'h0n3r5a2m1n';
GRANT ALL PRIVILEGES ON honorsmedicaldoctor.* TO 'HonorsAdmin'@'localhost';
FLUSH PRIVILEGES;
USE honorsmedicaldoctor;

/*

Eric also probably already has this table

CREATE TABLE users (Username varchar(50) NOT NULL, 
					Password varchar(50) NOT NULL,
					Section varchar(50) NOT NULL,
                    PRIMARY KEY(Username));
                    
*/