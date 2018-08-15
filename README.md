# CoffeeOrder_Backend
Backend Service for Coffe Shop


Minimum Requirement to Start Backend Service
1)Java(1.8 or more)
2)Maven


Backend Service is used to SignIn/SignUP new User and After SignIn User can do Order Management

Used JWT Based Authentication Mechanism.

One user can access only two api "/api/user/auth/login" and "/api/user/auth/signup" without any authentication.
Other apis are restricted with Spring security. You have to send one JWT token to access all those apis.

SignIn-/api/user/auth/login
  Pass LoginUser Details(username,password)
SignUp-/api/user/auth/signup
  Pass User Details(username,password,name,dob)
  
 Order Mangement APIS
 
 To Create new Order-/api/order/create (POST method)
    Pass Order Details(itemName,quantity,price,customerName,customerPhoneNumber)
 To Retrieve All Order-/api/order/retrieve/all (GET emthod)
 To Retrieve All Order-/api/order/retrieve/{orderId} (GET emthod)
 
 

