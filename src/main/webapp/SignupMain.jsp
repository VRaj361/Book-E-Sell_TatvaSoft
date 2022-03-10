<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/style1.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>	
	<nav class="navbar navbar-expand-lg navbar-dark bg-white gradient-custom-2 ">
        <div class="container-fluid">
            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/lotus.webp" style="width: 55px;
                         " alt="logo">
          <a class="navbar-brand fw-bold" href="#">FlipBook</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <li class="nav-item mx-2">
                <a class="nav-link  addtocard"  href="LoginMain.jsp">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active addtocard" href="SignupMain.jsp">Register</a>
              </li>
            </ul>
          </div>
          <form class="d-flex">
            <img src="IMAGES/858715_add_add to cart_cart_shopping cart_shopping cart icon_icon.png" class="mx-2 btn-close-white" >
            <button class="btn  text-white addtocard fw-bold" type="submit">Add to Cart</button>
          </form>
        </div>
    </nav>
    <!-- end of nav bar -->
    
    
     <!-- start of sign up page -->
      <section class="h-AUTO  gradient-form " style="background-color: #eee; display: block;">
        <div class="container py-3 h-AUTO">
          <div class="row d-flex justify-content-center align-items-center h-AUTO">
            <div class="col-xl-10">
              <div class="card rounded-3 text-black">
                <div class="row g-0">
                  <div class="col-lg-6">
                    <div class="card-body p-md-2 mx-md-4">
      
                      <div class="text-center">
                        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/lotus.webp" style="width: 155px;
                         " alt="logo">
                        <h4 class="mt-1 mb-1 pb-1">A good book is an event in my life.</h4>
                      </div>
      
                      <form action="SignupMainServlet" method="get">
                        <p>Register to your account</p>
      
                        <div class="form-outline mb-2 ">
                          <input type="text" id="form2Example11" class="form-control" placeholder="Full Name" name="fullname_s"/>
                          <label class="form-label" for="form2Example11">Full Name</label>
                          <p class="text-danger">${fullname_ES }</p>
                        </div>
                        <div class="form-outline mb-2">
                          <input type="text" id="form2Example11" class="form-control" placeholder="Phone number or email address" name="username_s"/>
                          <label class="form-label" for="form2Example11">Username</label>
                          <p class="text-danger">${username_ES }</p>
                        </div>
      
                        <div class="form-outline mb-2">
                          <input type="password" id="form2Example22" class="form-control" placeholder="Password" name="password_s"/>
                          <label class="form-label" for="form2Example22">Password</label>
                          <p class="text-danger">${password_ES }</p>
                        </div>
                        <div class="form-outline mb-4">
                          <input type="password" id="form2Example22" class="form-control" placeholder="Password" name="cpassword_s"/>
                          <label class="form-label" for="form2Example22">Confirm Password</label>
                          <p class="text-danger">${password_ES }</p>
                          <p class="text-danger">${cpassword_ES }</p>
                        </div>
      
                        <div class="text-center pt-1 pb-1 ">
                          <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3 form-control " type="submit">Sign Up</button>
                         
                        </div>  
                        
      
                        <div class="d-flex align-items-center justify-content-center pb-4">
                          <p class="mb-0 me-2">Already have an account?</p>
                          <button type="button" class="btn btn-outline-danger">Log in</button>
                        </div>
      
                      </form>
      
                    </div>
                  </div>
                  <div class="col-lg-6 d-flex align-items-center gradient-custom-2">
                    <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                      <h3 class="mb-4">A book is a gift you can open again and again.</h3>
                      <p class=" mb-0">Books are good company, in sad times and happy times, for books are people – people who have managed to stay alive by hiding between the covers of a book.</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    
    
    
    
    
     <!-- Footer -->
    <footer class="page-footer font-small blue gradient-custom-2 fixed-bottom">
        <div class="footer-copyright text-center py-3 text-white">© 2020 Copyright:
        <a href="https://FlipBook.com/" class="text-white"> Flipbook.com</a>
        </div>
    </footer>
  <!-- Footer -->
</body>
</html>