/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;



/**
 *
 * @author Bryan
 */
public class Consultar extends ClsConexion {
    
     
     
    public boolean Registra(Clsperson pro)
    {
        Connection conn = null;
          PreparedStatement stmt = null;
          boolean correcto = false;
        
        
        
          
          
     PreparedStatement ps = null;
     Connection con = getConexion();
     String sql = "INSERT INTO consumidor (Codigo, Nombre, Enero, Febrero, Marzo,   values  (?,?,?,?,?,)";
     
     
     try{
      
     ps = con.prepareStatement(sql);
     ps.setString(1, pro.getCodigo());
     ps.setString(2, pro.getNombre());
     ps.setDouble(3, pro.getEnero());
     ps.setDouble(4, pro.getFebrero());
     ps.setDouble(5, pro.getMarzo());
     
     ps.execute();
     
     return true;
     
     
     }catch(SQLException e)
     {
      System.err.print(e);
      return false;
     }finally{
         try{
          con.close();
          
         
         } catch(SQLException e)
         {
          System.err.print(e);
         }
     }    
    }
//     correcto = true;
//          } catch (SQLException ex) {
//               JOptionPane.showMessageDialog(null, ex + "No se Insertaron tus datos");
//          } finally {
//               ClsConexion.CloseConection(stmt);
//               ClsConexion.CloseConection((PreparedStatement) conn);
//
//          }
//          return correcto;
//     }
//   
    
    
    
    
     public boolean Modificar(Clsperson pro)
    {
     PreparedStatement ps = null;
     Connection con = getConexion();
     String sql = "UPDATE consumidor SET  Codigo=?, Nombre=?, Enero=?, Febrero=?, Marzo=?  WHERE Id=?";
     
     
     try{
      
     ps = con.prepareStatement(sql);
     ps.setString(1, pro.getCodigo());
     ps.setString(2, pro.getNombre());
     ps.setDouble(3, pro.getEnero());
     ps.setDouble(4, pro.getFebrero());
     ps.setDouble(5, pro.getMarzo());
     
     ps.setInt(6, pro.getId());
             
     ps.execute();
     
     return true;
     
     
     }catch(SQLException e)
     {
      System.err.print(e);
      return false;
     }finally{
         try{
          con.close();
          
         
         } catch(SQLException e)
         {
          System.err.print(e);
         }
     }    
    }
    
     public boolean Eliminar(Clsperson pro)
    {
     PreparedStatement ps = null;
     Connection con = getConexion();
     String sql = "DELETE FROM consumidor  WHERE Id=?";
     
     
     try{
      
     ps = con.prepareStatement(sql);
     ps.setInt(1, pro.getId());
     
     ps.execute();
     
     return true;
     
     
     }catch(SQLException e)
     {
      System.err.print(e);
      return false;
     }finally{
         try{
          con.close();
          
         
         } catch(SQLException e)
         {
          System.err.print(e);
         }
     }    
    }
     
     public boolean Buscar(Clsperson pro)
    {
     PreparedStatement ps = null;
     ResultSet rs = null;
     
     Connection con = getConexion();
     String sql = "SELECT * FROM consumidor  WHERE Codigo=?";
     
     
     try{
      
     ps = con.prepareStatement(sql);
     ps.setString(1, pro.getCodigo());
     
     rs = ps.executeQuery ();
     
     if(rs.next())
     {
     pro.setId(Integer.parseInt(rs.getString("Id")));
     pro.setCodigo(rs.getString("Codigo"));
     pro.setNombre(rs.getString("Nombre"));
     pro.setEnero(Double.parseDouble(rs.getString("Enero")));
     pro.setFebrero(Double.parseDouble(rs.getString("Febrero")));
     pro.setMarzo(Double.parseDouble(rs.getString("Marzo")));
    
     return true;
     }
     
     
      return false;
     
     
     }catch(SQLException e)
     {
      System.err.print(e);
      return false;
     }finally{
         try{
          con.close();
          
         
         } catch(SQLException e)
         {
          System.err.print(e);
         }
     }    
    }
     
     
}
