package modelo;

public class Articulo {
    
    String id, nombre, cantidad, precio;
    
    public Articulo (String i, String n, String c, String p) {
        
        this.id = i;
        this.nombre = n;
        this.cantidad = c;
        this.precio = p;
        
    }
    
    public void setID (String i) {
        
        this.id = i;
        
    }
    
    public void setNombre (String n) {
        
        this.nombre = n;
        
    }
    
    public void setCantidad (String c) {
        
        this.cantidad = c;
        
    }
    
    public void setPrecio (String p) {
        
        this.precio = p;
        
    }
    
    public String getID () {
        
        return this.id;
        
    }
    
    public String getNombre () {
        
        return this.nombre;
        
    }
    
    public String getCantidad () {
        
        return this.cantidad;
        
    }
    
    public String getPrecio () {
        
        return this.precio;
        
    }
    
}
