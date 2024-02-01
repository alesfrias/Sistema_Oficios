package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ing. Alex Espejel
 */
    public class Conexion {

    protected Connection conexion;
    private final String DB_URL = "jdbc:mysql://localhost/sistema_oficios";
    private final String USER = "root";
    private final String PASSWORD = "Audi2023";

    public void Conectar() throws ClassNotFoundException {
        try {

            conexion = DriverManager.getConnection(DB_URL, USER, PASSWORD);

        } catch (SQLException e) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void Cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
