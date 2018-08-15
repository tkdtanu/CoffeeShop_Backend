# CoffeeOrder_Backend
Backend Service for Coffe Shop


 Minimum Requirement to Start Backend Service</br>
 1)Java(1.8 or more)</br>
 2)Maven</br>
 </br>
 </br>
 Process to start the service<br>
 1)clone the code<br>
 2)do "mvn clean install"<br>
 3)start by "mvn spring-boot:run"<br>
 
 <br>
 <br>
 Server will start on 9090 port
 <br>
 Backend Service is used to SignIn/SignUP new User and After SignIn User can do Order Management</br>

 Used JWT Based Authentication Mechanism.</br>

 One user can access only two api "/api/user/auth/login" and "/api/user/auth/signup" without any authentication.</br>
 Other apis are restricted with Spring security. You have to send one JWT token to access all those apis.</br>
 </br>
 SignIn-/api/user/auth/login</br>
   Pass LoginUser Details(username,password)</br>
 SignUp-/api/user/auth/signup</br>
   Pass User Details(username,password,name,dob)</br>
  
  Order Mangement APIS</br>
  </br>
  To Create new Order-/api/order/create (POST method)</br>
   Pass Order Details(itemName,quantity,price,customerName,customerPhoneNumber)</br>
  To Retrieve All Order-/api/order/retrieve/all (GET emthod)</br>
    To Retrieve All Order-/api/order/retrieve/{orderId} (GET emthod)</br>
 
 

