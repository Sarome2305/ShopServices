<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="Styles/styleinicio.css">
        <link rel="icon" type="image/svg+xml" href="r.ico" />
        <title>Iniciar Sesión</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6"></script>
    </head>
    <body>
        <div class="container py-5">
            <div class="row justify-content-center">
                <div class="col-lg-4">
                    <form class="form-login" action="LoginServlet" method="POST">
                        <h3>Iniciar sesión</h3>
                        <div class="form-group text-center">
                            <img src="img/purplelogo.png" alt="" width="130px">
                        </div>
                        <div class="form-group"> 
                            <label for="txtUser">Usuario:</label>
                            <input type="text" id="txtUser" name="txtUser" class="form-control">
                        </div>
                        <div class="form-group"> 
                            <label for="txtPass">Contraseña:</label>
                            <input type="password" id="txtPass" name="txtPass" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">

                    </form>
                    <center> <br></br>
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="index2.jsp">Regresar al Inicio</a>
                    </center>
                </div>
                <style>
                    body{
                        background: rgb(2,0,36);
                        background-image: url(https://th.bing.com/th/id/R.a91af503ca642cb5d0eb9fce10111ef6?rik=yYMapPlPWbTgvw&riu=http%3a%2f%2fimg.artlebedev.ru%2feverything%2falfabank%2fsite5%2fmake_money.jpg&ehk=67Il7Zu%2baq2HJBTvZyC63ZlYTSVsJBfEoDiIv0cC6cs%3d&risl=&pid=ImgRaw&r=0);
                        background-size: cover;
                        background-position: center;
                    }
                </style>
                </body>
                </html>