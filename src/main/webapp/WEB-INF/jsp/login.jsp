<%@page language="java" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet" href="/dist/css/adminlte.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Login</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

.input-container {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  width: 100%;
  margin-bottom: 15px;
}

.icon {
  padding: 10px;
  background: dodgerblue;
  color: white;
  min-width: 50px;
  text-align: center;
}

.input-field {
  width: 50%;
  padding: 10px;
  outline: none;
}

.input-field:focus {
  border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
  background-color: dodgerblue;
  color: white;
  padding: 15px 20px;
  border: none;
  cursor: pointer;
  width: 30%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>


  <div class="content">
    <div class="container">
      <div class="row">
        
        <div class="card-body col-6" align="left" >
          <div class="row justify-content-center">
            <div class="col-md-8">
              <div class="mb-4">
              <h3>Log In to <strong>PMS</strong></h3>
           <!--     <p class="mb-4">Lorem ipsum dolor sit amet elit. Sapiente sit aut eos consectetur adipisicing.</p> -->
            </div>
            
            <form method="post" action="/login/validate">
              <div class="form-group first">
                <label for="username"> Username </label>
                <input type="text" class="form-control" id="userName" name="userName" value="admin">

              </div>
              <div class="form-group last mb-4">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" value="password">
                
              </div>
              
              <div class="d-flex mb-5 align-items-center">
                <label class="control control--checkbox mb-0"><span class="caption">Remember me</span>
                  <input type="checkbox" checked="checked"/>
                  <div class="control__indicator"></div>
                </label>
                <span class="ml-auto"><a href="#" class="forgot-pass">Forgot Password?</a></span> 
              </div>

              <input type="submit" value="Log In" class="btn text-white btn-block btn-primary">
               

             <!--   <span class="d-block text-left my-4 text-muted"> or sign in with</span>-->
              
              <div class="social-login">
                <a href="#" class="facebook">
                  <span class="icon-facebook mr-3"></span> 
                </a>
                <a href="#" class="twitter">
                  <span class="icon-twitter mr-3"></span> 
                </a>
                <a href="#" class="google">
                  <span class="icon-google mr-3"></span> 
                </a>
              </div>
            </form>
            </div>
          </div>
          
        </div>
        
        <div class="card-body col-6" align="right">
        
        
		<img src="../../dist/img/homepage.jpg" style="width:400 px; height: 420px;">
        </div>
      </div>
    </div>
  </div>

  



<!--  <form style="max-width:500px;margin:auto" action="dashboard.jsp" method="post">
  <h2>Please Login To Continue</h2>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Username" name="usrnm">
  </div>

    <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Email" name="email">
  </div> 
  
  <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Password" name="psw">
  </div>

  <button type="submit" class="btn"  >Login</button>
</form> 
-->
<script>

function myFunction() {
<!--alert("Login Successful"); -->

}
</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
