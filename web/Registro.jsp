<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Registro de clientes</title>
        <link rel="icon" type="image/svg+xml" href="r.ico" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">

    </head>
    <body>
        <div class="container py-5">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <form class="form-register" action="RegistrarCliente" method="POST" onsubmit="guardarDatos(event)">
                        <div class="register text-center">
                            <h3>Sign in</h3>
                        </div>
                        <br>
                        <div class="form-group">
                            <label for="txtDni">DNI:</label>
                            <input type="text" id="txtDni" name="txtDni" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="txtNombres">Nombres:</label>
                            <input type="text" id="txtNombres" name="txtNombres" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="txtDireccion">Dirección:</label>
                            <input type="text" id="txtDireccion" name="txtDireccion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="txtTelefono">Teléfono:</label>
                            <input type="text" id="txtTelefono" name="txtTelefono" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="txtUser">Usuario:</label>
                            <input type="text" id="txtUser" name="txtUser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="txtPass">Contraseña:</label>
                            <input type="pass" id="txtPass" name="txtPass" class="form-control">
                        </div>
                        <br>
                        <input type="submit" name="accion" value="Registrar" class="btn btn-primary btn-block" onclick="mostrarMensaje()">
                    </form>
                    <center>
                        <br>
                        <a style="border: none" class="btn btn-outline-light" href="index.jsp">Regresar al Inicio</a>
                    </center>

                </div>
            </div>
        </div>
        <style>
            body{
                background: rgb(2,0,36);
                background-image: url(https://th.bing.com/th/id/R.a91af503ca642cb5d0eb9fce10111ef6?rik=yYMapPlPWbTgvw&riu=http%3a%2f%2fimg.artlebedev.ru%2feverything%2falfabank%2fsite5%2fmake_money.jpg&ehk=67Il7Zu%2baq2HJBTvZyC63ZlYTSVsJBfEoDiIv0cC6cs%3d&risl=&pid=ImgRaw&r=0);
                background-size: cover;
                background-position: center;
                color: white;

            }
        </style>


    </body>

</html>