create schema payroll_service;
use payroll_service;
CREATE TABLE employee_payroll (
	id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    salary double NOT NULL,
    start_date DATE NOT NULL,
    PRIMARY KEY (id)
);
DESC employee_payroll