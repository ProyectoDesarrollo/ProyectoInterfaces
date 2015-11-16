
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Interface;


public class ControladorInicio implements ActionListener,MouseListener{

    Interface vista;
    
    public enum AccionMVC{
        btnPresupuestos,
        btnPedido,
        btnClientes,
        btnFactura,
        btnCobros,
        btnArticulosP,
        btnPagos,
        btnProveedores,
        btnArticulos,
        btnSalir
     
    }
    
    public ControladorInicio(Interface vista){
        this.vista=vista;
    }
    
    public void iniciar(){
        try {
            this.vista.setVisible(true);
            this.vista.jPanelPrincipal.setVisible(true);
            this.vista.jPanelPresupuesto.setVisible(false);
            this.vista.jPanelPedido.setVisible(false);
            this.vista.jPanelClientes.setVisible(false);
            this.vista.jPanelFactura.setVisible(false);
            this.vista.jPanelCobros.setVisible(false);
            this.vista.jPanelArticulosP.setVisible(false);
            this.vista.jPanelPagos.setVisible(false);
            this.vista.jPanelProveedores.setVisible(false);
            this.vista.jPanelArticulos.setVisible(false);
            
        } catch (Exception e) {
        }
        
        this.vista.btnPresupuestos.setActionCommand( "btnPresupuestos" );
        this.vista.btnPresupuestos.addActionListener(this);
        
        this.vista.btnPedido.setActionCommand( "btnPedido" );
        this.vista.btnPedido.addActionListener(this);
        
        this.vista.btnClientes.setActionCommand( "btnClientes" );
        this.vista.btnClientes.addActionListener(this);
        
        this.vista.btnFactura.setActionCommand( "btnFactura" );
        this.vista.btnFactura.addActionListener(this);
        
        this.vista.btnCobros.setActionCommand( "btnCobros" );
        this.vista.btnCobros.addActionListener(this);
        
        this.vista.btnArticulosP.setActionCommand( "btnArticulosP" );
        this.vista.btnArticulosP.addActionListener(this);
        
        this.vista.btnPagos.setActionCommand( "btnPagos" );
        this.vista.btnPagos.addActionListener(this);
        
        this.vista.btnProveedores.setActionCommand( "btnProveedores" );
        this.vista.btnProveedores.addActionListener(this);
        
        this.vista.btnArticulos.setActionCommand( "btnArticulos" );
        this.vista.btnArticulos.addActionListener(this);
        
        this.vista.btnSalir.setActionCommand( "btnSalir" );
        this.vista.btnSalir.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())) {
            
            case btnPresupuestos:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(true);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
                
            case btnPedido:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(true);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
                
            case btnClientes:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(true);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
                
            case btnFactura:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(true);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
            
            case btnCobros:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(true);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
            
            case btnArticulosP:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(true);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
            
            case btnPagos:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(true);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
            
            case btnProveedores:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(true);
                    this.vista.jPanelArticulos.setVisible(false);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                break;
                
            case btnArticulos:
                
                try {                   
 
                    this.vista.jPanelPrincipal.setVisible(false);
                    this.vista.jPanelPresupuesto.setVisible(false);
                    this.vista.jPanelPedido.setVisible(false);
                    this.vista.jPanelClientes.setVisible(false);
                    this.vista.jPanelFactura.setVisible(false);
                    this.vista.jPanelCobros.setVisible(false);
                    this.vista.jPanelArticulosP.setVisible(false);
                    this.vista.jPanelPagos.setVisible(false);
                    this.vista.jPanelProveedores.setVisible(false);
                    this.vista.jPanelArticulos.setVisible(true);
                    
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

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
}
