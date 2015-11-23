package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloCompras extends DatabaseSQLite {

    public ModeloCompras() {
    }
    /*--------------------TABLAS--------------------*/
    
    /*-----COMPRAS-----*/
    public DefaultTableModel getTablaProveedores() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        //String nif, String nombre , String apellidos, int telefono
        String[] columNames = {"NIF", "Nombre", "Apellidos", "Telefono"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as Total FROM Proveedores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][4];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NIF, Nombre, Apellidos, Telefono FROM Proveedores");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("NIF");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Telefono");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    /*-----ALMACEN-----*/
    public DefaultTableModel getTablaPedido() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"ID", "DNI_Cliente", "FECHA"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as Total FROM Pedidos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID, DNI_Cliente, FECHA FROM Pedidos");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("DNI_Cliente");
                data[i][2] = res.getString("FECHA");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    
    public DefaultTableModel getTablaFactura() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"ID", "ID_Pedido", "Precio_Total"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as Total FROM Facturas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID, ID_Pedido, Precio_Total FROM Facturas");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("ID_Pedido");
                data[i][2] = res.getString("Precio_Total");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    
    /*--------------------INSERT--------------------*/
    public boolean InsertarProveedores (String nif, String nombre , String apellidos, int telefono) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Proveedores ( Nif ,Nombre ,Apellidos ,Telefono ) "
                    + "VALUES ( '" + nif + "','" + nombre + "', '" + apellidos + "', " + telefono + " ) ";
            //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
            return false;      
    }
    
    /*--------------------DELETED--------------------*/
     public boolean EliminarProveedores( String nif ){
         boolean res=false;
        //se arma la consulta
        String q = " DELETE FROM Proveedores WHERE  NIF='" + nif + "' " ;
        //se ejecuta la consulta
         try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res=true;
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return res;
    }
    /*--------------------UPDATE--------------------*/
      public void modificarProveedor (String nif, String nombre , String apellidos, int telefono) {
        
        String q="Update Proveedores set Nombre='"+nombre+"', Apellidos='"+apellidos+"', Telefono='"+telefono+"' where NIF='"+nif+"';";
        
        try {
            
            //Se mete en la base de datos
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
            pstm1.execute();
            pstm1.close();            

        }catch(SQLException e){
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }  
    }
    
}
