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
		('hossein','sql',1250),
		('ali','sql',1550),
		('vahid','java',1900),
		('mahdi','sql',550);
		
SELECT * FROM Employee WHERE name = 'ali';

SELECT * FROM Employee WHERE salary < 1000;

SELECT department, avg(salary) FROM Employee GROUP BY department;


	