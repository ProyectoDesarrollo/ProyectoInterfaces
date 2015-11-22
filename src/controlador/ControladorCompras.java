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
public class ControladorCompras implements ActionListener,MouseListener{

    Interface vista;

    
    
    public enum AccionMVC{
        btnAñadirProveedor,
        btnModificarProveedor,
        btnBorrarProveedor,
        btnAñadirArticuloProveedor,
        btnModificarArticuloProveedor,
        btnBorrarArticuloProveedor

    }
    
    public void iniciar(){
        try {
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            
        } catch (Exception e) {
        }
        
        /*this.vista.btnAñadirProveedor.setActionCommand( "btnAñadirProveedor" );
        this.vista.btnAñadirProveedor.addActionListener(this);
        
        this.vista.btnModificarProveedor.setActionCommand( "btnModificarProveedor" );
        this.vista.btnModificarProveedor.addActionListener(this);
        
        this.vista.btnBorrarProveedor.setActionCommand( "btnEliminarProveedor" );
        this.vista.btnBorrarProveedor.addActionListener(this);
        
        this.vista.btnAñadirArticuloProveedor.setActionCommand( "btnAñadirArticuloProveedor" );
        this.vista.btnAñadirArticuloProveedor.addActionListener(this);
        
        this.vista.btnModificarArticuloProveedor.setActionCommand( "btnModificarArticuloProveedor" );
        this.vista.btnModificarArticuloProveedor.addActionListener(this);
        
        this.vista.btnBorrarArticuloProveedor.setActionCommand( "btnEliminarArticuloProveedor" );
        this.vista.btnBorrarArticuloProveedor.addActionListener(this);*/
    }
    
    /*public void actionPerformed(ActionEvent e) {
    switch(ControladorVentas.AccionMVC.valueOf(e.getActionCommand())) {
        
        case btnAñadirProveedor:           
            
            break;
        
        case btnModificarProveedor:
            
            break;
        
        case btnBorrarProveedor:
            
            break;
            
        case btnAñadirArticuloProveedor:           
            
            break;
        
        case btnModificarArticuloProveedor:
            
            break;
        
        case btnBorrarArticuloProveedor:
            
            break;
    }
    }*/
    
    public void actionPerformed(ActionEvent e) {}
    
    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
    
}
