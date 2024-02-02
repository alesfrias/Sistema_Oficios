package controller;

import java.sql.Statement;
import java.sql.Connection;
import sql.Conexion;
import java.sql.ResultSet;
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

        Connection conn = Conexion.conectar();
        String query = "SELECT user_rfc, user_pwd FROM usuario_sistema "
                + "WHERE user_rfc = '" + usuario.getUser_rfc() + "' AND user_pwd = '" + usuario.getUser_pwd() + "' AND user_status = 1";
        Statement st;

        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println("Error al iniciar sesión" + e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }
        return respuesta;
    }
}
