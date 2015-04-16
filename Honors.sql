 /*
DROP DATABASE honorsmedicaldoctor;
DROP USER 'HonorsAdmin'@'localhost';
*/

CREATE DATABASE honorsmedicaldoctor;

CREATE USER 'HonorsAdmin'@'localhost' IDENTIFIED BY 'h0n3r5a2m1n';
GRANT ALL PRIVILEGES ON honorsmedicaldoctor.* TO 'HonorsAdmin'@'localhost';
FLUSH PRIVILEGES;

USE honorsmedicaldoctor;

CREATE TABLE users (Username varchar(50) NOT NULL, 
					Password varchar(50) NOT NULL,
					Section varchar(50) NOT NULL,
                    PRIMARY KEY(Username));
                    
create table Patients (SSN varchar(11) NOT NULL,
					FirstName char(100) NOT NULL,
					LastName char(100) NOT NULL,
					Address char(100) NOT NULL,
					MedicalInsurance varchar(12) NOT NULL,
					DOB date NOT NULL,
					ZIP int(11) NOT NULL,
					Gender char(20) NOT NULL,
					NextVisit date NOT NULL,
					PRIMARY KEY(SSN));