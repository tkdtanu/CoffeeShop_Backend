# CoffeeOrder_Backend
Backend Service for Coffe Shop


<b>Minimum Requirement to Start Backend Service</b>
<b>1)Java(1.8 or more)</b>
<b>2)Maven</b>
<b></b>
<b></b>
<b>Backend Service is used to SignIn/SignUP new User and After SignIn User can do Order Management</b>

<b>Used JWT Based Authentication Mechanism.</b>

<b>One user can access only two api "/api/user/auth/login" and "/api/user/auth/signup" without any authentication.</b>
<b>Other apis are restricted with Spring security. You have to send one JWT token to access all those apis.</b>
<b></b>
<b>SignIn-/api/user/auth/login</b>
  <b>Pass LoginUser Details(username,password)</b>
<b>SignUp-/api/user/auth/signup</b>
  <b>Pass User Details(username,password,name,dob)</b>
  
<b> Order Mangement APIS</b>
<b> </b>
<b> To Create new Order-/api/order/create (POST method)</b>
 <b> Pass Order Details(itemName,quantity,price,customerName,customerPhoneNumber)</b>
 <b>To Retrieve All Order-/api/order/retrieve/all (GET emthod)</b>
   <b>To Retrieve All Order-/api/order/retrieve/{orderId} (GET emthod)</b>
 
 

