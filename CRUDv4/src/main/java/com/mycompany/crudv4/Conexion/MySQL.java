package com.mycompany.crudv4.Conexion;

import java.sql.*;
import javax.swing.JOptionPane;


public class MySQL {

    public static void main(String[] args) {

        String hostName = "db-jesus-crud.clcawmawq8ni.us-east-1.rds.amazonaws.com";
        String jdbcUrl = "jdbc:mysql://" + hostName + ":3306/bd_escuelas";
        String user = "admin";
        String password = "jesusmiguel2024-2425";
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(jdbcUrl,user,password);
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error error: " + e);
        }
        
        
    }

}
