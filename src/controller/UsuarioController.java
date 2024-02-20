package controller;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import sql.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.UsuarioModel;

//Método para iniciar sesión
public class UsuarioController {

    public boolean userLogin(UsuarioModel usuario) {
        boolean respuesta = false;

        Connection conn = sql.Conexion.conectar();
        String query = "SELECT user_rfc, user_pwd, user_rol FROM usuario_sistema "
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

    //Obtener Usuarios
    public List<UsuarioModel> getUsers(String user) throws Exception {

        List<UsuarioModel> list = null;
        try {
            Connection conn = Conexion.conectar();
            String query = user.isEmpty() ? "SELECT u.user_id, u.user_name, u.depto_id, u.user_rfc, u.user_pwd, u.user_rol, d.depto_name "
                    + "FROM usuario_sistema u, departamento d WHERE u.user_status = 1 AND u.depto_id = d.depto_id"
                    : "SELECT u.user_id, u.user_name, u.depto_id, u.user_rfc, u.user_pwd, u.user_rol, d.depto_name "
                    + "FROM usuario_sistema u, departamento d WHERE user_name LIKE '%" + user + "%' AND user_status = 1 AND u.depto_id = d.depto_id";

            PreparedStatement st = conn.prepareStatement(query);
            list = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                UsuarioModel users = new UsuarioModel();
                users.setUser_id(rs.getInt("user_id"));
                users.setUser_name(rs.getString("user_name"));
                users.setDepto_name(rs.getString("depto_name"));
                users.setUser_rfc(rs.getString("user_rfc"));
                users.setUser_pwd(rs.getString("user_pwd"));
                users.setUser_rol(rs.getString("user_rol"));
                list.add(users);
            }
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los usuarios de la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
        return list;
    }

//    Obtener Usuario por ID
    public UsuarioModel getUserById(int userId) throws Exception {

        UsuarioModel usuario = new UsuarioModel();

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("SELECT user_id, user_name, user_rfc, user_pwd, user_rol FROM usuario_sistema WHERE user_id = " + userId + " AND user_status = 1");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                usuario.setUser_id(rs.getInt("user_id"));
                usuario.setUser_name(rs.getString("user_name"));
                usuario.setUser_rfc(rs.getString("user_rfc"));
                usuario.setUser_pwd(rs.getString("user_pwd"));
                usuario.setUser_rol(rs.getString("user_rol"));
            }
            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuario de la base de datos: " + e);
        }
        return usuario;
    }

//    Agregar Usuario
    public void addUser(UsuarioModel usuario) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("INSERT INTO usuario_sistema VALUES(?,?,?,?,?,?,1,now())");
            st.setInt(1, 0);
            st.setString(2, usuario.getUser_name());
            st.setInt(3, usuario.getDepto_id());
            st.setString(4, usuario.getUser_rfc());
            st.setString(5, usuario.getUser_pwd());
            st.setString(6, usuario.getUser_rol());

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro en la base de datos " + e);
        } finally {
            Conexion.conectar().close();
        }
    }

//    Actualizar Usuario
    public void updUser(UsuarioModel usuario) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE usuario_sistema "
                    + "SET user_name = ?, depto_id = ?, user_rfc = ?, user_pwd = ?, user_rol = ? "
                    + "WHERE user_id = ?");
            st.setString(1, usuario.getUser_name());
            st.setInt(2, usuario.getDepto_id());
            st.setString(3, usuario.getUser_rfc());
            st.setString(4, usuario.getUser_pwd());
            st.setString(5, usuario.getUser_rol());
            st.setInt(6, usuario.getUser_id());

            st.executeUpdate();
            st.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar");
        } finally {
            Conexion.conectar().close();
        }
    }

//    Eliminar Usuario
    public void delUser(int iduser) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE usuario_sistema SET user_status = 0 WHERE user_id = ?");
            st.setInt(1, iduser);
            
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar usuario " + e);
        }finally{
            Conexion.conectar().close();
        }
    }
}
