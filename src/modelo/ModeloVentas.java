package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Interface;

public class ModeloVentas extends DatabaseSQLite{
    
    Interface vista;
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
    
    
    public DefaultTableModel getTablaCarritos(int id_pedido){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = { "ID Articulo" ,"ID Pedido" ,"Cantidad"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Carrito where ID_Pedido = "+id_pedido+"");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
      Object[][] data = new String[registros][3];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID_Articulo, ID_Pedido, Cantidad FROM Carrito where ID_Pedido like '%"+id_pedido+"%'");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("ID_Articulo");
                data[i][1] = res.getString("ID_Pedido");
                data[i][2] = res.getString("Cantidad");
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
    
    public ArrayList<Articulo> getTablaCarrito (int id_pedido) {
        
        ArrayList<Articulo> carrito = new ArrayList();
        DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = { "ID Articulo" ,"ID Pedido" ,"Cantidad"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Carrito where ID_Pedido = "+id_pedido+"");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
      Object[][] data = new String[registros][3];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT a.ID, a.Nombre, a.Cantidad, a.Precio, c.ID_Articulo, c.ID_Pedido FROM Articulos a, Carrito c WHERE a.ID = c.ID_Articulo AND c.ID_Pedido = " + id_pedido);
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
             
                carrito.add(new Articulo(res.getString("a.ID"), res.getString("a.Nombre"), res.getString("a.Cantidad"), res.getString("a.Precio")));
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            e.printStackTrace();
        }
        return carrito;
        
    }
    
    public DefaultTableModel getTablaPedido(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = { "ID" ,"DNI Cliente" ,"Fecha"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Pedidos");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
      Object[][] data = new String[registros][3];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID ,DNI_Cliente ,Fecha FROM Pedidos");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("DNI_Cliente");
                data[i][2] = res.getString("Fecha");
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
    
    public DefaultTableModel getTablaCobros(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = { "DNI_Cliente" ,"ID_Factura" ,"Meses", "Tipo"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Cobros");
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
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI_Cliente ,ID_Factura, Meses, Tipo FROM Cobros");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("DNI_Cliente");
                data[i][1] = res.getString("ID_Factura");
                data[i][2] = res.getString("Meses");
                data[i][3] = res.getString("Tipo");
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
    
    public String[] Rellenar(String dni){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre, Apellidos, Direccion, Telefono, Tarjeta FROM Clientes WHERE DNI like '%"+dni+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0] = res.getString("Nombre");
            Relleno[1]= res.getString("Apellidos");
            Relleno[2]= res.getString("Direccion");
            Relleno[3]= res.getString("Telefono");
            Relleno[4]= res.getString("Tarjeta");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
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
    
    public DefaultTableModel getTablaFactura(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"ID","ID_Pedido","Precio_Total"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Facturas");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
      Object[][] data = new String[registros][3];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID ,ID_Pedido ,Precio_Total FROM Facturas");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("ID_Pedido");
                data[i][2] = res.getString("Precio_Total");
                
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
    
    public boolean InsertarFactura (String id, int idPedido, double precioTotal) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Factura ( ID, ID_Pedido, Precio_Total )"
                    + "VALUES ( '" + id + "', '" + idPedido + "','" + precioTotal + "') ";
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
    
    public boolean InsertarCarrito (String id ,String idPedido, int cantidad) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Carrito ( ID_Articulo ,ID_Pedido ,Cantidad )"
                    + "VALUES ( '" + id + "','" + idPedido + "','" + cantidad + "') ";
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
    
    public boolean InsertarPedidos (String id ,String dni, Date fecha) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Pedidos ( ID ,DNI_Cliente ,FECHA )"
                    + "VALUES ( '" + id + "','" + dni + "','" + fecha + "') ";
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
    
    public boolean InsertarCobros (String dni ,int idFactura ,int meses ,String tipo) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Carrito ( DNI_Cliente ,ID_Factura ,Meses, Tipo)"
                    + "VALUES ( '" + dni + "','" + idFactura + "','" + meses + "','" + tipo + "') ";
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
    
   public boolean InsertarPago (String nif, int id, int stock, double precioT, String fecha) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Pagos ( NIF_Proveedor , ID_Articulo , Cantidad , Precio_Total, FECHA ) "
                    + "VALUES ( '" + nif + "', " + id + ", " + stock + ", " + precioT + ", '" + fecha + "' ) ";
            //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
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
        
        String q="Update Articulos set ID='"+id+"', Nombre='"+nombre+"', Stock='"+stock+"', Precio='"+precio+"',NIF_Proveedor='"+nif+"', IVA='"+iva+"' where ID='"+id+"'";
        
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
            
            PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as total FROM Clientes where (Nombre like '%"+buscar+"%') || (DNI like '%"+buscar+"%')");
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
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Clientes where (Nombre like '%"+buscar+"%' ) ||( DNI like '%"+buscar+"%')" );
            ResultSet res = pstm.executeQuery();
            int i=0;
            
            while(res.next()){ //y llenamos los datos en la matriz
                data[i][0] = res.getString( "Dni" );
                data[i][1] = res.getString( "Nombre" );
                data[i][2] = res.getString( "Apellidos" );
                data[i][3] = res.getString( "Direccion" );
                data[i][4] = res.getString( "Telefono" );
                data[i][5] = res.getString( "Tarjeta" );
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
            
            PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as total FROM Articulos where (Nombre like '%"+buscar+"%' ) ||( ID like '%"+buscar+"%')");
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
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Articulos where (Nombre like '%"+buscar+"%' ) ||( ID like '%"+buscar+"%')");
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
    
    public int getStock(int i) {
        
        int r = 0;
        String q = "SELECT Stock FROM Articulos WHERE ID = " + i;
        
        // Se sacara de la base de datos la información correspondiente al articulo indicado.
        try {
            
            Statement stmt = this.getConexion().createStatement();
            
            ResultSet res = stmt.executeQuery(q);
            res.next();
            r = res.getInt("Stock");
            res.close();
            
        } catch (SQLException e) {
        
            System.err.println(e.getMessage());
            
        }
        
        return r;
        
    }
    
    public int getIdArticulo(String nombre){
        
        int r=0;
        String q = "SELECT ID FROM Articulos WHERE Nombre= '"+nombre+"'" ;
        
        try {
            
            Statement stmt = this.getConexion().createStatement();
            
            ResultSet res = stmt.executeQuery(q);
            res.next();
            r = res.getInt("ID");
            res.close();
            
        } catch (SQLException e) {
        
            e.printStackTrace();
            
        }
        
        return r;
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
