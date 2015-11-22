package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloVentas extends Database{
    
    //private Database db = null;
    
    public ModeloVentas() {
        
        //db = new Database();
        
    }
    
    public DefaultTableModel getTablaArticulos(){
        
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros=0;
        String[] columNames = {"ID", "Nombre", "Stock", "Precio"};
        
        try{
            
            PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Articulos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros=res.getInt("total");
            res.close();
            
            
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        
        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[registros][4];
        
        try{
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM Articulos");
            ResultSet res = pstm.executeQuery();
            int i=0;
            
            while(res.next()){ //y llenamos los datos en la matriz
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
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }
    /*
    public DefaultTableModel getTablaArticulos() {
        
        DefaultTableModel tableModel = new DefaultTableModel () {
            
            @Override
            public boolean isCellEditable (int row, int column) {
                
                return false;
                
            }
            
        };
        
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"ID", "Nombre", "Stock", "Precio"}; // Indica el nombre de las columnas de la tabla.
        
        Statement stmt = null;
        
        // Se calculará la cantidad de filas que tendra la tabla.
        try {
            
            stmt = db.getConnection().createStatement();
            
            ResultSet res = stmt.executeQuery("SELECT count(*) as Total FROM Articulos");
            res.next();
            registros = res.getInt("Total");
            res.close();
            
        } catch (SQLException e) {
        
            System.err.println(e.getMessage());
            
        }
        
        Object[][] data = new String[registros][4];
        
        // Se rellenara en una matriz el contenido por celdas de la tabla.
        try {
            
            ResultSet res = stmt.executeQuery("SELECT ID, Nombre, Stock, Precio FROM Articulos");
            int i = 0;
            
            while (res.next()) {
                
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");
                
                i++;
                
            }
            
            res.close();
            
            tableModel.setDataVector(data, columNames);
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        return tableModel;
        
    }
    
    public String getDescripcion(int i) {
        
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