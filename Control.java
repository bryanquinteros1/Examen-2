/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Datos.Clsperson;
import Datos.Consultar;
import Paquete1.interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Control implements ActionListener {
    
    private Clsperson mod;
    private Consultar modc;
    private interfaz frm;
    
    public Control(Clsperson mod, Consultar modc, interfaz frm)
    {
    this.mod = mod; 
    this.modc = modc;
    this.frm = frm;
    this.frm.btnGuardar.addActionListener(this);
    this.frm.btnModificar.addActionListener(this);
    this.frm.btnEliminar.addActionListener(this);
    this.frm.btnLimpiar.addActionListener(this);
    this.frm.btnBuscar.addActionListener(this);
    
    
    }
    
    public void iniciar()
    {
    
        frm.setTitle("Comisiones");
        frm.setLocationRelativeTo(null);
        frm.txtId.setVisible(false);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()== frm.btnGuardar)
     {
      mod.setCodigo(frm.txtCodigo.getText());
       mod.setNombre(frm.txtNombre.getText());
        mod.setEnero(Double.parseDouble (frm.txtEnero.getText()));
         mod.setFebrero(Double.parseDouble(frm.txtFebrero.getText()));
          mod.setMarzo(Double.parseDouble(frm.txtMarzo.getText()));
     
          if(modc.Registra(mod))
          {
          
          JOptionPane.showMessageDialog(null,"Registro Guardado");
          Limpiar();
          
          }else{
              
              
              JOptionPane.showMessageDialog(null,"Error al  Guardado");
          Limpiar();

          }
     
     }
     
     if(e.getSource()== frm.btnModificar)
     {
      mod.setId(Integer.parseInt(frm.txtId.getText()));
      mod.setCodigo(frm.txtCodigo.getText());
       mod.setNombre(frm.txtNombre.getText());
        mod.setEnero(Double.parseDouble (frm.txtEnero.getText()));
         mod.setFebrero(Double.parseDouble(frm.txtFebrero.getText()));
          mod.setMarzo(Double.parseDouble(frm.txtMarzo.getText()));
     
          if(modc.Modificar(mod))
          {
          
          JOptionPane.showMessageDialog(null,"Modificado");
          Limpiar();
          
          }else{
              
              
              JOptionPane.showMessageDialog(null,"Error");
          Limpiar();

          }
     
     }
     if(e.getSource()== frm.btnEliminar)
     {
      mod.setId(Integer.parseInt(frm.txtId.getText()));
      
     
          if(modc.Eliminar(mod))
          {
          
          JOptionPane.showMessageDialog(null,"Eliminado");
          Limpiar();
          
          }else{
              
              
              JOptionPane.showMessageDialog(null,"Error");
          Limpiar();

          }
     
     }
     if(e.getSource()== frm.btnBuscar)
     {
      mod.setCodigo(frm.txtCodigo.getText());
      
     
          if(modc.Buscar(mod))
          {
          frm.txtId.setText(String.valueOf(mod.getId()));
          frm.txtCodigo.setText(mod.getCodigo());
          frm.txtNombre.setText(mod.getNombre());    
          frm.txtEnero.setText(String.valueOf(mod.getEnero()));
          frm.txtFebrero.setText(String.valueOf(mod.getFebrero()));
          frm.txtMarzo.setText(String.valueOf(mod.getMarzo()));
              
     
          }else{
              
              
              JOptionPane.showMessageDialog(null,"No encontrado");
          Limpiar();

          }
     
     }
     
     if(e.getSource()== frm.btnLimpiar)
     
     {
     Limpiar();
     
     
     }
     
     
     
    
    }
    
    public void Limpiar() 
    
    {
        
    frm.txtId.setText(null);
    frm.txtCodigo.setText(null);
    frm.txtNombre.setText(null);
    frm.txtEnero.setText(null);
    frm.txtFebrero.setText(null);
    frm.txtMarzo.setText(null);
    
    }
    
    
}
