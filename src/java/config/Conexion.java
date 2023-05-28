
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bdventas";
    String user="root";
    String pass="";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            
        } catch (Exception e) {
            System.out.println("Conexion erronea"+e);
        }
        return con;
    }
    
}

