/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Bryan
 */
public class Clsperson {
    
    
     private int Id;
    private String Codigo; 
    private String Nombre;
    private Double Enero;
    private Double Febrero;
    private Double Marzo;
    private Double Total;

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
        
        Total = this.Enero+this.Febrero+this.Marzo;
          
          this.Total = Total;
        
        
    }
    

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getEnero() {
        return Enero;
    }

    public void setEnero(Double Enero) {
        this.Enero = Enero;
    }

    public Double getFebrero() {
        return Febrero;
    }

    public void setFebrero(Double Febrero) {
        this.Febrero = Febrero;
    }

    public Double getMarzo() {
        return Marzo;
    }

    public void setMarzo(Double Marzo) {
        this.Marzo = Marzo;
    }
    
    
}
