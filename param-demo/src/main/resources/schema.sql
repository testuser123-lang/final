DROP TABLE IF EXISTS FARMER;

CREATE TABLE FARMER(
	FARMER_ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NAME varchar(40) NOT NULL,
    AGE int  NOT NULL,
    GENDER varchar(80) NOT NULL
    );