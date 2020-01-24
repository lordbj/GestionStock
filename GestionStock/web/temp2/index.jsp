<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Gestion Stock Produit</title>
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="temp2/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE  -->
    <link href="temp2/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="temp2/assets/css/style.css" rel="stylesheet" />
    <!-- GOOGLE FONT -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

</head>
<body>
    <div class="navbar navbar-inverse set-radius-zero" >
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="">

                  <h1 class="header-line">
                  	<button class="btn btn-default btn-lg">Gestion Stock Produit</button></h1>
                </a>

            </div>

            <div class="right-div">
                <a href="Logout" class="btn btn-danger pull-right btn-lg ">DECONNEXION</a>
            </div>
        </div>
    </div>
    <!-- LOGO HEADER END-->
    <%@ include file="../view/menu/menu.jsp"%>
    <!-- MENU SECTION END-->
    <div class="content-wrapper">
         <div class="container">
        <div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">UN SERVICE QUI VOUS CONNECTE TOUOURS A VOTRE ESSENTIEL</h4>
             </div>

        </div>
                          
             <div class="row">

              <div class="col-md-9 col-sm-8 col-xs-12">
                    <div id="carousel-example" class="carousel slide slide-bdr" data-ride="carousel" >
                   
                    <div class="carousel-inner">
                        <div class="item active">

                            <img src="temp2/assets/img/2.jpg" alt="" />
                           
                        </div>
                        <div class="item">
                            <img src="temp2/assets/img/hospi4.jpg" alt="" />
                          
                        </div>
                        <div class="item">
                            <img src="temp2/assets/img/2.jpg" alt="" />
                        </div>
                        <div class="item">
                            <img src="temp2/assets/img/hospi4.jpg" alt="" />
                        </div>
                    </div>
                    <!--INDICATORS-->
                     <ol class="carousel-indicators">
                        <li data-target="#carousel-example" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example" data-slide-to="1"></li>
                        <li data-target="#carousel-example" data-slide-to="2"></li>
                        <li data-target="#carousel-example" data-slide-to="3"></li>
                    </ol>
                    <!--PREVIUS-NEXT BUTTONS-->
                     <a class="left carousel-control" href="#carousel-example" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
                </div>
              </div>
             
 			</div>
 					
    </div>
    </div>
     <!-- CONTENT-WRAPPER SECTION END-->
    <section class="footer-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                   copyright 2019 Lordtra69@gmail.com |<a href="http://www.binarytheme.com/" target="_blank"  > Designed by : Boulaye Traoré</a> 
                </div>

            </div>
        </div>
    </section>
      <!-- FOOTER SECTION END-->
    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY  -->
    <script src="temp2/assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="temp2/assets/js/bootstrap.js"></script>
      <!-- CUSTOM SCRIPTS  -->
    <script src="temp2/assets/js/custom.js"></script>
  
</body>
</html>
