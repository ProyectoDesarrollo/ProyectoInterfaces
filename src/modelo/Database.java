package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    private String db = "dam11_concesionario";
    private String usr = "dam11";
    private String pass = "123568000";
    private String url = "jdbc:mysql://80.59.2.251:3306/" + db;
    private Connection conn = null;
    
    public Database () {
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.url, this.usr, this.pass);
            
        } catch (SQLException | ClassNotFoundException e) {
            
            System.err.println(e.getMessage());
            
        }
    
    }
    
    public Connection getConnection () {
        
        return this.conn;
        
    }
    
}