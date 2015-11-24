package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.ModeloVentas;
import vista.Interface;

public class ControladorInicio implements ActionListener, MouseListener {

    Interface vista;
    ModeloVentas modelo;
    ControladorCompras controladorCompras;
    ControladorVentas controladorVentas;

    public enum AccionMVC {

        btnPresupuestos,
        btnPedido,
        btnClientes,
        btnPagos,
        btnProveedores,
        btnArticulos,
        btnSalir,
        btnVisualizar

    }

    public ControladorInicio(Interface vista) {
        
        modelo = new ModeloVentas();
        this.vista = vista;
    }

    public void iniciar() {
        try {

            controladorVentas = new ControladorVentas(vista);
            controladorVentas.iniciar();
            controladorCompras = new ControladorCompras(vista);
            controladorCompras.iniciar();

            this.vista.setVisible(true);
            this.vista.jPanelPresupuestos.setVisible(false);
            this.vista.jPanelPedido.setVisible(false);
            this.vista.jPanelClientes.setVisible(false);
            this.vista.jPanelVisualizar.setVisible(false);
            this.vista.jPanelPagos.setVisible(false);
            this.vista.jPanelProveedores.setVisible(false);
            this.vista.jPanelArticulos.setVisible(false);
            this.vista.jPanelVisualizar.setVisible(false);
            this.vista.pPanelVisualizarPedido.setVisible(false);
            this.vista.pPanelVisualizarInicial.setVisible(false);
            this.vista.pPanelVisualizarFactura.setVisible(false);

        } catch (Exception e) {
        }

        this.vista.btnPresupuestos.setActionCommand("btnPresupuestos");
        this.vista.btnPresupuestos.addActionListener(this);

        this.vista.btnPedido.setActionCommand("btnPedido");
        this.vista.btnPedido.addActionListener(this);

        this.vista.btnClientes.setActionCommand("btnClientes");
        this.vista.btnClientes.addActionListener(this);

        this.vista.btnPagos.setActionCommand("btnPagos");
        this.vista.btnPagos.addActionListener(this);

        this.vista.btnProveedores.setActionCommand("btnProveedores");
        this.vista.btnProveedores.addActionListener(this);

        this.vista.btnArticulos.setActionCommand("btnArticulos");
        this.vista.btnArticulos.addActionListener(this);

        this.vista.btnSalir.setActionCommand("btnSalir");
        this.vista.btnSalir.addActionListener(this);

        this.vista.btnVisualizar.setActionCommand("btnVisualizar");
        this.vista.btnVisualizar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())) {

            case btnPresupuestos:

                try {

                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuestos.setVisible(true);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.pPanelVisualizarPedido.setVisible(false);
                    this.vista.pPanelVisualizarInicial.setVisible(false);
                    this.vista.pPanelVisualizarFactura.setVisible(false);
                    
                    this.vista.tablePresuspuestoBuscarArticulo.setModel(this.modelo.getTablaArticulos());
                    

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnPedido:

                try {

                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuestos.setVisible(false);
                    this.vista.jPanelPedido.setVisible(true);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.pPanelVisualizarPedido.setVisible(false);
                    this.vista.pPanelVisualizarInicial.setVisible(false);
                    this.vista.pPanelVisualizarFactura.setVisible(false);
                    this.vista.tablePedidoBuscarArticulo.setModel(this.modelo.getTablaArticulos());
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnClientes:

                try {

                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuestos.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(true);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.pPanelVisualizarPedido.setVisible(false);
                    this.vista.pPanelVisualizarInicial.setVisible(false);
                    this.vista.pPanelVisualizarFactura.setVisible(false);
                    this.vista.tableClientes.setModel(this.modelo.getTablaClientes());

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnPagos:

                try {

                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuestos.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.jPanelPagos.setVisible(true);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.pPanelVisualizarPedido.setVisible(false);
                    this.vista.pPanelVisualizarInicial.setVisible(false);
                    this.vista.pPanelVisualizarFactura.setVisible(false);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnProveedores:

                try {

                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuestos.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(true);
                    this.vista.jPanelArticulos.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.pPanelVisualizarPedido.setVisible(false);
                    this.vista.pPanelVisualizarInicial.setVisible(false);
                    this.vista.pPanelVisualizarFactura.setVisible(false);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;

            case btnArticulos:

                try {

                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuestos.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(true);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.pPanelVisualizarPedido.setVisible(false);
                    this.vista.pPanelVisualizarInicial.setVisible(false);
                    this.vista.pPanelVisualizarFactura.setVisible(false);
                    this.vista.tablaArticulosAlmacen.setModel(this.modelo.getTablaAlmacen());
                    

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
            case btnVisualizar:

                try {

                    this.vista.jComboVisualizar.setSelectedIndex(0);
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuestos.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    this.vista.jPanelVisualizar.setVisible(true);
                    this.vista.pPanelVisualizarPedido.setVisible(false);
                    this.vista.pPanelVisualizarInicial.setVisible(true);
                    this.vista.pPanelVisualizarFactura.setVisible(false);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
            case btnSalir:

                try {

                    this.vista.dispose();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
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
