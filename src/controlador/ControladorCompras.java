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

    //en esta parte no es necesario
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
        
        this.vista.tableProveedores.addMouseListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        //Captura en String el comando accionado por el usuario
        String comand = e.getActionCommand();
        //dependiendo del comand realizara una accion u otra
        if (comand.equals("btnAñadirProveedor")) {
            
            try {
                //obtenemos los datos de los jTextField
                String dni = (String) this.vista.txtNIFProveedores.getText();
                String nombre = (String) this.vista.txtNombreProveedores.getText();
                String apellidos = (String) this.vista.txtApellidosProveedores.getText();
                int telefono = Integer.parseInt(this.vista.txtTelefonoProveedor.getText());
                
                if (dni != null & nombre != null && telefono > 600000000) {
                    
                    modelo.InsertarProveedores(dni, nombre, apellidos, telefono);
                    
                } else {
                    
                    JOptionPane.showMessageDialog(vista, "Los campos con asteriscos(*) son obligatorios");
                }
            } catch (Exception ex) {
            }
            
        } else if (comand.equals("btnModificarProveedor")) {
            try {
                this.vista.tableProveedores.getSelectedRow();
                if (this.vista.tableProveedores.getSelectedRow() < 0) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");
                } else {
                    //Obtenemos los datos de los jtextField
                    String nif = this.vista.txtNIFProveedores.getText();
                    String nombre = this.vista.txtNombreProveedores.getText();
                    String apellidos = this.vista.txtApellidosProveedores.getText();
                    int teñefono = Integer.parseInt(this.vista.txtTelefonoProveedor.getText());
                    //llamamos al metodo para modificar
                    this.modelo.modificarProveedor(nif, nombre, apellidos, teñefono);
                    this.vista.txtNIFProveedores.setText("");
                    this.vista.txtNombreProveedores.setText("");
                    this.vista.txtApellidosProveedores.setText("");
                    this.vista.txtTelefonoProveedor.setText("");
                }
                
            } catch (Exception ex) {
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
    
    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {
        fila = this.vista.tableProveedores.getSelectedRow();
        String dni = (String) this.vista.tableProveedores.getValueAt(fila, 0);
        String nombre = (String) this.vista.tableProveedores.getValueAt(fila, 1);
        String apellidos = (String) this.vista.tableProveedores.getValueAt(fila, 2);
        String telefono = (String) this.vista.tableProveedores.getValueAt(fila, 3);
        
        this.vista.txtNIFProveedores.setText(dni);
        this.vista.txtNombreProveedores.setText(nombre);
        this.vista.txtApellidosProveedores.setText(apellidos);
        this.vista.txtTelefonoProveedor.setText(telefono);
        
    }
    
}
