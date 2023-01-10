/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author is-da
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/ventas";
    String user="Andres";
    String pass="123456";

    public Conexion() {
    }
    
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return con;
    }
}
