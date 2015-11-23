package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.ModeloCompras;
import modelo.ModeloVentas;
import vista.Interface;

public class ControladorCompras implements ActionListener, MouseListener {

    Interface vista;
    ModeloCompras modelo = new ModeloCompras();
    int fila = -1;
    String tabla;
    int pedido = 1;
    int factura = 2;
    String[] comboBuscar = {"-Seleccionar-", "DNI", "Nombre"};
    String[] comboVisualizar = {"-Seleccionar-", "Pedido", "Factura"};

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

            this.vista.tableProveedores.setModel(this.modelo.getTablaProveedores());
            this.vista.tablaVisualizarFactura.setModel(this.modelo.getTablaFactura());
            this.vista.tablaVisualizarPedido.setModel(this.modelo.getTablaPedido());
            this.vista.jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel(comboBuscar));
            this.vista.jComboVisualizar.setModel(new javax.swing.DefaultComboBoxModel(comboVisualizar));
            this.vista.jComboBuscar.setSelectedIndex(0);
            this.vista.jComboVisualizar.setSelectedIndex(0);

            //this.vista.jTable.setModel(this.modelo.());
            //this.vista.jTable.setModel(this.modelo.());
        } catch (Exception e) {
        }
        /*-----COMPRAS-----*/
        this.vista.btnAñadirProveedor.setActionCommand("btnAñadirProveedor");
        this.vista.btnAñadirProveedor.addActionListener(this);

        this.vista.btnModificarProveedor.setActionCommand("btnModificarProveedor");
        this.vista.btnModificarProveedor.addActionListener(this);

        this.vista.btnEliminarProveedor.setActionCommand("btnEliminarProveedor");
        this.vista.btnEliminarProveedor.addActionListener(this);

        this.vista.tableProveedores.addMouseListener(this);
        
        /*-----ALMACEN-----*/
        this.vista.btnBuscar.setActionCommand("btnBuscar");
        this.vista.btnBuscar.addActionListener(this);

        //controlamos lo que ocurra en el jComboBox Visualizar
        this.vista.jComboVisualizar.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (vista.jComboVisualizar.getSelectedItem().equals("Pedido")) {
                    //LLamada a los paneles              
                    vista.pPanelVisualizarPedido.setVisible(true);
                    vista.pPanelVisualizarInicial.setVisible(false);
                    vista.pPanelVisualizarFactura.setVisible(false);
                    

                } else if (vista.jComboVisualizar.getSelectedItem().equals("Factura")) {
                    //LLamada a los paneles     
                    vista.pPanelVisualizarPedido.setVisible(false);
                    vista.pPanelVisualizarInicial.setVisible(false);
                    vista.pPanelVisualizarFactura.setVisible(true);
                    

                }
            }

        });
    }

    public void actionPerformed(ActionEvent e) {
        //Captura en String el comando accionado por el usuario
        String comand = e.getActionCommand();

        /*-----COMPRAS-----*/
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
            /*-----ALMACEN-----*/
        } else if (comand.equals("btnBuscar")) {

            String variBusqueda = this.vista.txtBuscar.getText();
            if (this.vista.jComboBuscar.getSelectedItem().equals("DNI")) {

            } else if (this.vista.jComboBuscar.getSelectedItem().equals("Nombre")) {

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
    /*-----COMPRAS-----*/

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
   
 /*-----ALMACEN-----*/
}
