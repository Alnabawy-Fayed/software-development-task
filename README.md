
# software development task
1-open project files from backend folder

2-import the sql-script.sql file from sql script folder 

3- make sure to change the username and password in application.properties file



## API Reference

#### Get all customers data using [GET] 
http://localhost:8080/customers
#### Get all orders data using [GET]
http://localhost:8080/orders
#### Get customer by id using [GET]
http://localhost:8080/api/customerId/{id}
#### Get customer by fullName using [GET]
http://localhost:8080/api/customerName/{name}
#### Get all customer with specific orders-count using [GET]
http://localhost:8080/api/customerOrderCount/{count}
#### Get all customer with specific order total-price using [GET]
http://localhost:8080/api/customerOrderTotalPrice/{TotalPrice}
#### update customer email{by sending an object of NewEmail that contains customer id and the new email as json} using [PUT]
http://localhost:8080/api/updateCustomerEmail

example:

{
    
    "id" : 6,
    "email" : "shaban@gmail.com"
}
#### delete a customer using [DELETE]
http://localhost:8080/api/customerId/{id}
#### add a customer { by sending a customer object as json} using [POST] 
http://localhost:8080

 example:

 {

    "fullName" : "shaban elgohary",
    "email" : "shaban@yahoo.com",
    "dateOfBirth" : "1999-08-1",
    "address" : "banha"
}



