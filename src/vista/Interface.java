/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author usuario
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelPedido = new javax.swing.JPanel();
        pDatosClientes = new javax.swing.JPanel();
        txtDNI_Pedido = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre_Pedido = new javax.swing.JTextField();
        txtApellidos_Pedido = new javax.swing.JTextField();
        txtDireccion_Pedido = new javax.swing.JTextField();
        txtTelefono_Pedido = new javax.swing.JTextField();
        txtTarjeta_Pedido = new javax.swing.JTextField();
        pDatosPedido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAñadir_Pedido = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre_Articulo_Pedido = new javax.swing.JTextField();
        txtID_Pedido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad_Pedido = new javax.swing.JSpinner();
        jPanelBuscar_Articulo_Pedido = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnBorrar_Pedido = new javax.swing.JButton();
        btnBuscar_Pedido = new javax.swing.JButton();
        btnCalendario_Pedido = new javax.swing.JButton();
        txtDia_Pedido = new javax.swing.JTextField();
        txtMes_Pedido = new javax.swing.JTextField();
        txtAnio_Pedido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnModificar_Pedido = new javax.swing.JButton();
        jPanelClientes = new javax.swing.JPanel();
        jPanelFactura = new javax.swing.JPanel();
        jPanelCobros = new javax.swing.JPanel();
        jPanelArticulosP = new javax.swing.JPanel();
        jPanelPagos = new javax.swing.JPanel();
        jPanelProveedores = new javax.swing.JPanel();
        jPanelArticulos = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPresupuestos = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnCobros = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnArticulosP = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnArticulos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelPresupuestos = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pDatosClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        try {
            txtDNI_Pedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDNI_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNI_PedidoActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DNI:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Apellidos:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dirección:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Telefono:");

        jLabel9.setText("Nº Tarjeta:");

        txtNombre_Pedido.setEnabled(false);

        txtApellidos_Pedido.setEnabled(false);

        txtDireccion_Pedido.setEnabled(false);

        txtTelefono_Pedido.setEnabled(false);

        txtTarjeta_Pedido.setEnabled(false);

        javax.swing.GroupLayout pDatosClientesLayout = new javax.swing.GroupLayout(pDatosClientes);
        pDatosClientes.setLayout(pDatosClientesLayout);
        pDatosClientesLayout.setHorizontalGroup(
            pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosClientesLayout.createSequentialGroup()
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosClientesLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtApellidos_Pedido))
                    .addGroup(pDatosClientesLayout.createSequentialGroup()
                        .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatosClientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDNI_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNombre_Pedido))))
                .addGap(18, 18, 18)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTarjeta_Pedido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccion_Pedido)
                    .addComponent(txtTelefono_Pedido, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pDatosClientesLayout.setVerticalGroup(
            pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(txtApellidos_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTarjeta_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pDatosPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAñadir_Pedido.setText("Añadir Articulo");

        jLabel10.setText("Nombre Articulo: ");

        jLabel11.setText("ID :");

        txtNombre_Articulo_Pedido.setEnabled(false);

        txtID_Pedido.setEnabled(false);

        jLabel12.setText("Cantidad :");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanelBuscar_Articulo_PedidoLayout = new javax.swing.GroupLayout(jPanelBuscar_Articulo_Pedido);
        jPanelBuscar_Articulo_Pedido.setLayout(jPanelBuscar_Articulo_PedidoLayout);
        jPanelBuscar_Articulo_PedidoLayout.setHorizontalGroup(
            jPanelBuscar_Articulo_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelBuscar_Articulo_PedidoLayout.setVerticalGroup(
            jPanelBuscar_Articulo_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscar_Articulo_PedidoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setText("Fecha :");

        btnBorrar_Pedido.setText("Borrar Articulo");

        btnBuscar_Pedido.setText("Buscar Articulo");

        btnCalendario_Pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagines/calendario.jpg"))); // NOI18N

        jLabel14.setText("/");

        jLabel15.setText("/");

        btnModificar_Pedido.setText("Modificar Articulo");

        javax.swing.GroupLayout pDatosPedidoLayout = new javax.swing.GroupLayout(pDatosPedido);
        pDatosPedido.setLayout(pDatosPedidoLayout);
        pDatosPedidoLayout.setHorizontalGroup(
            pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
            .addGroup(pDatosPedidoLayout.createSequentialGroup()
                .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosPedidoLayout.createSequentialGroup()
                        .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pDatosPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtID_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(34, 34, 34)
                                .addComponent(txtCantidad_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDatosPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre_Articulo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(pDatosPedidoLayout.createSequentialGroup()
                        .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDatosPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDia_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalendario_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127)))
                .addComponent(jPanelBuscar_Articulo_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pDatosPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAñadir_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pDatosPedidoLayout.setVerticalGroup(
            pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosPedidoLayout.createSequentialGroup()
                .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosPedidoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtCantidad_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtNombre_Articulo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtDia_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMes_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAnio_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addComponent(btnCalendario_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnBuscar_Pedido)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelBuscar_Articulo_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar_Pedido)
                    .addComponent(btnAñadir_Pedido)
                    .addComponent(btnModificar_Pedido)))
        );

        javax.swing.GroupLayout jPanelPedidoLayout = new javax.swing.GroupLayout(jPanelPedido);
        jPanelPedido.setLayout(jPanelPedidoLayout);
        jPanelPedidoLayout.setHorizontalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDatosPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPedidoLayout.setVerticalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pDatosPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelClientes.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelFactura.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelFacturaLayout = new javax.swing.GroupLayout(jPanelFactura);
        jPanelFactura.setLayout(jPanelFacturaLayout);
        jPanelFacturaLayout.setHorizontalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelFacturaLayout.setVerticalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelCobros.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelCobrosLayout = new javax.swing.GroupLayout(jPanelCobros);
        jPanelCobros.setLayout(jPanelCobrosLayout);
        jPanelCobrosLayout.setHorizontalGroup(
            jPanelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelCobrosLayout.setVerticalGroup(
            jPanelCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelArticulosP.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelArticulosPLayout = new javax.swing.GroupLayout(jPanelArticulosP);
        jPanelArticulosP.setLayout(jPanelArticulosPLayout);
        jPanelArticulosPLayout.setHorizontalGroup(
            jPanelArticulosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelArticulosPLayout.setVerticalGroup(
            jPanelArticulosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelArticulosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelPagos.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelPagosLayout = new javax.swing.GroupLayout(jPanelPagos);
        jPanelPagos.setLayout(jPanelPagosLayout);
        jPanelPagosLayout.setHorizontalGroup(
            jPanelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelPagosLayout.setVerticalGroup(
            jPanelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelProveedores.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelProveedoresLayout = new javax.swing.GroupLayout(jPanelProveedores);
        jPanelProveedores.setLayout(jPanelProveedoresLayout);
        jPanelProveedoresLayout.setHorizontalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelProveedoresLayout.setVerticalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelArticulos.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelArticulosLayout = new javax.swing.GroupLayout(jPanelArticulos);
        jPanelArticulos.setLayout(jPanelArticulosLayout);
        jPanelArticulosLayout.setHorizontalGroup(
            jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelArticulosLayout.setVerticalGroup(
            jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelBotones.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ventas");
        jLabel1.setOpaque(true);
        jPanelBotones.add(jLabel1);

        btnPresupuestos.setText("Presupuesto");
        jPanelBotones.add(btnPresupuestos);

        btnPedido.setText("Pedido");
        jPanelBotones.add(btnPedido);

        btnClientes.setText("Clientes");
        jPanelBotones.add(btnClientes);

        btnFactura.setText("Factura");
        jPanelBotones.add(btnFactura);

        btnCobros.setText("Cobros");
        jPanelBotones.add(btnCobros);

        jSeparator3.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(20, 10));
        jPanelBotones.add(jSeparator3);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Compras");
        jLabel2.setOpaque(true);
        jPanelBotones.add(jLabel2);

        btnArticulosP.setText("Artículos Proveedores");
        jPanelBotones.add(btnArticulosP);

        btnPagos.setText("Pagos");
        jPanelBotones.add(btnPagos);

        btnProveedores.setText("Proveedores");
        jPanelBotones.add(btnProveedores);
        jPanelBotones.add(jSeparator2);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Almacen");
        jLabel3.setOpaque(true);
        jPanelBotones.add(jLabel3);

        btnArticulos.setText("Artículos");
        jPanelBotones.add(btnArticulos);
        jPanelBotones.add(jSeparator1);

        btnSalir.setText("Salir");
        jPanelBotones.add(btnSalir);

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 630));

        jPanelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(600, 650));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jPanelPresupuestos.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanelPresupuestosLayout = new javax.swing.GroupLayout(jPanelPresupuestos);
        jPanelPresupuestos.setLayout(jPanelPresupuestosLayout);
        jPanelPresupuestosLayout.setHorizontalGroup(
            jPanelPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelPresupuestosLayout.setVerticalGroup(
            jPanelPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPresupuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNI_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNI_PedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNI_PedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnArticulos;
    public javax.swing.JButton btnArticulosP;
    private javax.swing.JButton btnAñadir_Pedido;
    private javax.swing.JButton btnBorrar_Pedido;
    private javax.swing.JButton btnBuscar_Pedido;
    private javax.swing.JButton btnCalendario_Pedido;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnCobros;
    public javax.swing.JButton btnFactura;
    private javax.swing.JButton btnModificar_Pedido;
    public javax.swing.JButton btnPagos;
    public javax.swing.JButton btnPedido;
    public javax.swing.JButton btnPresupuestos;
    public javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelArticulos;
    public javax.swing.JPanel jPanelArticulosP;
    public javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBuscar_Articulo_Pedido;
    public javax.swing.JPanel jPanelClientes;
    public javax.swing.JPanel jPanelCobros;
    public javax.swing.JPanel jPanelFactura;
    public javax.swing.JPanel jPanelPagos;
    public javax.swing.JPanel jPanelPedido;
    public javax.swing.JPanel jPanelPresupuestos;
    public javax.swing.JPanel jPanelPrincipal;
    public javax.swing.JPanel jPanelProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pDatosClientes;
    private javax.swing.JPanel pDatosPedido;
    private javax.swing.JTextField txtAnio_Pedido;
    private javax.swing.JTextField txtApellidos_Pedido;
    private javax.swing.JSpinner txtCantidad_Pedido;
    private javax.swing.JFormattedTextField txtDNI_Pedido;
    private javax.swing.JTextField txtDia_Pedido;
    private javax.swing.JTextField txtDireccion_Pedido;
    private javax.swing.JTextField txtID_Pedido;
    private javax.swing.JTextField txtMes_Pedido;
    private javax.swing.JTextField txtNombre_Articulo_Pedido;
    private javax.swing.JTextField txtNombre_Pedido;
    private javax.swing.JTextField txtTarjeta_Pedido;
    private javax.swing.JTextField txtTelefono_Pedido;
    // End of variables declaration//GEN-END:variables
}
