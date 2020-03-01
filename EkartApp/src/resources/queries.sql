SHOW DATABASES;
USE classicmodels;
SELECT DATABASE();

SHOW TABLES;
mysql> SHOW TABLES;
+-------------------------+
| Tables_in_classicmodels |
+-------------------------+
| customers    =  122      |
| employees    =   23      |
| offices      =    7      |
| orderdetails = 2996      |
| orders       =  326      |
| payments     =  273      |
| productlines =    7      |
| products     =  110      |
+-------------------------+
8 rows in set (0.00 sec)


//COUNTS
select count(*) from customers;
select count(*) from employees;
select count(*) from offices;
select count(*) from orderdetails;
select count(*) from orders;
select count(*) from payments;
select count(*) from productlines;
select count(*) from products;


//select
select firstname,lastname,jobtitle from employees;
select ordernumber, orderlinenumber, quantityordered * priceeach from orderdetails limit 25;

//order by
//Default by asc
select employeenumber, firstname, lastname from employees order by firstname;

select employeenumber, firstname, lastname from employees order by firstname desc;

//order by on two columns
select employeenumber, firstname, lastname from employees order by firstname desc,lastname desc;

select ordernumber, orderlinenumber, quantityordered, priceeach, quantityordered * priceeach from orderdetails 
order by quantityordered * priceeach asc limit 25;

select ordernumber, orderlinenumber, quantityordered, priceeach, quantityordered * priceeach as subtotal from orderdetails 
order by subtotal asc limit 25;

// Custom order by

SELECT orderNumber, status
FROM orders
ORDER BY FIELD(status, 'In Process', 'On Hold', 'Cancelled', 'Resolved', 'Disputed', 'Shipped')
LIMIT 25;

//distinct usage
select distinct status from orders;
select count(distinct status) from orders;
select count(distinct status) as status  from orders;
select distinct status from orders order by status;
select distinct status from orders order by status desc;

//where usage
select employeenumber, lastname, firstname,officecode from employees where jobtitle = 'Sales Rep';
select employeenumber, lastname, firstname,officecode from employees where jobtitle = 'Sales Rep' and officecode = 1;

select employeenumber, lastname, firstname,officecode, jobtitle from employees 
where jobtitle = 'Sales Rep' or officecode = 1 order by officecode, jobtitle;

SELECT firstName, lastName, officeCode FROM employees WHERE officeCode BETWEEN 1 AND 3 ORDER BY officeCode;

SELECT firstname, lastname from employees where lastname like '%son';
SELECT employeenumber, lastname, firstname, officecode from employees where officecode IN(5,6,7);

SELECT lastName, firstName, reportsTo FROM employees WHERE reportsTo IS NULL;
SELECT lastName, firstName, officeCode FROM employees WHERE officeCode <=4;

// Following query uses the not equal to (<>) operator to find all employees who are not the Sales Rep:
SELECT lastname, firstname, jobtitle FROM employees WHERE jobtitle <> 'Sales Rep';

// select with order by and not null
SELECT state,city from customers WHERE state IS NOT NULL ORDER BY state,city;
SELECT state from customers where state IS NOT NULL GROUP BY state;


SELECT distinct state from customers where state IS NOT NULL order by state;
SELECT count(distinct state) from customers where state IS NOT NULL order by state;

// Same result
SELECT distinct state,country from customers where state IS NOT NULL AND country='USA' order by state;
SELECT state,country FROM customers WHERE state IS NOT NULL AND country='USA' GROUP BY state ORDER BY state;



//Table with counts
SELECT state,COUNT(state) FROM customers WHERE state IS NOT NULL AND country='USA' GROUP BY state ORDER BY state;

//COUNTS
SELECT COUNT(DISTINCT state) FROM customers WHERE country = 'USA';

//Limit usage
SELECT distinct state from customers where state IS NOT NULL LIMIT 5;

//AND usage
SELECT customername, country, state FROM customers WHERE country = 'USA' AND state = 'CA';
SELECT customername, country, state, creditlimit FROM customers WHERE country = 'USA' AND state = 'CA' AND creditlimit > 65000;

//OR usage
SELECT customername, country FROM customers WHERE country='USA' OR country='France';

// difference in execution
SELECT customername, country, creditlimit FROM customers WHERE (country='USA' OR country='France') AND creditlimit > 50000;
SELECT customername, country, creditlimit FROM customers WHERE country='USA' OR country='France' AND creditlimit > 50000;

// IN usage
SELECT officecode,city,state,country from offices WHERE country IN('USA','France');
SELECT officecode,city,state,country from offices WHERE country NOT IN('USA','France');

// IN with subquery


