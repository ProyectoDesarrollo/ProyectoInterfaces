package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloVentas extends DatabaseSQLite{
    
    
    public ModeloVentas() {}
    
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
    
    public DefaultTableModel getTablaProveedores(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      //String nif, String nombre , String apellidos, int telefono
      String[] columNames = {"NIF", "Nombre", "Apellidos", "Telefono"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Proveedores");
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
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NIF, Nombre, Apellidos, Telefono FROM Proveedores");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("NIF");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Telefono");
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
    
    public boolean InsertarArticulo (String id, String nombre , int stock, double precio) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Articulos ( ID ,Nombre ,Stock ,Precio )"
                    + "VALUES ( '" + id + "','" + nombre + "', '" + stock + "', '" + precio + "') ";
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
        
        String q=" INSERT INTO Alumnos ( DNI ,Nombre ,Apellidos ,Domicilio ,Acceso ,Telefono ) "
                    + "VALUES ( '" + dni + "','" + nombre + "', '" + apellidos + "','" + direccion + "', '" + telefono + "', " + tarjeta + " ) ";
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
    
    public boolean InsertarProveedores (String nif, String nombre , String apellidos, int telefono) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Proveedores ( Nif ,Nombre ,Apellidos ,Domicilio ,Telefono ) "
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
    
    public void modificarArticulo (String id, String nombre , int stock, int precio) {
        
        String q="Update Articulos set ID='"+nombre+"', Nombre='"+nombre+"', Stock='"+stock+"', Precio='"+precio+"' where ID='"+id+"';";
        
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
    
    
    public void modificarCliente (String dni, String nombre , String apellidos, String direccion,  int telefono, int tarjeta) {
        
        String q="Update Cliente set Nombre='"+nombre+"', Apellidos='"+apellidos+"', Direccion='"+direccion+"', Telefono='"+telefono+"',, Tarjeta='"+tarjeta+"' where DNI='"+dni+"';";
        
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
}