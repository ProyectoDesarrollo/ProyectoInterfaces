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
        jPanelPresupuesto = new javax.swing.JPanel();
        pDatosClientes = new javax.swing.JPanel();
        txtDNIPr = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombrePr = new javax.swing.JTextField();
        txtApellidosPr = new javax.swing.JTextField();
        txtDireccionPr = new javax.swing.JTextField();
        txtTelefonoPr = new javax.swing.JTextField();
        txtTarjetaPr = new javax.swing.JTextField();
        pDatosPresupuestos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAñadirPr = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreArticuloPr = new javax.swing.JTextField();
        txtIDPr = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidadPr = new javax.swing.JSpinner();
        jPanelBusArticulo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDiaPr = new javax.swing.JTextField();
        txtMesPr = new javax.swing.JTextField();
        txtAnioPr = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        jPanelPedido = new javax.swing.JPanel();
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

        pDatosClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos clientes"));

        try {
            txtDNIPr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDNIPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIPrActionPerformed(evt);
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

        txtNombrePr.setEnabled(false);

        txtApellidosPr.setEnabled(false);

        txtDireccionPr.setEnabled(false);

        txtTelefonoPr.setEnabled(false);

        txtTarjetaPr.setEnabled(false);

        javax.swing.GroupLayout pDatosClientesLayout = new javax.swing.GroupLayout(pDatosClientes);
        pDatosClientes.setLayout(pDatosClientesLayout);
        pDatosClientesLayout.setHorizontalGroup(
            pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosClientesLayout.createSequentialGroup()
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosClientesLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtApellidosPr))
                    .addGroup(pDatosClientesLayout.createSequentialGroup()
                        .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatosClientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDNIPr, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNombrePr))))
                .addGap(18, 18, 18)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTarjetaPr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccionPr)
                    .addComponent(txtTelefonoPr, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pDatosClientesLayout.setVerticalGroup(
            pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNIPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccionPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtNombrePr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(txtApellidosPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTarjetaPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pDatosPresupuestos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Presupuesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

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

        btnAñadirPr.setText("Añadir Articulo");

        jLabel10.setText("Nombre Articulo: ");

        jLabel11.setText("ID :");

        txtNombreArticuloPr.setEnabled(false);

        txtIDPr.setEnabled(false);

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

        javax.swing.GroupLayout jPanelBusArticuloLayout = new javax.swing.GroupLayout(jPanelBusArticulo);
        jPanelBusArticulo.setLayout(jPanelBusArticuloLayout);
        jPanelBusArticuloLayout.setHorizontalGroup(
            jPanelBusArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelBusArticuloLayout.setVerticalGroup(
            jPanelBusArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusArticuloLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setText("Fecha :");

        jButton1.setText("Borrar Articulo");

        jButton2.setText("Buscar Articulo");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagines/calendario.jpg"))); // NOI18N

        jLabel14.setText("/");

        jLabel15.setText("/");

        javax.swing.GroupLayout pDatosPresupuestosLayout = new javax.swing.GroupLayout(pDatosPresupuestos);
        pDatosPresupuestos.setLayout(pDatosPresupuestosLayout);
        pDatosPresupuestosLayout.setHorizontalGroup(
            pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
            .addGroup(pDatosPresupuestosLayout.createSequentialGroup()
                .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosPresupuestosLayout.createSequentialGroup()
                        .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pDatosPresupuestosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDPr, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(34, 34, 34)
                                .addComponent(txtCantidadPr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDatosPresupuestosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreArticuloPr, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(pDatosPresupuestosLayout.createSequentialGroup()
                        .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDatosPresupuestosLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaPr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMesPr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnioPr, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127)))
                .addComponent(jPanelBusArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pDatosPresupuestosLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAñadirPr, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pDatosPresupuestosLayout.setVerticalGroup(
            pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosPresupuestosLayout.createSequentialGroup()
                .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosPresupuestosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtCantidadPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtNombreArticuloPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtDiaPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMesPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAnioPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelBusArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pDatosPresupuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAñadirPr)))
        );

        javax.swing.GroupLayout jPanelPresupuestoLayout = new javax.swing.GroupLayout(jPanelPresupuesto);
        jPanelPresupuesto.setLayout(jPanelPresupuestoLayout);
        jPanelPresupuestoLayout.setHorizontalGroup(
            jPanelPresupuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPresupuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPresupuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDatosPresupuestos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPresupuestoLayout.setVerticalGroup(
            jPanelPresupuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresupuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pDatosPresupuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

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

        jPanelPedido.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanelPedidoLayout = new javax.swing.GroupLayout(jPanelPedido);
        jPanelPedido.setLayout(jPanelPedidoLayout);
        jPanelPedidoLayout.setHorizontalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelPedidoLayout.setVerticalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 630));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIPrActionPerformed

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
    private javax.swing.JButton btnAñadirPr;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnCobros;
    public javax.swing.JButton btnFactura;
    public javax.swing.JButton btnPagos;
    public javax.swing.JButton btnPedido;
    public javax.swing.JButton btnPresupuestos;
    public javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanelBusArticulo;
    public javax.swing.JPanel jPanelClientes;
    public javax.swing.JPanel jPanelCobros;
    public javax.swing.JPanel jPanelFactura;
    public javax.swing.JPanel jPanelPagos;
    public javax.swing.JPanel jPanelPedido;
    public javax.swing.JPanel jPanelPresupuesto;
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
    private javax.swing.JPanel pDatosPresupuestos;
    private javax.swing.JTextField txtAnioPr;
    private javax.swing.JTextField txtApellidosPr;
    private javax.swing.JSpinner txtCantidadPr;
    private javax.swing.JFormattedTextField txtDNIPr;
    private javax.swing.JTextField txtDiaPr;
    private javax.swing.JTextField txtDireccionPr;
    private javax.swing.JTextField txtIDPr;
    private javax.swing.JTextField txtMesPr;
    private javax.swing.JTextField txtNombreArticuloPr;
    private javax.swing.JTextField txtNombrePr;
    private javax.swing.JTextField txtTarjetaPr;
    private javax.swing.JTextField txtTelefonoPr;
    // End of variables declaration//GEN-END:variables
}
