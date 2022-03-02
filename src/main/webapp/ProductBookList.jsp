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
                <a class="nav-link active addtocard"  href="#">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link addtocard" href="#">Register</a>
              </li>
            </ul>
          </div>
          <form class="d-flex">
            <img src="858715_add_add to cart_cart_shopping cart_shopping cart icon_icon.png" class="mx-2 btn-close-white" >
            <button class="btn  text-white addtocard fw-bold" type="submit">Add to Cart</button>
          </form>
        </div>
    </nav>
    <!-- end of navbar -->

    <!-- searchbar -->
    <div class="container mt-4 w-50">
        <div class="input-group">
            <input type="search" class="form-control rounded" placeholder="Search" aria-label="Search" aria-describedby="search-addon" />
            <button type="button" class="btn btn-outline-primary gradient-custom-2 text-white">search</button>
          </div>
    </div>

    <!-- heading  -->
    <hr class="mx-5">
    <h1 class="text-center ">Book List</h1>
    <hr class="mx-5">


    <!-- card show -->
    <div class="container">
    <div class="row row-cols-1 row-cols-md-4 g-4 mt-4 mb-4">
        <div class="col">
          <div class="card h-100">
            <img src="https://media.istockphoto.com/photos/flying-color-books-on-pastel-yellow-background-picture-id1304915362?b=1&k=20&m=1304915362&s=170667a&w=0&h=1oBLMT9JLYt6Ju3LbSppu8Fga92YfvSHiPu7zQlculg=" class="card-img-top h-50" alt="..." >
            <div class="card-body">
              <h5 class="card-title">Card title</h5>
              <p class="card-text">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Voluptates, quos?</p>
              <h4>MRP &#x20b9 <strike>1000</strike> <span style=color:chartreuse>30% OFF</span></h4>
              <h4>&#x20b9 700</h4>
              <a href="#" class="btn btn-primary gradient-custom-2">Add to Cart</a>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="https://images.unsplash.com/photo-1544716278-ca5e3f4abd8c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8Ym9va3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60" class="card-img-top h-50" alt="...">
            <div class="card-body">
              <h5 class="card-title">Card title</h5>
              <p class="card-text">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Nesciunt, architecto.</p>
              <h4>MRP &#x20b9 <strike>1000</strike> <span style=color:chartreuse>30% OFF</span></h4>
              <h4>&#x20b9 700</h4>
              <a href="#" class="btn btn-primary gradient-custom-2 ">Add to Cart</a>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="https://media.istockphoto.com/photos/school-picture-id1016131800?b=1&k=20&m=1016131800&s=170667a&w=0&h=imifkJTvS-4b8cvOhVNlCqqvZlwI4S-xCKZ6Oxbla4Q=" class="card-img-top h-50" alt="...">
            <div class="card-body">
              <h5 class="card-title">Card title</h5>
              <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content.</p>
              <h4>MRP &#x20b9 <strike>1000</strike> <span style=color:chartreuse>30% OFF</span></h4>
              <h4>&#x20b9 700</h4>
              <a href="#" class="btn btn-primary gradient-custom-2">Add to Cart</a>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="https://media.istockphoto.com/photos/pattern-of-books-in-different-positions-and-located-in-the-part-of-picture-id1320488856?b=1&k=20&m=1320488856&s=170667a&w=0&h=AN3klZUZTu_pGxAl-h-dfTyD1KeEAkjd3Ax-JtS2zPM=" class="card-img-top h-50" alt="...">
            <div class="card-body">
              <h5 class="card-title">Card title</h5>
              <p class="card-text">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Sint, a.</p>
              <h4>MRP &#x20b9 <strike>1000</strike> <span style=color:chartreuse>30% OFF</span></h4>
              <h4>&#x20b9 700</h4>
              <a href="#" class="btn btn-primary gradient-custom-2">Add to Cart</a>
            </div>
          </div>
        </div>
        <div class="col">
            <div class="card h-100">
              <img src="https://images.unsplash.com/photo-1481627834876-b7833e8f5570?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8Ym9va3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60" class="card-img-top h-50" alt="...">
              <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Iure, officiis.</p>
                <h4>MRP &#x20b9 <strike>1000</strike> <span style=color:chartreuse>30% OFF</span></h4>
                <h4>&#x20b9 700</h4>
                <a href="#" class="btn btn-primary gradient-custom-2">Add to Cart</a>
              </div>
            </div>
          </div>
          <!-- <div class="col">
            <div class="card h-100">
              <img src="https://images.unsplash.com/photo-1589998059171-988d887df646?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGJvb2t8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" class="card-img-top h-50" alt="...">
              <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                <a href="#" class="btn btn-primary gradient-custom-2">Go somewhere</a>
              </div>
            </div>
          </div> -->
          <!-- <div class="col">
            <div class="card h-100">
              <img src="https://images.unsplash.com/photo-1516979187457-637abb4f9353?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJvb2t8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" class="card-img-top h-50" alt="...">
              <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                <a href="#" class="btn btn-primary gradient-custom-2">Go somewhere</a>
              </div>
            </div>
          </div> -->
      </div>
    </div>


    <!-- cards list -->


    <!-- Footer -->
    <footer class="page-footer font-small blue gradient-custom-2 fixed-bottom mt-4">
        <div class="footer-copyright text-center py-3 text-white">© 2020 Copyright:
        <a href="https://FlipBook.com/" class="text-white"> Flipbook.com</a>
        </div>
    </footer>
    <!-- Footer -->
</body>
</html>