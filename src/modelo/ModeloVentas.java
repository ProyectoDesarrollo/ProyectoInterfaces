package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ModeloVentas {
    
    private Database db = null;
    
    public ModeloVentas() {
        
        db = new Database();
        
    }
    
    public DefaultTableModel getTablaArticulos() {
        
        DefaultTableModel tableModel = new DefaultTableModel () {
            
            @Override
            public boolean isCellEditable (int row, int column) {
                
                return false;
                
            }
            
        };
        
        int registros = 0;
        String[] columNames = {"ID", "Nombre", "Stock", "Precio"};
        
        Statement stmt = null;
        
        try {
            
            stmt = db.getConnection().createStatement();
            
            ResultSet res = stmt.executeQuery("SELECT count(*) as Total FROM Articulos");
            res.next();
            registros = res.getInt("Total");
            res.close();
            
        } catch (SQLException e) {
        
            System.err.println(e.getMessage());
            
        }
        
        Object[][] data = new String[registros][7];
        
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
    
}