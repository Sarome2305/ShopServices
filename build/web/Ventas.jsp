<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
            }

            .container {
                max-width: 960px;
                margin: 50px auto;
                padding: 20px;
                background-color: #fff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }


            table {
                width: 100%;
                border-collapse: collapse;
            }

            th, td {
                padding: 15px;
                text-align: left;
            }

            th {
                background-color: #f1f1f1;
                font-weight: bold;
                color: #333;
            }

            tbody tr:nth-child(even) {
                background-color: #f9f9f9;
            }

            tbody tr:hover {
                background-color: #e0e0e0;
            }
        </style>
        <title>Ventas</title>
    </head>
    <body>
        <div class="container">
            <h1 style="display: inline-block; font-size: 32px; font-weight: bold; color: #333; text-transform: uppercase; border-bottom: 2px solid #333; padding-bottom: 5px; letter-spacing: 2px; margin-bottom: 20px">Ventas realizadas</h1>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Id Ventas</th>
                        <th>Id Empresa</th>
                        <th>Nombre Empresa</th>
                        <th>Número de Serie</th>
                        <th>Fecha de Ventas</th>
                        <th>Monto</th>
    
                    </tr>
                </thead>
                <tbody>
                    <%
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bdventas?useSSL=false&serverTimezone=UTC", "root", "");

                            String sql = "SELECT * FROM ventas";
                            Statement stmt = conn.createStatement();
                            ResultSet rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                    %>
                    <tr>
                        <td><%= rs.getInt("IdVentas")%></td>
                        <td><%= rs.getInt("IdEmpresa")%></td>
                        <td><%= rs.getString("Nombres")%></td>
                        <td><%= rs.getString("NumeroSerie")%></td>
                        <td><%= rs.getString("FechaVentas")%></td>
                        <td><%= rs.getDouble("Monto")%></td>
                    </tr>
                    <%
                            }

                            rs.close();
                            stmt.close();
                            conn.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
