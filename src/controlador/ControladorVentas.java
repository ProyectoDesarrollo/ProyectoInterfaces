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
        btnEliminar_Pedido,
        btnBuscar_Pedido
    }
    
    public ControladorVentas(Interface vista){
        this.vista=vista;
    }
    
    public void iniciar(){
        try {
            
        } catch (Exception e) {
        }
 
    }
    
    public void actionPerformed(ActionEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
}
