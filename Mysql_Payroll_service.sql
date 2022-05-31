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
INSERT INTO employee_payroll ( id, name, salary, start_date)
VALUES 
('123' , 'Mahesh' , '30000' , '2021-10-05' ),
('456' , 'Surab' , '37000' , '2021-09-30' ),
('789' , 'Sneha' , '35000' , '2020-10-05'),
('890' , 'Bindu' , '40000' , '2019-09-29'),
('012' , 'kiran' , '100000' , '2018-01-05');
