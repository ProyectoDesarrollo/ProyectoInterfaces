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
import javax.swing.JOptionPane;
import modelo.ModeloVentas;
import vista.Interface;

/**
 *
 * @author usuario
 */
public class ControladorCompras implements ActionListener, MouseListener {

    Interface vista;
    ModeloVentas modelo;
    int fila = -1;

    public enum AccionMVC {

        btnAñadirProveedor,
        btnModificarProveedor,
        btnEliminarProveedor,
        btnAñadirArticuloProveedor,
        btnModificarArticuloProveedor,
        btnBorrarArticuloProveedor

    }

    public ControladorCompras(Interface vista) {
        this.vista = vista;
    }

    public void iniciar() {
        try {
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());

        } catch (Exception e) {
        }

        this.vista.btnAñadirProveedor.setActionCommand("btnAñadirProveedor");
        this.vista.btnAñadirProveedor.addActionListener(this);

        this.vista.btnModificarProveedor.setActionCommand("btnModificarProveedor");
        this.vista.btnModificarProveedor.addActionListener(this);

        this.vista.btnEliminarProveedor.setActionCommand("btnEliminarProveedor");
        this.vista.btnEliminarProveedor.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        //Captura en String el comando accionado por el usuario
        String comand = e.getActionCommand();
        if (comand.equals("btnAñadirProveedor")) {
            String dni = (String) this.vista.txtNIFProveedores.getText();
            String nombre =(String) this.vista.txtNombreProveedores.getText();
            String apellidos = (String)this.vista.txtApellidosProveedores.getText();
            int telefono = Integer.parseInt(this.vista.txtTelefonoProveedor.getText());
            
            if(dni != null & nombre != null && telefono > 600000000   ){
                
                modelo.InsertarProveedores(dni, nombre, apellidos, telefono);
                
            }else{
                JOptionPane.showMessageDialog(vista,"Los campos con asteriscos(*) son obligatorios");
            }
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

}
