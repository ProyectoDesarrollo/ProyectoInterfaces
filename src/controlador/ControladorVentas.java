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
        btnAñadirPedido,
        btnModificarPedido,
        btnBorrarPedido,
        btnCrearFactura,
        btnAñadirClientes,
        btnModificarCliente,
        btnBorrarCliente
    }
    
    public ControladorVentas(Interface vista){
        this.vista=vista;
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
        
        this.vista.btnAñadirPedido.setActionCommand( "btnAñadirPedido" );
        this.vista.btnAñadirPedido.addActionListener(this);
        
        this.vista.btnModificarPedido.setActionCommand( "btnModificarPedido" );
        this.vista.btnModificarPedido.addActionListener(this);
        
        this.vista.btnBorrarPedido.setActionCommand( "btnEliminarPedido" );
        this.vista.btnBorrarPedido.addActionListener(this);
        
        this.vista.btnCrearFactura.setActionCommand( "btnCrearFactura" );
        this.vista.btnCrearFactura.addActionListener(this);
        
        this.vista.btnAñadirCliente.setActionCommand( "btnAñadirCliente" );
        this.vista.btnAñadirCliente.addActionListener(this);
        
        this.vista.btnModificarCliente.setActionCommand( "btnModificarCliente" );
        this.vista.btnModificarCliente.addActionListener(this);
        
        this.vista.btnBorrarCliente.setActionCommand( "btnEliminarCliente" );
        this.vista.btnBorrarCliente.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
    switch(AccionMVC.valueOf(e.getActionCommand())) {
        
        case btnAñadirPedido:           
            
            break;
        
        case btnModificarPedido:
            
            break;
        
        case btnBorrarPedido:
            
            break;
            
        case btnCrearFactura:
            
            break;
            
        case btnAñadirCliente:
            
            break;
            
        case btnModificarCliente:
            
            break;
            
        case btnBorrarCliente:
            
            break;
        
    
    }
    }

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
}
