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
    <link href="../../temp2/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE  -->
    <link href="../../temp2/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="../../temp2/assets/css/style.css" rel="stylesheet" />
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
            <a href="Logout" class="btn btn-danger pull-right btn-lg">DECONNEXION</a>
        </div>
    </div>
</div>
<!-- LOGO HEADER END-->
<%@ include file="/view/menu/menu.jsp"%>
<div class="content-wrapper">
    <div class="container">
        <div class="row pad-botm">
            <div class="col-md-12">
                <h2 class="header-line">LISTE DES PRODUITS</h2>
            </div>

        </div>

        <div class="row pad-botm">
            <div class="panel panel-inverse">
                <div class="panel-body">
                    <table class="table table-bordered">
                        <tr>
                            <th>ID</th>
                            <th>NOM</th>
                            <th>QUANTITE</th>
                            <th>USER</th>
                            <th>Action</th>
                            <th>Action</th>
                        </tr>
                        <c:if test="${liste_produit !=null }">
                            <c:forEach items="${liste_produit }"  var="p">
                                <tr>
                                    <td>${p.id}</td>
                                    <td>${p.nom}</td>
                                    <td>${p.qtStock}</td>
                                    <td>${p.user.nom}</td>
                                    <td><a class="btn-sm btn-success" href="Produit?page=edit&id=${p.id}">Modifier</a></td>
                                    <td><a class="btn-sm btn-danger" href="Produit?page=delete&id=${p.id}">Supprimer</a></td>
                                </tr>
                            </c:forEach>
                        </c:if>
                    </table>
                </div>

            </div>
        </div>
        <div class="row pad-botm">
            <div class="col-md-12">
                <h2 class="header-line">AJOUT DES PRODUITS</h2>
            </div>
        </div>

        <div class="row pad-botm">
            <div class="panel panel-inverse">

                <div class="panel-body">
                    <c:if test="${message !=null }">
                        <div class="alert alert-success">${message}</div>
                    </c:if>
                    <form method="Post" action="Produit">
                        <div class="form-group">
                            <label class="control-label">NOM</label>
                            <input class="form-control" type="text" name="nom" id="nom" required="required"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label">QUANTITE</label>
                            <input class="form-control" type="number" name="qtStock" id="qtStock" required="required"/>
                        </div>
                        <div class="form-group">
                            <input class="btn-sm btn-success" type="submit" name="valider" value="Envoyer"/>
                            <input class="btn-sm btn-danger" type="reset" name="annuler" value="Annuler"/>
                        </div>
                    </form>
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
<script src="../../temp2/assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->
<script src="../../temp2/assets/js/bootstrap.js"></script>
<!-- CUSTOM SCRIPTS  -->
<script src="../../temp2/assets/js/custom.js"></script>

</body>
</html>
