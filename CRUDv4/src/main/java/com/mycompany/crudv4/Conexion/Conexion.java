/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudv4.Conexion;

import java.sql.*;
import javax.swing.JOptionPane;



public class Conexion {
    
    String hostName = "db-jesus-crud.clcawmawq8ni.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://"+hostName+":3306/bd_escuelas";
    String user = "admin";
    String password = "jesusmiguel2024-2425";
    
    Connection con;

    public Conexion() {
        try {
            con =  DriverManager.getConnection(jdbcUrl,user,password);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un erros al conectarse" + e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    
}
