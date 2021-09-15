CREATE DATABASE company;

USE company;

CREATE TABLE Employee (
	id int NOT NULL AUTO_INCREMENT ,
	name varchar(255),
	department varchar(255),
	salary double ,
	PRIMARY KEY (id)
);

INSERT INTO Employee(name,department,salary)
VALUES  ('ali','java',850),
		('hossein','sql',1000),
		('ali','sql',1500),
		('vahid','java',1900),
		('mahdi','sql',500);
		
SELECT * FROM Employee WHERE name = 'ali';

SELECT * FROM Employee WHERE salary < 1000;

SELECT  avg(salary) FROM Employee;


	