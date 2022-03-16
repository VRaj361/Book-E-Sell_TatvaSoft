<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
<link rel="icon" type="image/x-icon" href="IMAGES/favicon.png">
<link rel="stylesheet" href="CSS/style1.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body style="background-color: #eee">
	<nav
		class="navbar navbar-expand-lg navbar-dark bg-white gradient-custom-2 ">
		<div class="container-fluid">
			<img
				src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/lotus.webp"
				style="width: 55px;" alt="logo"> <a
				class="navbar-brand fw-bold" href="#">FlipBook</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">

					<li class="nav-item"><a class="nav-link addtocard"
						href="LoginMain.jsp">Login</a></li>
					<li class="nav-item"><a class="nav-link addtocard"
						href="SignupMain.jsp">Sign Up</a></li>
				</ul>
			</div>
			
		</div>
	</nav>
	
	<div class=" container">
               <p class="text-center " style="letter-spacing: 2px; font-size: 5rem;">Thanks for Visiting</p>
               <h3 class="text-center" style="letter-spacing: 1px; font-size: 2rem;">You have Sucessfully logout.</h1>
    </div>
	
	
	
	<footer
			class="page-footer font-small blue gradient-custom-2 fixed-bottom mt-4">
			<div class="footer-copyright text-center py-3 text-white">
				© 2020 Copyright: <a href="https://FlipBook.com/" class="text-white">
					Flipbook.com</a>
			</div>
		</footer>
</body>
</html>