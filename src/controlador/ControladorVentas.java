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
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.ModeloCompras;
import modelo.ModeloVentas;
import vista.Interface;

/**
 *
 * @author usuario
 */
public class ControladorVentas implements ActionListener, MouseListener {

    Interface vista;
    ModeloVentas modelo = new ModeloVentas();
    ModeloCompras modeloC = new ModeloCompras();
    int fila = -1;
    int fila1 = -1;
    int precio_total;
    ArrayList<Articulo> ListaPedido;
    ArrayList<Articulo> ListaPresupuesto;

    public enum AccionMVC {

        btnAñadirPedido,
        btnModificarPedido,
        btnBorrarPedido,
        btnCrearFactura,
        btnAñadirCliente,
        btnModificarCliente,
        btnBorrarCliente,
        btnAñadirPresupuesto,
        btnModificarPresupuesto,
        btnBorrarPresupuesto,
        btnAñadirAlmacen,
        btnModificarAlmacen,
        jMenuItem1,
        jMenuItem2
    }

    public ControladorVentas(Interface vista) {
        this.vista = vista;

    }

    public void iniciar() {

        try {

            ListaPedido = new ArrayList();
            ListaPresupuesto = new ArrayList();
            this.vista.jPanelPrincipal.setVisible(true);
            this.vista.tablePedidoBuscarArticulo.setModel(this.modelo.getTablaArticulos());
            this.vista.tablePresuspuestoBuscarArticulo.setModel(this.modelo.getTablaArticulos());
            this.vista.tablaArticulosAlmacen.setModel(this.modelo.getTablaAlmacen());
            this.vista.tableClientes.setModel(this.modelo.getTablaClientes());

        } catch (Exception e) {
        }

        this.vista.btnAñadirPedido.setActionCommand("btnAñadirPedido");
        this.vista.btnAñadirPedido.addActionListener(this);

        this.vista.btnModificarPedido.setActionCommand("btnModificarPedido");
        this.vista.btnModificarPedido.addActionListener(this);

        this.vista.btnBorrarPedido.setActionCommand("btnBorrarPedido");
        this.vista.btnBorrarPedido.addActionListener(this);

        this.vista.btnCrearFactura.setActionCommand("btnCrearFactura");
        this.vista.btnCrearFactura.addActionListener(this);

        this.vista.btnAñadirCliente.setActionCommand("btnAñadirCliente");
        this.vista.btnAñadirCliente.addActionListener(this);

        this.vista.btnModificarCliente.setActionCommand("btnModificarCliente");
        this.vista.btnModificarCliente.addActionListener(this);

        this.vista.btnBorrarCliente.setActionCommand("btnBorrarCliente");
        this.vista.btnBorrarCliente.addActionListener(this);

        this.vista.btnAñadirPresupuesto.setActionCommand("btnAñadirPresupuesto");
        this.vista.btnAñadirPresupuesto.addActionListener(this);

        this.vista.btnModificarPresupuesto.setActionCommand("btnModificarPresupuesto");
        this.vista.btnModificarPresupuesto.addActionListener(this);

        this.vista.btnBorrarPresupuesto.setActionCommand("btnBorrarPresupuesto");
        this.vista.btnBorrarPresupuesto.addActionListener(this);

        this.vista.btnAñadirAlmacen.setActionCommand("btnAñadirAlmacen");
        this.vista.btnAñadirAlmacen.addActionListener(this);

        this.vista.btnModificarAlmacen.setActionCommand("btnModificarAlmacen");
        this.vista.btnModificarAlmacen.addActionListener(this);
        
        this.vista.jMenuItem1.setActionCommand("jMenuItem1");
        this.vista.jMenuItem1.addActionListener(this);
        
        this.vista.jMenuItem2.setActionCommand("jMenuItem2");
        this.vista.jMenuItem2.addActionListener(this);
        
        //----------------------Funciones de click de ratón sobre tablas---------------------
        this.vista.tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });

        this.vista.tablePedidoBuscarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePedidoBuscarArticuloMouseClicked(evt);
            }
        });

        this.vista.tablePedidoCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePedidoCarritoMouseClicked(evt);
            }
        });

        this.vista.tablePresuspuestoBuscarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePresupuestoBuscarArticuloMouseClicked(evt);
            }
        });

        this.vista.tablePresupuestoCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePresupuestoCarritoMouseClicked(evt);
            }
        });

        this.vista.tablaArticulosAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArticulosAlmacenMouseClicked(evt);
            }
        });

        //----------------------------Funcines de teclado-----------------------------
        this.vista.txtBuscadorArticulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Buscar(evt);
            }
        });

        this.vista.txtBuscadorPresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarPresupuesto(evt);
            }
        });

        this.vista.txtBuscadorClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarClientes(evt);
            }
        });

        this.vista.txtDNIPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DNIPedido(evt);
            }
        });
        this.vista.txtTarjetaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
                if( vista.txtTarjetaCliente.getText().length()>=16){
                    evt.consume();
                }
            }
        });

    }

    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())) {
            
            case jMenuItem1:
                
                this.vista.dispose();
                
                break;
                
            case jMenuItem2:
                
                JOptionPane.showMessageDialog(null, "Trabajo realizado por: \n \nAlejandro Hinojosa García\n \nRoberto Aparicio Delgado\n \nPedro Luis Castro Sánchez\n");
                
                break;
                
            case btnAñadirPedido://Añade un pedido a la tabla pedidos

                try {

                    String id = this.vista.txtIDPedido.getText();
                    String nombre = this.vista.txtNombreArticuloPedido.getText();
                    String cantidad = String.valueOf(this.vista.txtCantidadPedido.getValue());
                    String precio = this.vista.txtPrecio.getText();

                    int stk = this.modelo.getStock(Integer.parseInt(id));
                    int cnt = Integer.parseInt(cantidad);

                    if (stk >= cnt && cnt > 0) {

                        int c = 0;

                        for (Articulo a : ListaPedido) {

                            if (Integer.parseInt(a.getID()) == Integer.parseInt(id)) {

                                c++;

                            }

                        }

                        if (c > 0) {

                            JOptionPane.showMessageDialog(vista, "Este artículo ya se encuentra en la lista. Eliminelo de la lista si desea cambiar la cantidad.");

                        } else {

                            ListaPedido.add(new Articulo(id, nombre, cantidad, precio));
                            this.vista.tablePedidoCarrito.setModel(this.modelo.getTabla(ListaPedido));

                        }

                    } else {

                        JOptionPane.showMessageDialog(vista, "Cantidad indicada incorrecta.");

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnModificarPedido://Modifica un pedido

                try {

                    String id = this.vista.txtIDPedido.getText();
                    String nombre = this.vista.txtNombreArticuloPedido.getText();
                    String cantidad = String.valueOf(this.vista.txtCantidadPedido.getValue());
                    String precio = this.vista.txtPrecio.getText();

                    if (this.vista.tablePedidoCarrito.getSelectedRow() < 0) {

                        JOptionPane.showMessageDialog(null, "Seleccione una fila");

                    } else {

                        fila = this.vista.tablePedidoCarrito.getSelectedRow();

                        int stk = this.modelo.getStock(Integer.parseInt(id));
                        int cnt = Integer.parseInt(cantidad);

                        if (stk >= cnt && cnt > 0) {

                            ListaPedido.set(fila, new Articulo(id, nombre, cantidad, precio));
                            this.vista.tablePedidoCarrito.setModel(this.modelo.getTabla(ListaPedido));

                        } else {

                            JOptionPane.showMessageDialog(vista, "Cantidad indicada incorrecta.");

                        }

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnBorrarPedido://Borra un pedido

                try {

                    this.vista.tablePedidoCarrito.getSelectedRow();

                    if (this.vista.tablePedidoCarrito.getSelectedRow() < 0) {
                        JOptionPane.showMessageDialog(null, "Seleccione una fila");

                    } else {

                        fila = this.vista.tablePedidoCarrito.getSelectedRow();
                        ListaPedido.remove(fila);
                        this.vista.tablePedidoCarrito.setModel(this.modelo.getTabla(ListaPedido));

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnCrearFactura://Crea la factura

                try {

                    this.vista.jPanelPedido.setVisible(true);
                    this.vista.dlgFactura.setVisible(true);
                    String dni = this.vista.txtDNIPedido.getText();
                    String nombre = this.vista.txtNombrePedido.getText();
                    String apellido = this.vista.txtApellidosPedido.getText();
                    String telefono = this.vista.txtTelefonoPedido.getText();
                    String tarjeta = this.vista.txtTarjetaPedido.getText();
                    String direccion = this.vista.txtDireccionPedido.getText();

                    for(;;){
                       precio_total +=(int) this.vista.tablePedidoCarrito.getValueAt(fila, 3);
                    }
                    
                    /*String id_pedido = String.valueOf( this.modelo.getID_Pedido(dni));
                    int id_factura = this.modelo.getFacturaIDf(id_pedido);
                    int fecha = this.modelo.getFacturaF(id_factura);
                    this.vista.txtFacturaDNI.setText(dni);
                    this.vista.txtFacturaNombre.setText(nombre);
                    this.vista.txtFacturaDireccion.setText(direccion);
                    this.vista.txtFacturaTarjeta.setText(tarjeta);
                    this.vista.txtFacturaFecha.setText(String.valueOf(fecha));
                    this.vista.txtFacturaApellidos.setText(apellido);
                    this.vista.txtFacturaTelefono.setText(telefono);
                    this.vista.txtFacturaPedido.setText(id_pedido));
                    this.vista.txtFacturaFactura.setText(String.valueOf(id_factura));
                    this.vista.txtFacturaTotal.setText(String.valueOf(precio_total));
                    this.vista.txtFacturaTotalIVA.setText(String.valueOf(precio_total*0.24));*/
                          
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnAñadirCliente://Añade un cliente

                try {

                    String dni = this.vista.txtDNICliente.getText();
                    String nombre = this.vista.txtNombreCliente.getText();
                    String apellidos = this.vista.txtApellidosCliente.getText();
                    String direccion = this.vista.txtDireccionCliente.getText();
                    long tarjeta = Long.parseLong(this.vista.txtTarjetaCliente.getText());
                    int telefono = Integer.parseInt(this.vista.txtTelefonoCliente.getText());
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

            case btnModificarCliente://Modifica un cliente

                try {

                    this.vista.tableClientes.getSelectedRow();
                    if (this.vista.tableClientes.getSelectedRow() < 0) {
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");

                    } else {

                        String dni = this.vista.txtDNICliente.getText();
                        String nombre = this.vista.txtNombreCliente.getText();
                        String apellidos = this.vista.txtApellidosCliente.getText();
                        String direccion = this.vista.txtDireccionCliente.getText();
                        int telefono = Integer.parseInt(this.vista.txtTelefonoCliente.getText());
                        long tarjeta = Long.parseLong(this.vista.txtTarjetaCliente.getText());

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

            case btnBorrarCliente://Borra un cliente

                try {

                    this.vista.tableClientes.getSelectedRow();
                    if (this.vista.tableClientes.getSelectedRow() < 0) {

                        JOptionPane.showMessageDialog(null, "Seleccione una fila");

                    } else {

                        fila = this.vista.tableClientes.getSelectedRow();
                        String dni = (String) this.vista.tableClientes.getValueAt(fila, 0);
                        this.modelo.EliminarClientes(dni);
                        this.vista.tableClientes.setModel(this.modelo.getTablaClientes());

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnAñadirPresupuesto://Añade un presupuesto

                try {

                    String id = this.vista.txtIDPresupuesto.getText();
                    String nombre = this.vista.txtNombreArticuloPresupuesto.getText();
                    String cantidad = String.valueOf(this.vista.txtCantidadPresupuesto.getValue());
                    String precio = this.vista.txtPrecioPresupuesto.getText();

                    int stk = this.modelo.getStock(Integer.parseInt(id));
                    int cnt = Integer.parseInt(cantidad);

                    if (stk >= cnt && cnt > 0) {

                        int c = 0;

                        for (Articulo a : ListaPresupuesto) {

                            if (Integer.parseInt(a.getID()) == Integer.parseInt(id)) {

                                c++;

                            }

                        }

                        if (c > 0) {

                            JOptionPane.showMessageDialog(vista, "Este artículo ya se encuentra en la lista. Eliminelo de la lista si desea cambiar la cantidad.");

                        } else {

                            ListaPresupuesto.add(new Articulo(id, nombre, cantidad, precio));
                            this.vista.tablePresupuestoCarrito.setModel(this.modelo.getTabla(ListaPresupuesto));

                        }

                    } else {

                        JOptionPane.showMessageDialog(vista, "Cantidad indicada incorrecta.");

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnModificarPresupuesto://Modifica un presupuesto

                try {

                    String id = this.vista.txtIDPresupuesto.getText();
                    String nombre = this.vista.txtNombreArticuloPresupuesto.getText();
                    String cantidad = String.valueOf(this.vista.txtCantidadPresupuesto.getValue());
                    String precio = this.vista.txtPrecioPresupuesto.getText();

                    if (this.vista.tablePresupuestoCarrito.getSelectedRow() < 0) {

                        JOptionPane.showMessageDialog(null, "Seleccione una fila");

                    } else {

                        fila = this.vista.tablePresupuestoCarrito.getSelectedRow();

                        int stk = this.modelo.getStock(Integer.parseInt(id));
                        int cnt = Integer.parseInt(cantidad);

                        if (stk >= cnt && cnt > 0) {

                            ListaPresupuesto.set(fila, new Articulo(id, nombre, cantidad, precio));
                            this.vista.tablePresupuestoCarrito.setModel(this.modelo.getTabla(ListaPresupuesto));

                        } else {

                            JOptionPane.showMessageDialog(vista, "Cantidad indicada incorrecta.");

                        }

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnBorrarPresupuesto://Borra un presupuesto

                try {

                    this.vista.tablePresupuestoCarrito.getSelectedRow();

                    if (this.vista.tablePresupuestoCarrito.getSelectedRow() < 0) {
                        JOptionPane.showMessageDialog(null, "Seleccione una fila");

                    } else {

                        fila = this.vista.tablePresupuestoCarrito.getSelectedRow();
                        ListaPresupuesto.remove(fila);
                        this.vista.tablePresupuestoCarrito.setModel(this.modelo.getTabla(ListaPresupuesto));

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnAñadirAlmacen://Insertas Articulos

                Calendar c = new GregorianCalendar();
                try {

                    String nombre = this.vista.txtNombreAlmacen.getText();
                    int stock = Integer.parseInt(this.vista.txtStockAlmacen.getText());
                    double precio = Double.parseDouble(this.vista.txtPrecioAlmacen.getText());
                    double precioT = Double.parseDouble(this.vista.txtPrecioAlmacen.getText()) * 0.85;
                    precioT = precioT * stock;
                    String nif = this.vista.txtNIFAlmacen.getText();
                    String dia = Integer.toString(c.get(Calendar.DATE));
                    String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
                    String annio = Integer.toString(c.get(Calendar.YEAR));
                    String fecha = dia + "/" + mes + "/" + annio;

                    int iva = Integer.parseInt(String.valueOf(this.vista.txtIVAAlmacen.getValue()));

                    if (iva <= 0 || precio <= 0 || stock < 0) {
                        JOptionPane.showMessageDialog(vista, "La cantidad es incorrecta");
                    } else {

                        this.modelo.InsertarArticulo(nombre, stock, precio, nif, iva);
                        int id = this.modelo.getIdArticulo(nombre);
                        this.modelo.InsertarPago(nif, id, stock, precioT, fecha);
                        this.vista.tablaArticulosAlmacen.setModel(this.modelo.getTablaAlmacen());
                        this.vista.txtIDAlmacen.setText("");
                        this.vista.txtNombreAlmacen.setText("");
                        this.vista.txtStockAlmacen.setText("");
                        this.vista.txtPrecioAlmacen.setText("");
                        this.vista.txtNIFAlmacen.setText("");
                        this.vista.txtIVAAlmacen.setValue(0);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnModificarAlmacen://Modifica un Artículo

                try {

                    this.vista.tablaArticulosAlmacen.getSelectedRow();
                    if (this.vista.tablaArticulosAlmacen.getSelectedRow() < 0) {
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");

                    } else {

                        String id = this.vista.txtIDAlmacen.getText();
                        String nombre = this.vista.txtNombreAlmacen.getText();
                        int stock = Integer.parseInt(this.vista.txtStockAlmacen.getText());
                        double precio = Double.parseDouble(this.vista.txtPrecioAlmacen.getText());
                        String nif = this.vista.txtNIFAlmacen.getText();
                        int iva = Integer.parseInt(String.valueOf(this.vista.txtIVAAlmacen.getValue()));
                        this.modelo.modificarArticulo(id, nombre, stock, precio, nif, iva);
                        this.vista.tablaArticulosAlmacen.setModel(this.modelo.getTablaAlmacen());
                        this.vista.txtIDAlmacen.setText("");
                        this.vista.txtNombreAlmacen.setText("");
                        this.vista.txtStockAlmacen.setText("");
                        this.vista.txtPrecioAlmacen.setText("");
                        this.vista.txtNIFAlmacen.setText("");
                        this.vista.txtIVAAlmacen.setValue(0);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
        }
    }

    //----------------------Permite la selección de elementos dentro de tablas---------------------------
    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vista.tableClientes.getSelectedRow();
        String dni = (String) this.vista.tableClientes.getValueAt(fila, 0);
        String nombre = (String) this.vista.tableClientes.getValueAt(fila, 1);
        String apellidos = (String) this.vista.tableClientes.getValueAt(fila, 2);
        String direccion = (String) this.vista.tableClientes.getValueAt(fila, 3);
        String telefono = (String) this.vista.tableClientes.getValueAt(fila, 4);
        String tarjeta = (String) this.vista.tableClientes.getValueAt(fila, 5);

        this.vista.txtDNICliente.setText(dni);
        this.vista.txtNombreCliente.setText(nombre);
        this.vista.txtApellidosCliente.setText(apellidos);
        this.vista.txtDireccionCliente.setText(direccion);
        this.vista.txtTelefonoCliente.setText(telefono);
        this.vista.txtTarjetaCliente.setText(tarjeta);

    }

    private void tablePedidoBuscarArticuloMouseClicked(java.awt.event.MouseEvent evt) {

        fila1 = this.vista.tablePedidoBuscarArticulo.getSelectedRow();
        String id = (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila1, 0);
        String nombre = (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila1, 1);
        String cantidad = (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila1, 2);
        String precio = (String) this.vista.tablePedidoBuscarArticulo.getValueAt(fila1, 3);

        this.vista.txtIDPedido.setText(id);
        this.vista.txtNombreArticuloPedido.setText(nombre);
        this.vista.txtPrecio.setText(precio);

    }

    private void tablePedidoCarritoMouseClicked(java.awt.event.MouseEvent evt) {

        fila1 = this.vista.tablePedidoCarrito.getSelectedRow();
        String id = (String) this.vista.tablePedidoCarrito.getValueAt(fila1, 0);
        String nombre = (String) this.vista.tablePedidoCarrito.getValueAt(fila1, 1);
        String cantidad = (String) this.vista.tablePedidoCarrito.getValueAt(fila1, 2);
        String precio = (String) this.vista.tablePedidoCarrito.getValueAt(fila1, 3);

        this.vista.txtIDPedido.setText(id);
        this.vista.txtNombreArticuloPedido.setText(nombre);
        this.vista.txtPrecio.setText(precio);

    }

    private void tablePresupuestoBuscarArticuloMouseClicked(java.awt.event.MouseEvent evt) {

        fila1 = this.vista.tablePresuspuestoBuscarArticulo.getSelectedRow();
        String id = (String) this.vista.tablePresuspuestoBuscarArticulo.getValueAt(fila1, 0);
        String nombre = (String) this.vista.tablePresuspuestoBuscarArticulo.getValueAt(fila1, 1);
        String cantidad = (String) this.vista.tablePresuspuestoBuscarArticulo.getValueAt(fila1, 2);
        String precio = (String) this.vista.tablePresuspuestoBuscarArticulo.getValueAt(fila1, 3);

        this.vista.txtIDPresupuesto.setText(id);
        this.vista.txtNombreArticuloPresupuesto.setText(nombre);
        this.vista.txtPrecioPresupuesto.setText(precio);

    }

    private void tablePresupuestoCarritoMouseClicked(java.awt.event.MouseEvent evt) {

        fila1 = this.vista.tablePresupuestoCarrito.getSelectedRow();
        String id = (String) this.vista.tablePresupuestoCarrito.getValueAt(fila1, 0);
        String nombre = (String) this.vista.tablePresupuestoCarrito.getValueAt(fila1, 1);
        String cantidad = (String) this.vista.tablePresupuestoCarrito.getValueAt(fila1, 2);
        String precio = (String) this.vista.tablePresupuestoCarrito.getValueAt(fila1, 3);

        this.vista.txtIDPresupuesto.setText(id);
        this.vista.txtNombreArticuloPresupuesto.setText(nombre);
        this.vista.txtPrecioPresupuesto.setText(precio);

    }

    private void tablaArticulosAlmacenMouseClicked(java.awt.event.MouseEvent evt) {

        fila1 = this.vista.tablaArticulosAlmacen.getSelectedRow();
        String id = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila1, 0);
        String nombre = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila1, 1);
        String stock = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila1, 2);
        String precio = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila1, 3);
        String nif = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila1, 4);
        String iva = (String) this.vista.tablaArticulosAlmacen.getValueAt(fila1, 5);

        this.vista.txtIDAlmacen.setText(id);
        this.vista.txtNombreAlmacen.setText(nombre);
        this.vista.txtStockAlmacen.setText(stock);
        this.vista.txtPrecioAlmacen.setText(precio);
        this.vista.txtNIFAlmacen.setText(nif);
        this.vista.txtIVAAlmacen.setValue(0);

    }
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

    //------------------------Metodos Buscar--------------------------------
    private void Buscar(java.awt.event.KeyEvent evt) {//Busca Artículos
        String buscar = this.vista.txtBuscadorArticulos.getText();
        this.vista.tablePedidoBuscarArticulo.setModel(this.modelo.buscarArticulo(buscar));
    }

    private void BuscarPresupuesto(java.awt.event.KeyEvent evt) {//Busca presupuesto           
        String buscar = this.vista.txtBuscadorPresupuesto.getText();
        this.vista.tablePresuspuestoBuscarArticulo.setModel(this.modelo.buscarArticulo(buscar));
    }

    private void BuscarClientes(java.awt.event.KeyEvent evt) {//Busca Clientes            
        String buscar = this.vista.txtBuscadorClientes.getText();
        this.vista.tableClientes.setModel(this.modelo.buscarCliente(buscar));
    }

    //--------Rellena los Textfield con información del cliente en función al DNI------------ 
    private void DNIPedido(java.awt.event.KeyEvent evt) {
        String dni = this.vista.txtDNIPedido.getText();
        String[] Relleno = this.modelo.Rellenar(dni);
        this.vista.txtNombrePedido.setText(Relleno[0]);
        this.vista.txtApellidosPedido.setText(Relleno[1]);
        this.vista.txtDireccionPedido.setText(Relleno[2]);
        this.vista.txtTarjetaPedido.setText(Relleno[3]);
        this.vista.txtTelefonoPedido.setText(Relleno[4]);

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
