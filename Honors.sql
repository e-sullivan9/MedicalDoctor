
DROP DATABASE honorsmedicaldoctor;
DROP USER 'HonorsAdmin'@'localhost';


CREATE DATABASE honorsmedicaldoctor;

CREATE USER 'HonorsAdmin'@'localhost' IDENTIFIED BY 'h0n3r5a2m1n';
GRANT ALL PRIVILEGES ON honorsmedicaldoctor.* TO 'HonorsAdmin'@'localhost';
FLUSH PRIVILEGES;

USE honorsmedicaldoctor;

CREATE TABLE users (Username varchar(50) NOT NULL, 
					Password varchar(50) NOT NULL,
					Section char(50) NOT NULL,
                    PRIMARY KEY(Username));
                    
create table Patients (SSN varchar(11) NOT NULL,
					FirstName char(100) NOT NULL,
					LastName char(100) NOT NULL,
					Address char(100) NOT NULL,
					MedicalInsurance varchar(12) NOT NULL,
					DOB date NOT NULL,
					ZIP varchar(11) NOT NULL,
					Gender char(20) NOT NULL,
					NextVisit date,
					PRIMARY KEY(SSN));

create table Visits(
VID int AUTO_INCREMENT,
SSN varchar(11) NOT NULL,
VisitDate date NOT NULL,
ChiefComplaint char(10000) NOT NULL,
PresentIllness char(10000) NOT NULL,
PastHistory char(10000) NOT NULL,
ReviewOfTheSystem char(10000) NOT NULL,
PhysicalExam char(10000) NOT NULL,
Impression char(10000) NOT NULL,
DiagnosisByDoctor char(10000) NOT NULL,
NursingActivity char(10000) NOT NULL,
PRIMARY KEY(VID),
FOREIGN KEY(SSN) REFERENCES Patients(SSN) ON UPDATE CASCADE ON DELETE CASCADE
);

create table Labs (
LabID int AUTO_INCREMENT,
VID int NOT NULL,
RedBloodCell boolean NOT NULL,
WhiteBloodCell boolean NOT NULL,
LiverFunction boolean NOT NULL,
RenalFunction boolean NOT NULL,
Electrolyte boolean NOT NULL,
XRay boolean NOT NULL,
ComputedTomography boolean NOT NULL,
MRI boolean NOT NULL,
UrinaryTest boolean NOT NULL,
StoolTest boolean NOT NULL,
PRIMARY KEY(LabID),
FOREIGN KEY(VID) REFERENCES Visits(VID) ON UPDATE CASCADE ON DELETE CASCADE
);

create table Prescriptions (
ScriptID int AUTO_INCREMENT,
VID int NOT NULL,
IntramuscularInjection boolean NOT NULL,
IntravascularInjection boolean NOT NULL,
SubcutaneousInjection boolean NOT NULL,
OralMedication varchar(500),
PRIMARY KEY(ScriptID),
FOREIGN KEY(VID) REFERENCES Visits(VID) ON UPDATE CASCADE ON DELETE CASCADE
);