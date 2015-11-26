package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import modelo.ModeloCompras;
import modelo.ModeloVentas;
import vista.Interface;

public class ControladorCompras implements ActionListener, MouseListener {

    Interface vista;
    ModeloCompras modelo = new ModeloCompras();
    ModeloVentas modeloV = new ModeloVentas();
    int fila = -1;
    String tabla;
    int pedido = 1;
    int factura = 2;
    String[] comboBuscarPedido = {"-Seleccionar-", "ID Pedido", "DNI"};
    String[] comboBuscarFactura = {"-Seleccionar-", "ID Factura", "ID Pedido Factura"};
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
            this.vista.tablePagos.setModel(this.modelo.getTablaPagos());

            this.vista.jComboVisualizar.setModel(new javax.swing.DefaultComboBoxModel(comboVisualizar));

        } catch (Exception e) {
        }
        /*-----COMPRAS-----*/
        this.vista.btnAñadirProveedor.setActionCommand("btnAñadirProveedor");
        this.vista.btnAñadirProveedor.addActionListener(this);

        this.vista.btnModificarProveedor.setActionCommand("btnModificarProveedor");
        this.vista.btnModificarProveedor.addActionListener(this);

        this.vista.btnEliminarProveedor.setActionCommand("btnEliminarProveedor");
        this.vista.btnEliminarProveedor.addActionListener(this);

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
        this.vista.txtBuscadorProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarProveedores(evt);
            }

        });

        /*-----ALMACEN-----*/
        this.vista.btnImprimir.setActionCommand("btnImprimir");
        this.vista.btnImprimir.addActionListener(this);

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
                    //Mostramos el boton
                    vista.btnImprimir.setVisible(true);
                    //Cambio nombre del boton
                    vista.btnImprimir.setLabel("Visualizar");

                } else if (vista.jComboVisualizar.getSelectedItem().equals("Factura")) {
                    //LLamada a los paneles     
                    vista.pPanelVisualizarPedido.setVisible(false);
                    vista.pPanelVisualizarInicial.setVisible(false);
                    vista.pPanelVisualizarFactura.setVisible(true);
                    vista.jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel(comboBuscarFactura));
                    //Mostramos el boton
                    vista.btnImprimir.setVisible(true);
                    //Cambio nombre del boton
                    vista.btnImprimir.setLabel("Imprimir");

                } else if (vista.jComboVisualizar.getSelectedItem().equals("-Seleccionar-")) {
                    //Ocultamos el boton
                    vista.btnImprimir.setVisible(false);
                }
            }

        });
        /*-----------------------------TABLAS---------------------------------------*/
        this.vista.tablaVisualizarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVisualizarPedidoMouseClicked(evt);
            }
        });
        this.vista.tablePagos.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPagoMouseClicked(evt);
            }
        });

        //evento checkbox
        this.vista.cbxStockAlmacen.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                if (vista.cbxStockAlmacen.isSelected() == true) {
                    vista.tablaArticulosAlmacen.setModel(modelo.getTablaArticulosStock());
                } else {
                    vista.tablaArticulosAlmacen.setModel(modeloV.getTablaAlmacen());
                }

            }
        });
        /*-------------------------------------BUSCAR -----------------------------------------*/
        this.vista.txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {

            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
                BuscarVisualizar(evt);
            }
        });
        this.vista.txtBuscadorAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarArticulos(evt);
            }

        });
        this.vista.txtBuscadorPagos.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarPagos(evt);
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

        } else if (comand.equals("btnImprimir")) { /*-----ALMACEN-----*/

            try {

                this.vista.tablaVisualizarPedido.getSelectedRow();
                //comprobamos que se selecciona una fila en la tabla 
                if (this.vista.tablaVisualizarPedido.getSelectedRow() < 0) {
                    JOptionPane.showMessageDialog(vista, "Seleccione una fila");

                } else if (this.vista.jComboVisualizar.getSelectedItem().equals("Pedido")) {//comprobamos en que tabla estamos
                    String id_pedido= (String)this.vista.tablaVisualizarPedido.getValueAt(fila, 0);
                    this.vista.jPanelPedido.setVisible(true);//cambiamos de panel
                    this.vista.jPanelVisualizar.setVisible(false);//ocultamos el actual
                    
                    this.vista.tablePedidoCarrito.setModel(this.modeloV.getTablaCarrito(Integer.valueOf(id_pedido)));

                }/*else if(this.vista.jComboVisualizar.getSelectedItem().equals("Factura")){
                 PARA CREAR LA FATURA CON EL INDITEX O COMO COÑO SE ESCRIBA 
                 xDDDDDDDD TO PA TI PEDRO TO PA TI ....
                 }*/

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }
    /*----------------------------------------------------TABLAS-----------------------------------------------*/
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
    private void tablaArticulosAlmacenMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vista.tablaArticulosAlmacen.getSelectedRow();
        String id = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila, 0);
        String nombre = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila, 1);
        String stock = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila, 2);
        String precio = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila, 3);
        String nif = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila, 4);
        String iva = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila, 5);

        this.vista.txtIDAlmacen.setText(id);
        this.vista.txtNombreAlmacen.setText(nombre);
        this.vista.txtStockAlmacen.setText(stock);
        this.vista.txtPrecioAlmacen.setText(precio);
        this.vista.txtNIFAlmacen.setText(nif);
        this.vista.txtIVAAlmacen.setValue(0);

    }

    private void tablaVisualizarPedidoMouseClicked(java.awt.event.MouseEvent evt) {
        fila = this.vista.tablaVisualizarPedido.getSelectedRow();
        String id_pedido = (String) this.vista.tablaVisualizarPedido.getValueAt(fila, 0);
        String DNI = (String) this.vista.tablaVisualizarPedido.getValueAt(fila, 1);

        this.vista.txtDNIPedido.setText(DNI);
        this.vista.tablePedidoCarrito.setModel(this.modeloV.getTablaCarrito(Integer.valueOf(id_pedido)));
    }

    private void tablaPagoMouseClicked(java.awt.event.MouseEvent evt) {

        //Recogemos los valores de las tablas
        fila = this.vista.tablePagos.getSelectedRow();
        String nif = (String) this.vista.tablePagos.getValueAt(fila, 0);
        String id_articulo = (String) this.vista.tablePagos.getValueAt(fila, 1);
        String cantidad = (String) this.vista.tablePagos.getValueAt(fila, 2);
        String precio = (String) this.vista.tablePagos.getValueAt(fila, 3);
        String fecha = (String) this.vista.tablePagos.getValueAt(fila, 4);
        //buscamos el precio dle articulo
        int precio_articulo = this.modelo.getPrecioArticulo(Integer.valueOf(id_articulo));
        //Volcamos los datos en los jtextField
        this.vista.txtPagosProveedor.setText(nif);
        this.vista.txtPagosArticulo.setText(id_articulo);
        this.vista.txtPagosCantidad.setText(cantidad);
        this.vista.txtPagosPrecio.setText(String.valueOf(precio_articulo));
        this.vista.txtPagosTotal.setText(precio);
        this.vista.txtPagosFecha.setText(fecha);

    }
    /*----------------------------------------------------METODO BUSCAR-----------------------------------------------*/

    //Buscar facturas y pedidos
    private void BuscarVisualizar(java.awt.event.KeyEvent evt) {

        String buscar = this.vista.txtBuscadorArticulos.getText();
        if (this.vista.jComboVisualizar.getSelectedItem().equals("Pedido")
                && (this.vista.jComboBuscar.getSelectedItem() == "DNI"
                || this.vista.jComboBuscar.getSelectedItem() == "ID_Pedido")) {

            this.vista.tablaVisualizarPedido.setModel(this.modelo.buscarPedido(buscar));

        } else if (this.vista.jComboVisualizar.getSelectedItem().equals("Pedido")
                && (this.vista.jComboBuscar.getSelectedItem() == "DID_Factura"
                || this.vista.jComboBuscar.getSelectedItem() == "ID_Pedido")) {

            this.vista.tablaVisualizarFactura.setModel(this.modelo.buscarFactura(buscar));

        } else if (this.vista.jComboVisualizar.getSelectedItem().equals("-Seleccionar-")) {

            JOptionPane.showMessageDialog(vista, "Tienes que Seleccionar las tablas");

        } else if (this.vista.jComboBuscar.getSelectedItem() == "-Seleccionar-") {

            JOptionPane.showMessageDialog(vista, "Tienes que Seleccionar la Columna");

        }

    }

    //Buscar Proveedores
    private void BuscarProveedores(java.awt.event.KeyEvent evt) {
        String buscar = this.vista.txtBuscadorProveedores.getText();//pasamos el valor recogido en el jtxtfield
        this.vista.tableProveedores.setModel(this.modelo.buscarProveedores(buscar));//refrescamos la tabla
    }

    //Buscar en articulos
    private void BuscarArticulos(java.awt.event.KeyEvent evt) {

        String buscar = this.vista.txtBuscadorAlmacen.getText();//pasamos el valor recogido en el jtxtfield
        this.vista.tablaArticulosAlmacen.setModel(this.modelo.buscarArticulo(buscar));//refrescamos la tabla
    }

    //Buscar Pagos
    private void BuscarPagos(java.awt.event.KeyEvent evt) {

            String buscar = this.vista.txtBuscadorPagos.getText();
            this.vista.tablePagos.setModel(this.modelo.buscarPagos(buscar));

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
