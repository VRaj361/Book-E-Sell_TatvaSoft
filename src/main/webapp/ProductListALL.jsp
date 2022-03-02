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


    <div class="container">
        <table class="table    table-striped table-hover">
            <thead>
              <tr>
                <th scope="col">#</th>
                <th scope="col">UserId</th>
                <th scope="col">Name of Book</th>
                <th scope="col">Money</th>
                
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>500</td>
                <td><button class="btn btn-outline-success mx-3" type="submit">Edit</button><button class="btn btn-outline-danger row" type="submit">Delete</button></td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>500</td>
                <td><button class="btn btn-outline-success mx-3" type="submit">Edit</button><button class="btn btn-outline-danger row" type="submit">Delete</button></td>
              </tr>
              <tr>
                <th scope="row">3</th>
                <td colspan="2">Larry the Bird</td>
                <td>500</td>
                <td><button class="btn btn-outline-success mx-3" type="submit">Edit</button><button class="btn btn-outline-danger row" type="submit">Delete</button></td>
              </tr>
              <tr>
                <th scope="row">4</th>
                <td colspan="2">Larry the Bird</td>
                <td>500</td>
                <td><button class="btn btn-outline-success mx-3" type="submit">Edit</button><button class="btn btn-outline-danger row" type="submit">Delete</button></td>
              </tr>
              <tr>
                <th scope="row">5</th>
                <td colspan="2">Larry the Bird</td>
                <td>500</td>
                <td><button class="btn btn-outline-success mx-3" type="submit">Edit</button><button class="btn btn-outline-danger row" type="submit">Delete</button></td>
              </tr>
            </tbody>
          </table>

          <div class="container" style="display: inline-block;">
            <div class="btn-group dropup">
                <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropup
                </button>
                <ul class="dropdown-menu">
                  <!-- Dropdown menu links -->
                  <li>5</li>
                  <li>10</li>
                </ul>
              </div>
              <span class="m-lg-3">1-5 to 6</span>
              <span> <          ></span>
          </div>

    </div>


    <!-- Footer -->
    <footer class="page-footer font-small blue gradient-custom-2 fixed-bottom mt-4">
        <div class="footer-copyright text-center py-3 text-white">© 2020 Copyright:
        <a href="https://FlipBook.com/" class="text-white"> Flipbook.com</a>
        </div>
    </footer>
    <!-- Footer -->
</body>
</html>