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

    public boolean getUsers() {

        boolean respuesta = false;

        Connection conn = Conexion.conectar();
        String query = "SELECT user_id, user_name, depto_id, user_rfc, user_pwd "
                + "FROM usuario_sistema WHERE user_status = 1";
        Statement st;

        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuarios");
        }
        return respuesta;
    }

    public UsuarioModel getUserById(int userId) throws Exception {

        UsuarioModel usuario = new UsuarioModel();
        try {
            Connection conn = Conexion.conectar();
            PreparedStatement pst = conn.prepareStatement("SELECT user_name, depto_id, user_rfc, user_pwd, user_rol FROM usuario_sistema WHERE user_id = ? AND user_status = 1");
            pst.setInt(1, userId);
            System.out.println(pst);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                usuario.setUser_id(rs.getString("user_id"));
                usuario.setUser_name(rs.getString("user_name"));
                usuario.setUser_rfc(rs.getString("user_rfc"));
            }
//            rs.close();
//            pst.close();
//            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuario de la base de datos");
        }
        return usuario;

//        boolean respuesta = false;
//        Connection conn = Conexion.conectar();
//
//        try {
//            PreparedStatement query = conn.prepareStatement("SELECT user_name, depto_id, user_rfc, user_pwd, user_rol FROM usuario_sistema WHERE user_id = ? AND user_status = 1");
//            query.setInt(1, userId);
//
//            if (query.executeUpdate() > 0) {
//                respuesta = true;
//            }
//            conn.close();
//
//        } catch (SQLException e) {
//
//            JOptionPane.showMessageDialog(null, "Error al obtener usuario con ID: " + userId);
//        }
//
//        return respuesta;
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

    public boolean updUser(UsuarioModel usuario, int idUsuario) {
        boolean respuesta = false;
        Connection conn = Conexion.conectar();
        try {
            PreparedStatement query = conn.prepareStatement("UPDATE usuario_sistema "
                    + "SET user_name = ?, depto_id = ?, user_rfc = ?, user_pwd = ?, user_rol = ? "
                    + "WHERE user_id = ?");
            query.setString(1, usuario.getUser_name());
            query.setString(2, usuario.getDepto_id());
            query.setString(3, usuario.getUser_rfc());
            query.setString(4, usuario.getUser_pwd());
            query.setString(5, usuario.getUser_rol());
            query.setInt(6, idUsuario);

            if (query.executeUpdate() > 0) {
                respuesta = true;
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar");
        }
        return respuesta;
    }

    public boolean delUser(int iduser) {

        boolean respuesta = false;
        Connection conn = Conexion.conectar();

        try {

            PreparedStatement query = conn.prepareStatement("UPDATE usuario_sistema SET user_status = 0 WHERE user_id = ?");
            query.setInt(1, iduser);

            if (query.executeUpdate() > 0) {
                respuesta = true;
            }

            conn.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar usuario " + e);
        }

        return respuesta;
    }
}
