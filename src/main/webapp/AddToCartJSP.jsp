<%@page import="com.bean.SetDataBook"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
						href="LogoutMain.jsp">Logout</a></li>
				</ul>
			</div>
			<form class="d-flex">
				<img
					src="IMAGES/858715_add_add to cart_cart_shopping cart_shopping cart icon_icon.png"
					class="mx-2 btn-close-white">
				<button class="btn  text-white addtocard fw-bold" type="submit">Add
					to Cart</button>
			</form>
		</div>
	</nav>


	<div class="container">
		<hr class="">
		<h1 class="text-center ">Add to card</h1>
		<hr class="">
		
		<%ArrayList<SetDataBook> arr=(ArrayList<SetDataBook>)request.getAttribute("AddtocartShow");
		if(arr==null){
		
		%>
		<h1>Your Cart is empty</h1>
		
		<%}else{
			
			for(SetDataBook bean:arr){	
			
			%>
		
		
		
		<div class="card mb-3" style="background-color: white;">
			<div class="row g-3 w-100  ">
				<div
					class="col-md-2 d-flex align-items-center justify-content-center">
					<img src="https://images.unsplash.com/photo-1481627834876-b7833e8f5570?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8Ym9va3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
						alt="" width="200px" height="250px" style="object-fit: fill;">
				</div>
				<div class="col-md-10 ">
					<div class="card-body text-left">

						<h5 class="card-title mb-3">
							Title: <input type="submit" value=""
								style="background: none; color: inherit; border: none; padding: 0; font: inherit; cursor: pointer; outline: inherit;"
								name="linkQuestionTitle"><%=bean.getTitle() %>
						</h5>

						<h5 class="card-title"><%=bean.getDescription() %></h5>



						<h4>
							MRP &#x20b9 <strike><%=bean.getPrice() %></strike> <span style="color: chartreuse"><%=bean.getDiscount() %>%
								OFF</span>
						</h4>
						<h4>&#x20b9 <%=bean.getOprice() %></h4>
						<form action="UpdateDataUser">
						<input type="hidden" name="productid_send" value="<%=bean.getProductid()%>">
						<input class="d-inline-block " value="1" type="number" name="inputqty" >

						<div class="d-grid gap-2 d-md-flex justify-content-md-end">
							<button class="btn gradient-custom-2 text-white me-md-2"
								type="submit">Confirm</button>

						</div>
						</form>

					</div>
				</div>
			</div>

		</div>
		<%}} %>
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