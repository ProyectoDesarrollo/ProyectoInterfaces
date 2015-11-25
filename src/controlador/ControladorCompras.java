package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import modelo.ModeloCompras;
import vista.Interface;

public class ControladorCompras implements ActionListener, MouseListener {

    Interface vista;
    ModeloCompras modelo = new ModeloCompras();
    int fila = -1;
    String tabla;
    int pedido = 1;
    int factura = 2;
    String[] comboBuscarPedido = {"-Seleccionar-", "ID Pedido", "DNI"};
    String[] comboBuscarFactura = {"-Seleccionar-", "ID Factura", "ID Pedido"};
    String[] comboVisualizar = {"-Seleccionar-", "Pedido", "Factura"};
    private TableRowSorter filtro;

    //en esta parte no es necesario
    /*public enum AccionMVC {

     btnAñadirProveedor,
     btnModificarProveedor,
     btnEliminarProveedor,
     btnAñadirArticuloProveedor,
     btnModificarArticuloProveedor,
     btnBorrarArticuloProveedor

     }*/
    public ControladorCompras(Interface vista) {
        this.vista = vista;
    }

    public void iniciar() {
        try {

            this.vista.tableProveedores.setModel(this.modelo.getTablaProveedores());
            this.vista.tablaVisualizarFactura.setModel(this.modelo.getTablaFactura());
            this.vista.tablaVisualizarPedido.setModel(this.modelo.getTablaPedido());

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

        //evento tabla proveedores
        this.vista.tableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedoresMouseClicked(evt);
            }

        });
        //eventos para bloquear letras o Numeros , además de la longitud
        this.vista.txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                
                soloNumeros(evt);
                if (vista.txtTelefonoProveedor.getText().length() >= 9) {
                    evt.consume();
                }

            }

        });

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
                    vista.jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel(comboBuscarPedido));

                } else if (vista.jComboVisualizar.getSelectedItem().equals("Factura")) {
                    //LLamada a los paneles     
                    vista.pPanelVisualizarPedido.setVisible(false);
                    vista.pPanelVisualizarInicial.setVisible(false);
                    vista.pPanelVisualizarFactura.setVisible(true);
                    vista.jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel(comboBuscarFactura));

                }
            }

        });
        this.vista.txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
                txtBuscarKeyTyped(evt);
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
                String dni = this.vista.txtNIFProveedores.getText();
                String nombre = this.vista.txtNombreProveedores.getText();
                String apellidos = this.vista.txtApellidosProveedores.getText();
                int telefono = Integer.parseInt(this.vista.txtTelefonoProveedor.getText());
                //llamamos al metodo  insertar
                this.modelo.InsertarProveedores(dni, nombre, apellidos, telefono);
                //refrescamos la tabla
                this.vista.tableProveedores.setModel(this.modelo.getTablaProveedores());
                //vaciamos los jtextField
                this.vista.txtNIFProveedores.setText("");
                this.vista.txtNombreProveedores.setText("");
                this.vista.txtApellidosProveedores.setText("");
                this.vista.txtTelefonoProveedor.setText("");

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
                    int telefono = Integer.parseInt(this.vista.txtTelefonoProveedor.getText());
                    //llamamos al metodo para modificar
                    this.modelo.modificarProveedor(nif, nombre, apellidos, telefono);
                    //refrescamos la tabla
                    this.vista.tableProveedores.setModel(this.modelo.getTablaProveedores());
                    //ponemos los jText vacios
                    this.vista.txtNIFProveedores.setText(" ");
                    this.vista.txtNombreProveedores.setText(" ");
                    this.vista.txtApellidosProveedores.setText(" ");
                    this.vista.txtTelefonoProveedor.setText(" ");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (comand.equals("btnEliminarProveedor")) {
            try {
                this.vista.tableProveedores.getSelectedRow();
                if (this.vista.tableProveedores.getSelectedRow() < 0) {
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                } else {
                    fila = this.vista.tableProveedores.getSelectedRow();
                    String nif = (String) this.vista.tableProveedores.getValueAt(fila, 0);
                    this.modelo.EliminarProveedores(nif);
                    //refrescamos la tabla
                    this.vista.tableProveedores.setModel(this.modelo.getTablaProveedores());
                }

            } catch (Exception ex) {
            }

        } else if (comand.equals("btnBuscar")) { /*-----ALMACEN-----*/


        }

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
    
    
    /*----------------------------------------------------METODO BUSCAR-----------------------------------------------*/
    public void buscar() {
        int columBuscar = 0;
        if ((this.vista.jComboBuscar.getSelectedItem() == "ID Pedido") || this.vista.jComboBuscar.getSelectedItem() == "ID Factura") {
            columBuscar = 1;
        } 
        if ((this.vista.jComboBuscar.getSelectedItem() == "ID Pedido") || (this.vista.jComboBuscar.getSelectedItem() == "DNI")) {
            columBuscar = 2;
        }
        filtro.setRowFilter(RowFilter.regexFilter(this.vista.txtBuscar.getText(), columBuscar));
    }

    public void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {
        this.vista.txtBuscar.addKeyListener(new KeyAdapter() {

            public void KeyReased(final KeyEvent evt) {
                String cadena = (vista.txtBuscar.getText());
                vista.txtBuscar.setText(cadena);
                buscar();
            }
        });
        if (vista.jComboVisualizar.getSelectedItem() == "Pedido") {
            filtro = new TableRowSorter(modelo.getTablaPedido());
        } else if (vista.jComboVisualizar.getSelectedItem() == "Factura") {
            filtro = new TableRowSorter(modelo.getTablaFactura());
        }

    }
     /*-----------------------------------------------FIN--METODO BUSCAR-----------------------------------------------*/
    
    
    /*--------METODOS PARA CONTROLAR LA ESCRITURA---------*/

    //Para letras
    public void soloLetras(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < 'A') || (c > 'Z') && (c < 'a') || (c > 'z')) {
            evt.consume();

        }

    }

    //Para Numeros
    public void soloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')) {
            evt.consume();
        }
    }

    /*--------------------------------------AUTOGENERADO--------------------------------------*/
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
