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

create table Visits(
VID int AUTO_INCREMENT,
SSN varchar(11) NOT NULL,
VisitDate date NOT NULL,
ChiefComplaint char(100) NOT NULL,
PresentIllness char(100) NOT NULL,
PastHistory char(100) NOT NULL,
ReviewOfTheSystem char(100) NOT NULL,
PhysicalExam char(100) NOT NULL,
Impression char(100) NOT NULL,
DiagnosisByDoctor char(100) NOT NULL,
NursingActivity char(100) NOT NULL,
PRIMARY KEY(VID),
FOREIGN KEY(SSN) REFERENCES Patients(SSN)
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
FOREIGN KEY(VID) REFERENCES Visits(VID)
);