package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Alex Espejel
 */
public class Conexion {

    public static Connection conectar() {
        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_oficios", "root", "Audi2023");
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos " + e);
        }
        return null;
    }
}
