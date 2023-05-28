<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="icon" type="image/svg+xml" href="r.ico" />
        <title>Shop Services</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light">           
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="#">Shop Services</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Producto&accion=Listar" target="myFrame">Productos</a>
                    </li>
                    <li class="nav-item" style="${usuario.getUser().equals("emp01") ? "" : "display:none;"}">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Empresa&accion=Listar" target="myFrame">Empresas</a>
                    </li>
                    <li  class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Cliente&accion=Listar" target="myFrame">Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=NuevaVenta&accion=default" target="myFrame">Nueva Venta</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Ventas.jsp" target="myFrame">Ventas</a>
                    </li>


                </ul>                
            </div>
            <div class="dropdown">
                <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    ${usuario.getNom()}
                </button>
                <div class="dropdown-menu text-center">

                    <a class="dropdown-item" href="#">
                        <img src="https://image.jimcdn.com/app/cms/image/transf/dimension=412x10000:format=jpg/path/sc4d794d94b5ef851/image/iba1fc7ea7f8126ad/version/1612362787/image.jpg" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">Bienvenido</a>
                    <a class="dropdown-item" href="#">${usuario.getUser()}</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="Login.jsp">Salir</a>
                </div>
            </div>
        </nav>

        <label>Shop Services</label>
        <div class="embed-responsives m-4" style="height: 530px;">
            <iframe class="embed-responsive-item" name="myFrame"  style="height: 100%; width: 100%; border:navy"></iframe>
            <div>
                <br
                    <center>
                <h5>Ha iniciado sesión como: ${usuario.getNom()} 😎</h5>
                <style>
                    .dropdown-menu{
                        left: -80px;

                    }
                    .dropdown{
                        margin-right: 20px;
                    }
                    h5{
                        display: flex;
                        justify-content: center;
                        color: white;
                    }

                    body {
                        background: rgb(2,0,36);
                        background-image: url(https://th.bing.com/th/id/R.a91af503ca642cb5d0eb9fce10111ef6?rik=yYMapPlPWbTgvw&riu=http%3a%2f%2fimg.artlebedev.ru%2feverything%2falfabank%2fsite5%2fmake_money.jpg&ehk=67Il7Zu%2baq2HJBTvZyC63ZlYTSVsJBfEoDiIv0cC6cs%3d&risl=&pid=ImgRaw&r=0);
                        background-size: cover;
                        background-position: center;

                    }

                </style>

                </center>
            </div>   
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
