create table Users(
Username varchar(12) NOT NULL,
Password varchar(20) NOT NULL,
Section char(20) NOT NULL,
PRIMARY KEY(Username));

create table Patients(
SSN varchar(11) NOT NULL,
FirstName char(100) NOT NULL,
LastName char(100) NOT NULL,
Address char(100) NOT NULL,
MedicalInsurance varchar(12) NOT NULL,
DOB date NOT NULL,
ZIP int(11) NOT NULL,
Gender char(20) NOT NULL,
NextVisit date NOT NULL,
PRIMARY KEY(SSN));