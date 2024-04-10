select productName as Name,productLine as "Product Line",buyPrice as "Buy Price" from products
order by buyPrice desc;

select contactFirstName as "First Name",contactLastName as "Last Name", city as "City" from customers
order by contactLastName asc;

select distinct status from orders
order by status asc;

select * from payments 
where paymentDate > '2004-10-19'
order by paymentDate desc;

select lastName, firstName, email, jobtitle from employees e
join offices o ON e.officeCode = o.officeCode
where o.city = 'San Francisco'
order by lastName desc;

select productName,productLine, productScale,productVendor from  products
where productLine ='Classic Cars' or productLine ='Vintage Cars'
order by productName asc, productLine desc ; 



