package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class DatabaseSQLite {
    
    Connection conexion;
    
    public DatabaseSQLite(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            conexion=DriverManager.getConnection("jdbc:sqlite:DatabaseProyectoInterfaces.db3");
       }catch(SQLException ex){
            System.err.println("No se ha conectado"+ex.getMessage());
       }catch(ClassNotFoundException e){
            System.err.println("No se encuentra la clase" +e.getMessage());
       }
    }
        public Connection getConexion(){
            return this.conexion;
        }
   }   

