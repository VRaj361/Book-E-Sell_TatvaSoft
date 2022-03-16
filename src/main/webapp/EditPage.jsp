<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Prodcut</title>
<link rel="icon" type="image/x-icon" href="IMAGES/favicon.png">
<link rel="stylesheet" href="CSS/style1.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body style=" background-color: #eee">



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
             
              <li class="nav-item">
                <a class="nav-link addtocard" href="LogoutMain.jsp">Logout</a>
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
    
     <section class="h-AUTO  gradient-form mb-4" style="background-color: #eee; display: block;">
        <div class="container py-3 h-AUTO mb-4">
          <div class="row d-flex justify-content-center align-items-center h-AUTO mb-4">
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
      
                      <form class="mb-4" action="EditMainServlet">
                        <p>Edit Product</p>
      
                        <div class="form-outline mb-2 ">
                          <input type="text" id="form2Example11" class="form-control" placeholder="Full Name" name="fullname_e"/>
                          <label class="form-label" for="form2Example11">Full Name</label>
                          <p class="text-danger">${fullname_error}</p>
                        </div>
                        <div class="form-outline mb-2">
                          <input type="text" id="form2Example11" class="form-control" placeholder="Title" name="title_e"/>
                          <label class="form-label" for="form2Example11">Title</label>
                          <p class="text-danger">${title_error}</p>
                        </div>
                        <div class="form-group mb-2 form-outline" >
                            <select id="inputState" class="form-control" name="select_e">
                                <option selected>Select</option>
                                <option>Commedy</option>
                                <option>Game</option>
                                <option>Love and Trust</option>
                                <option>Historical</option>
                                <option>Study </option>
                            </select>
                            <label for="inputState">State</label>
                            <p class="text-danger">${select_error}</p>
                          </div>
                        
                        <div class="form-outline mb-2">
                          <input type="text" id="form2Example22" class="form-control " placeholder="Description" name="descrption_e"/>
                          <label class="form-label" for="form2Example22">Description</label>
                          <p class="text-danger">${descri_error}</p>
                        </div>
                        <div class="form-outline mb-2 d-inline w-50 ">
                            <input type="text" id="form2Example22" class="form-control w-25  d-inline" placeholder="Price" name="price_e"/>
                            <label class="form-label mb-4" for="form2Example22 ">Price</label>
                            <p class="text-danger">${price_error}</p>
                        </div>
                        <div class="form-outline mb-2 d-inline w-50 mb-4">
                            <input type="text" id="form2Example22" class="form-control  w-25  d-inline " placeholder="Qty" name="qty_e"/>
                            <label class="form-label" for="form2Example22">Quantity</label>
                            <p class="text-danger">${qty_error}</p>
                        </div>
                         <div class="form-outline mb-2 d-inline w-50 mb-4">
                            <input type="text" id="form2Example22" class="form-control  w-25  d-inline " placeholder="Discount" name="discount_e"/>
                            <label class="form-label" for="form2Example22">Discount</label>
                            <p class="text-danger">${discount_error}</p>
                        </div>
                        <br>
                        <div class="custom-file form-outline mb-4">
                            <input type="text" class="custom-file-input form-control" id="customFile" placeholder="Enter URL" name="url_e"> 
                            <label class="custom-file-label" for="customFile">Enter URL</label>
                            <p class="text-danger">${url_error}</p>
                          </div>
      
                        <div class="text-center pt-1 pb-1 ">
                          <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3 form-control " type="submit">Save</button>
                         
                        </div>  
                        
      
      
                      </form>
      
                    </div>
                  </div>
                  <div class="col-lg-6 d-flex align-items-center gradient-custom-2 ">
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
    <footer class="page-footer font-small blue gradient-custom-2 fixed-bottom mt-4">
        <div class="footer-copyright text-center py-3 text-white">© 2020 Copyright:
        <a href="https://FlipBook.com/" class="text-white"> Flipbook.com</a>
        </div>
    </footer>
</body>
</html>