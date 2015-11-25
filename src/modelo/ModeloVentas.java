package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloVentas extends DatabaseSQLite{
    
    
    public ModeloVentas() {}
    
    public DefaultTableModel getTabla(ArrayList <Articulo> d) {
    
        DefaultTableModel tableModel = new DefaultTableModel () {
            
            @Override
            public boolean isCellEditable (int row, int column) {
                
                return false;
                
            }
            
        };
        
        String[] columNames = {"ID", "Nombre", "Cantidad", "Precio"};
        Object[][] data = new String[d.size()][4];
        
        try {
            
            int i = 0;
            
            for (Articulo a: d) {
                
                data[i][0] = a.getID();
                data[i][1] = a.getNombre();
                data[i][2] = a.getCantidad();
                data[i][3] = a.getPrecio();
                
                i++;
                
            }
            
            tableModel.setDataVector(data, columNames);
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return tableModel;
        
    }
    
    public DefaultTableModel getTablaArticulos(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"ID", "Nombre", "Stock", "Precio"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Articulos");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
      Object[][] data = new String[registros][4];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID, Nombre, Stock, Precio FROM Articulos");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaAlmacen(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"ID", "Nombre", "Stock", "Precio", "NIF", "IVA"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Articulos");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
      Object[][] data = new String[registros][6];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID, Nombre, Stock, Precio, NIF_Proveedor, IVA FROM Articulos");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");
                data[i][4] = res.getString("NIF_Proveedor");
                data[i][5] = res.getString("IVA");
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaClientes(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"DNI", "Nombre", "Apellidos", "Direccion", "Telefono", "Tarjeta"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Clientes");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
      Object[][] data = new String[registros][6];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono, Tarjeta FROM Clientes");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Direccion");
                data[i][4] = res.getString("Telefono");
                data[i][5] = res.getString("Tarjeta");
                
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
    
  
    
    public boolean InsertarArticulo (String nombre , int stock, double precio, String nif, int iva) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Articulos ( Nombre ,Stock ,Precio, NIF_Proveedor,  IVA )"
                    + "VALUES ( '" + nombre + "', '" + stock + "', '" + precio + "','" + nif + "','" + iva + "') ";
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
    
    public boolean InsertarCliente (String dni, String nombre , String apellidos, String direccion,  int telefono, int tarjeta) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Clientes ( DNI ,Nombre ,Apellidos ,Direccion ,Telefono, Tarjeta ) "
                    + "VALUES ( '" + dni + "','" + nombre + "', '" + apellidos + "','" + direccion + "', " + telefono + ", " + tarjeta + " ) ";
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
    
   
    
    public boolean EliminarClientes( String dni ){
         boolean res=false;
        //se arma la consulta
        String q = " DELETE FROM Clientes WHERE  DNI='" + dni + "' " ;
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
    
  
    public void modificarArticulo (String id, String nombre , int stock, double precio, String nif ,int iva) {
        
        String q="Update Articulos set ID='"+id+"', Nombre='"+nombre+"', Stock='"+stock+"', Precio='"+precio+"',NIF_Proveedor='"+nif+"', IVA='"+iva+"' where ID='"+id+"';";
        
        try {
            
            //Se mete en la base de datos
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();            

        }catch(SQLException e){
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }  
    }
    
    
    public void modificarCliente (String dni, String nombre , String apellidos, String direccion,  int telefono, long tarjeta) {
        
        String q="Update Clientes set Nombre='"+nombre+"', Apellidos='"+apellidos+"', Direccion='"+direccion+"', Telefono="+telefono+", Tarjeta="+tarjeta+" where DNI='"+dni+"';";
        
        try {
            
            //Se mete en la base de datos
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();            

        }catch(SQLException e){
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }  
    }
    
    public DefaultTableModel buscarCliente(String buscar){
        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos=0;
        String[] columNames = {"DNI", "Nombre", "Apellidos", "Direccion", "Telefono", "Tarjeta"};
        
        try{ 
            
            PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as total FROM Clientes where Nombre like '%"+buscar+"%'");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos=res.getInt("total");
            res.close();
            
            
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        
        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][6];
        
        try{
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Clientes where Nombre like '%"+buscar+"%' || DNI like '%"+buscar+"%'" );
            ResultSet res = pstm.executeQuery();
            int i=0;
            
            while(res.next()){ //y llenamos los datos en la matriz
                data[i][0] = res.getString( "dni" );
                data[i][1] = res.getString( "nombre" );
                data[i][2] = res.getString( "apellidos" );
                data[i][3] = res.getString( "direccion" );
                data[i][4] = res.getString( "telefono" );
                data[i][5] = res.getString( "tarjeta" );
                i++;
            }
            
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames );            
            
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }
    
    public DefaultTableModel buscarArticulo(String buscar){
        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos=0;
        String[] columNames = {"ID", "Nombre", "Stock", "Precio"};
        
        try{
            
            PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as total FROM Articulos where Nombre like '%"+buscar+"%'");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos=res.getInt("total");
            res.close();
            
            
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        
        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][4];
        
        try{
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Articulos where Nombre like '%"+buscar+"%'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            
            while(res.next()){ //y llenamos los datos en la matriz
                data[i][0] = res.getString( "ID" );
                data[i][1] = res.getString( "Nombre" );
                data[i][2] = res.getString( "Stock" );
                data[i][3] = res.getString( "Precio" );
                i++;
            }
            
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames );            
            
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }
}
       

    
    /*public String getDescripcion(int i) {
        
        String q = "SELECT Descripcion FROM Articulos WHERE ID = '" + String.valueOf(i) + "'";
        String r = null;
        
        // Se sacara de la base de datos la descripcion correspondiente al articulo indicado.
        try {
            
            Statement stmt = db.getConnection().createStatement();
            
            ResultSet res = stmt.executeQuery(q);
            res.next();
            r = res.getString("Descripcion");
            res.close();
            
        } catch (SQLException e) {
        
            System.err.println(e.getMessage());
            
        }
        
        return r;
        
    }
    */
