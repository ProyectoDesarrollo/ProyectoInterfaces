/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Interface;

/**
 *
 * @author usuario
 */
public class ControladorVentas implements ActionListener,MouseListener{

    Interface vista;
    
    public enum AccionMVC{
        btnAñadir_Pedido,
        btnModificar_Pedido,
        btnBorrar_Pedido,
        btnCrear_Factura
    }
    
    public ControladorVentas(Interface vista){
        this.vista=vista;
    }
    
    public void iniciar(){
        try {
            //Iniciar tablas
            
        } catch (Exception e) {
        }
        
        this.vista.btnAñadir_Pedido.setActionCommand( "btnAñadir_Pedido" );
        this.vista.btnAñadir_Pedido.addActionListener(this);
        
        this.vista.btnModificar_Pedido.setActionCommand( "btnModificar_Pedido" );
        this.vista.btnModificar_Pedido.addActionListener(this);
        
        this.vista.btnBorrar_Pedido.setActionCommand( "btnEliminar_Pedido" );
        this.vista.btnBorrar_Pedido.addActionListener(this);
        
        this.vista.btnCrear_Factura.setActionCommand( "btnCrear_Factura" );
        this.vista.btnCrear_Factura.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
    switch(AccionMVC.valueOf(e.getActionCommand())) {
        
        case btnAñadir_Pedido:           
            
            break;
        
        case btnModificar_Pedido:
            
            break;
        
        case btnBorrar_Pedido:
            
            break;
            
        case btnCrear_Factura:
            
            break;
        
    
    }
    }

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
}
