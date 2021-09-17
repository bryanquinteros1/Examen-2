/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Bryan
 */
public class ClsConexion {

    static void CloseConection(PreparedStatement stmt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private final String base = "bdtienda";
     private final String user = "root";
     private final String password = "bryan123q";
     private final String url = "jdbc:mysql://localhost:3306/"+base;
     private Connection con = null;
     
     
     public Connection getConexion()
     {
     
       try {
       
         Class.forName("com.mysql.cj.jdbc.Driver");
         con =  DriverManager.getConnection(this.url,this.user, this.password);
         
     
     } catch(SQLException e)
     {
       System.err.print(e);
         
       
     }   catch (ClassNotFoundException ex) {
             Logger.getLogger(ClsConexion.class.getName()).log(Level.SEVERE, null, ex);
         }
     
      return con;
     }
     
     
     
     
     
   
     
}

     

     
     
     
     
     
     
     
     

