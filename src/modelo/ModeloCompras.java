package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloCompras extends DatabaseSQLite {

    public ModeloCompras() {
    }
    /*-----------------------------------------------------------------TABLAS-----------------------------------------------------*/

    /*-----------------------------------------------------------------COMPRAS----------------------------------------------------*/
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

    /*---------------------------------------------------------------------ALMACEN-----------------------------------------------------------*/
    public DefaultTableModel getTablaPedido() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"ID Pedido", "DNI Cliente", "FECHA"}; // Indica el nombre de las columnas de la tabla.
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
        String[] columNames = {"ID Factura", "ID Pedido", "Precio_Total"}; // Indica el nombre de las columnas de la tabla.
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

    //Tabla pagos
    public DefaultTableModel getTablaPagos() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"NIF Proveedor", "ID Articulo", "Cantidad", "Precio Total", "FECHA"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as Total FROM Pagos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][5];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NIF_Proveedor , ID_Articulo , Cantidad , Precio_Total, FECHA FROM Pagos");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("NIF_Proveedor");
                data[i][1] = res.getString("ID_Articulo");
                data[i][2] = res.getString("Cantidad");
                data[i][3] = res.getString("Precio_Total");
                data[i][4] = res.getString("FECHA");
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

    //Articulos con stock para el checkBox
    public DefaultTableModel getTablaArticulosStock() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        int cantidad = 0;
        String[] columNames = {"ID", "Nombre", "Stock", "Precio", "NIF", "IVA"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as Total FROM Articulos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][6];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID, Nombre, Stock, Precio ,NIF_Proveedor, IVA FROM Articulos where Stock >" + cantidad + "");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
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
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }


    /*-----------------------------------------------------INSERT---------------------------------------------------------------*/
    /*-----------------------------------------------------------------COMPRAS----------------------------------------------------*/
    public boolean InsertarProveedores(String nif, String nombre, String apellidos, int telefono) {
        //Consulta para insertar 

        String q = " INSERT INTO Proveedores ( Nif ,Nombre ,Apellidos ,Telefono ) "
                + "VALUES ( '" + nif + "','" + nombre + "', '" + apellidos + "', " + telefono + " ) ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    /*---------------------------------------------------------------------ALMACEN-----------------------------------------------------------*/
    public boolean InsertarArticulo(String nombre, int stock, double precio, String nif, int iva) {
        //Consulta para insertar 

        String q = " INSERT INTO Articulos ( Nombre ,Stock ,Precio, NIF_Proveedor,  IVA )"
                + "VALUES ( '" + nombre + "', '" + stock + "', '" + precio + "','" + nif + "','" + iva + "') ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    /*----------------------------------------------------------DELETED--------------------------------------------------------------*/
    /*-----------------------------------------------------------------COMPRAS----------------------------------------------------*/
    public boolean EliminarProveedores(String nif) {
        boolean res = false;
        //se arma la consulta
        String q = " DELETE FROM Proveedores WHERE  NIF='" + nif + "' ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    /*-------------------------------------------------------------UPDATE----------------------------------------------------------*/

    /*-------------------------------------------------------------------COMPRAS----------------------------------------------------*/
    public void modificarProveedor(String nif, String nombre, String apellidos, int telefono) {

        String q = "Update Proveedores set Nombre='" + nombre + "', Apellidos='" + apellidos + "', Telefono='" + telefono + "' where NIF='" + nif + "';";

        try {

            //Se mete en la base de datos
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
            pstm1.execute();
            pstm1.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }
    }

    /*---------------------------------------------------------------------ALMACEN-----------------------------------------------------------*/
    public void modificarArticulo(String id, String nombre, int stock, double precio, String nif, int iva) {

        String q = "Update Articulos set ID='" + id + "', Nombre='" + nombre + "', Stock='" + stock + "', Precio='" + precio + "',NIF_Proveedor='" + nif + "', IVA='" + iva + "' where ID='" + id + "';";

        try {

            //Se mete en la base de datos
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }
    }


    /*-------------------------------------------------------------------LOOK FOR-----------------------------------------------*/
    /*-------------------------------------------------------------------COMPRAS----------------------------------------------------*/
    //Metodo buscar en proveedores
    public DefaultTableModel buscarProveedores(String buscar) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos = 0;
        String[] columNames = {"NIF", "Nombre", "Apellidos", "Telefono"};//Columnas tablas

        try {

            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Proveedores where (Nombre like '%" + buscar + "%') || ( NIF like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos = res.getInt("total");
            res.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][4];

        try {
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Proveedores where (Nombre like '%" + buscar + "%') || ( NIF like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;

            while (res.next()) { //y llenamos los datos en la matriz
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
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }

    /*---------------------------------------------------------------------ALMACEN-----------------------------------------------------------*/
    //Metodo buscar en Pedido
    public DefaultTableModel buscarPedido(String buscar) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos = 0;
        String[] columNames = {"ID Pedido", "DNI Cliente", "FECHA"};//Columnas tablas

        try {

            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Pedidos where (ID like '%" + buscar + "%') || (DNI_Cliente like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos = res.getInt("total");
            res.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][3];

        try {
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Pedidos where (ID like '%" + buscar + "%') || (DNI_Cliente like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;

            while (res.next()) { //y llenamos los datos en la matriz
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
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }

    //Metodo buscar en factura
    public DefaultTableModel buscarFactura(String buscar) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos = 0;
        String[] columNames = {"ID Factura", "ID Pedido", "FECHA"};//Columnas tablas

        try {

            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Facturas where (ID_Pedido like '%" + buscar + "%') || (ID like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos = res.getInt("total");
            res.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][3];

        try {
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Facturas where (ID_Pedido like '%" + buscar + "%') || (ID like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;

            while (res.next()) { //y llenamos los datos en la matriz
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
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }

    //Metodo buscar en Articulo
    public DefaultTableModel buscarArticulo(String buscar) {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos = 0;
        String[] columNames = {"ID", "Nombre", "Stock", "Precio"};

        try {

            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Articulos where (ID Like'%" + buscar + "%' ) || (Nombre like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos = res.getInt("total");
            res.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][4];

        try {
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM  Articulos where (ID Like'%" + buscar + "%' ) || (Nombre like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;

            while (res.next()) { //y llenamos los datos en la matriz
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");
                i++;
            }

            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }

}
