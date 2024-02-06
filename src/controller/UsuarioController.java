package controller;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import sql.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.UsuarioModel;

/**
 *
 * @author Ing. Alex Espejel
 */
public class UsuarioController {

    //Método para iniciar sesión
    public boolean userLogin(UsuarioModel usuario) {

        boolean respuesta = false;

        Connection conn = sql.Conexion.conectar();
        String query = "SELECT user_rfc, user_pwd FROM usuario_sistema "
                + "WHERE user_rfc = '" + usuario.getUser_rfc() + "' AND user_pwd = '" + usuario.getUser_pwd() + "' AND user_status = 1";
        Statement st;

        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        }
        return respuesta;
    }

    public boolean addUser(UsuarioModel usuario) {

        boolean respuesta = false;
        Connection conn = Conexion.conectar();
        try {
            PreparedStatement query = conn.prepareStatement("INSERT INTO usuario_sistema VALUES(?,?,?,?,?,?,1,now())");
            query.setString(1, "0");
            query.setString(2, usuario.getUser_name());
            query.setString(3, usuario.getDepto_id());
            query.setString(4, usuario.getUser_rfc());
            query.setString(5, usuario.getUser_pwd());
            query.setString(6, usuario.getUser_rol());

            if (query.executeUpdate() > 0) {
                respuesta = true;
            }
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro " + e);
        }

        return respuesta;
    }
}
