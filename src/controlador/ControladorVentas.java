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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.ModeloVentas;
import vista.Interface;

/**
 *
 * @author usuario
 */
public class ControladorVentas implements ActionListener,MouseListener{

    Interface vista;
    ModeloVentas modelo = new ModeloVentas();
    int fila =-1;
    ArrayList <String> ListaPedido = new ArrayList<>(); 
    
    public enum AccionMVC{
        btnAñadirPedido,
        btnModificarPedido,
        btnBorrarPedido,
        btnCrearFactura,
        btnAñadirCliente,
        btnModificarCliente,
        btnBorrarCliente,
        btnAñadirPresupuesto,
        btnModificarPresupuesto,
        btnBorrarPresupuesto
    }
    
    public ControladorVentas(Interface vista){
        this.vista=vista;
        
    }
    
    public void iniciar(){
        
        try {
            
            this.vista.jPanelPrincipal.setVisible(true);
            this.vista.tablePedidoBuscarArticulo.setModel(this.modelo.getTablaArticulos());
            this.vista.tableClientes.setModel(this.modelo.getTablaClientes());
            
            
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
        
        this.vista.btnAñadirPresupuesto.setActionCommand( "btnAñadirPresupuesto" );
        this.vista.btnAñadirPresupuesto.addActionListener(this);
        
        this.vista.btnModificarPresupuesto.setActionCommand( "btnModificarPresupuesto" );
        this.vista.btnModificarPresupuesto.addActionListener(this);
        
        this.vista.btnBorrarPresupuesto.setActionCommand( "btnEliminarPresupuesto" );
        this.vista.btnBorrarPresupuesto.addActionListener(this);
        
        this.vista.tableClientes.addMouseListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
    switch(AccionMVC.valueOf(e.getActionCommand())) {
        
        case btnAñadirPedido:   
          
            try {
                
                ArrayList<Articulo> ListaPedido = new ArrayList<Articulo>();

                String id = this.vista.txtIDPedido.getText();
                String nombre = this.vista.txtNombreArticuloPedido.getText();
                String precio = this.vista.txtPrecio.getText();
                    
                ListaPedido.add(new Articulo(id, nombre, precio));         
                //this.vista.Tabla.setModel(this.modelo.getTabla(ListaPedido));                
                
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
        
        case btnModificarPedido:
            
            try {
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
            
        case btnBorrarPedido:
            
            try {
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
            
        case btnCrearFactura:
            
            try {
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
            
        case btnAñadirCliente:
            
            try {
                           
                String dni= this.vista.txtDNICliente.getText();
                String nombre= this.vista.txtNombreCliente.getText();
                String apellidos= this.vista.txtApellidosCliente.getText();
                String direccion= this.vista.txtDireccionCliente.getText();
                int tarjeta= Integer.parseInt(this.vista.txtTarjetaCliente.getText());                          
                int telefono= Integer.parseInt(this.vista.txtTelefonoCliente.getText());
                this.modelo.InsertarCliente(dni, nombre, apellidos, direccion, telefono, tarjeta);
                this.vista.tableClientes.setModel(this.modelo.getTablaClientes());
                this.vista.txtDNICliente.setText("");
                this.vista.txtNombreCliente.setText("");
                this.vista.txtApellidosCliente.setText("");
                this.vista.txtDireccionCliente.setText("");
                this.vista.txtTarjetaCliente.setText("");
                this.vista.txtTelefonoCliente.setText("");                         
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
            
        case btnModificarCliente:
            
            try {
                
                this.vista.tableClientes.getSelectedRow();
                if(this.vista.tableClientes.getSelectedRow()<0){
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");

                }else{
                        
                    String dni=this.vista.txtDNICliente.getText();
                    String nombre=this.vista.txtNombreCliente.getText();
                    String apellidos=this.vista.txtApellidosCliente.getText();                                           
                    int telefono= Integer.parseInt(this.vista.txtTelefonoCliente.getText());
                    String direccion=this.vista.txtDireccionCliente.getText();
                    int tarjeta= Integer.parseInt(this.vista.txtTarjetaCliente.getText());  
                                         
                    this.modelo.modificarCliente(dni, nombre, apellidos, direccion, telefono, tarjeta);
                    this.vista.tableClientes.setModel(this.modelo.getTablaClientes());
                    this.vista.txtDNICliente.setText(" ");
                    this.vista.txtNombreCliente.setText(" ");
                    this.vista.txtApellidosCliente.setText(" ");
                    this.vista.txtDireccionCliente.setText(" ");
                    this.vista.txtTelefonoCliente.setText(" ");
                    this.vista.txtTarjetaCliente.setText(" ");
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
            
        case btnBorrarCliente:
            
            try {
                
                this.vista.tableClientes.getSelectedRow();
                if(this.vista.tableClientes.getSelectedRow()<0){
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }else{
                    fila=this.vista.tableClientes.getSelectedRow();                                          
                    String dni= (String) this.vista.tableClientes.getValueAt(fila, 0);
                    this.modelo.EliminarClientes(dni);
                    this.vista.tableClientes.setModel(this.modelo.getTablaClientes());
                    JOptionPane.showMessageDialog(null, "Eliminado");
                }
                
            } catch (Exception ex) {
                    ex.printStackTrace();
            }
            
            break;
            
        case btnAñadirPresupuesto:
            
            try {
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
            
        case btnModificarPresupuesto:
            
            try {
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
            
        case btnBorrarPresupuesto:
            
            try {
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            break;
        
    
    }
    }
    
    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {                                                   
         
        fila=this.vista.tableClientes.getSelectedRow();
        String dni= (String) this.vista.tableClientes.getValueAt(fila, 0);
        String nombre= (String) this.vista.tableClientes.getValueAt(fila, 1);
        String apellidos= (String) this.vista.tableClientes.getValueAt(fila, 2);
        String direccion= (String) this.vista.tableClientes.getValueAt(fila, 3);
        String telefono= (String) this.vista.tableClientes.getValueAt(fila, 4);
        String tarjeta= (String) this.vista.tableClientes.getValueAt(fila, 5);
            
        this.vista.txtDNICliente.setText(dni);
        this.vista.txtNombreCliente.setText(nombre);
        this.vista.txtApellidosCliente.setText(apellidos);
        this.vista.txtDireccionCliente.setText(direccion);
        this.vista.txtTelefonoCliente.setText(telefono);
        this.vista.txtTarjetaCliente.setText(tarjeta);
    }
    
    private void tablePedidoBuscarArticuloMouseClicked(java.awt.event.MouseEvent evt) {                                                   
         
        fila=this.vista.tablePedidoBuscarArticulo.getSelectedRow();
        String id= (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila, 0);
        String nombre= (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila, 1);
        String cantidad= (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila, 2);
        String precio= (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila, 3);
                  
        this.vista.txtIDPedido.setText(id);
        this.vista.txtNombreArticuloPedido.setText(nombre);
        this.vista.txtPrecio.setText(precio);
        
    }
    
    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
}
