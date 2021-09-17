/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Datos.Clsperson;
import Datos.Consultar;
import Dominio.Control;
import Paquete1.interfaz;

/**
 *
 * @author Bryan
 */
public class ClsPrincipal {
    
    
    
    public static void main(String [] args){
        
   Clsperson mod = new Clsperson();
   Consultar modc = new Consultar ();
   interfaz frm = new interfaz ();
   
   
   Control crt = new Control(mod, modc, frm);
   crt.iniciar();
   frm.setVisible(true);
   
   
   
    
    }
    
    
}
