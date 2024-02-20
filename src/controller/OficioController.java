package controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import sql.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.OficioModel;
import model.UsuarioModel;

public class OficioController {

    //Obtener Departamentos
    public List<OficioModel> getOficios(String oficio) throws Exception {

        List<OficioModel> list = null;
        try {
            Connection conn = Conexion.conectar();
            String query = "SELECT * FROM oficio WHERE ofi_status = 1";
//            String query = user.isEmpty() ? "SELECT u.user_id, u.user_name, u.depto_id, u.user_rfc, u.user_pwd, u.user_rol, d.depto_name "
//                    + "FROM usuario_sistema u, departamento d WHERE u.user_status = 1 AND u.depto_id = d.depto_id"
//                    : "SELECT u.user_id, u.user_name, u.depto_id, u.user_rfc, u.user_pwd, u.user_rol, d.depto_name "
//                    + "FROM usuario_sistema u, departamento d WHERE user_name LIKE '%" + user + "%' AND user_status = 1 AND u.depto_id = d.depto_id";

            PreparedStatement st = conn.prepareStatement(query);
            list = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                OficioModel oficios = new OficioModel();
                oficios.setOfi_id(rs.getInt("ofi_id"));
                oficios.setDepen_id(rs.getInt("depen_id"));
                oficios.setOfi_asunto(rs.getString("ofi_asunto"));
                oficios.setOfi_fech_crea(rs.getString("ofi_fech_crea"));
                oficios.setUser_id(rs.getInt("user_id"));
                oficios.setOfi_obs(rs.getString("ofi_obs"));
                list.add(oficios);
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los oficios de la base de datos: " + e);
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
            PreparedStatement st = conn.prepareStatement("SELECT user_id, user_name, user_rfc, user_pwd FROM usuario_sistema WHERE user_id = " + userId + " AND user_status = 1");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                usuario.setUser_id(rs.getInt("user_id"));
                usuario.setUser_name(rs.getString("user_name"));
                usuario.setUser_rfc(rs.getString("user_rfc"));
                usuario.setUser_pwd(rs.getString("user_pwd"));
            }
            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuario de la base de datos: " + e);
        }
        return usuario;
    }

//    Agregar Oficio
    public void addOficio(OficioModel oficio) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("INSERT INTO oficio VALUES(?,?,?,?,?,?,1,now())");
            st.setInt(1, 0);
            st.setInt(2, oficio.getDepen_id());
            st.setString(3, oficio.getOfi_asunto());
            st.setString(4, oficio.getOfi_fech_crea());
            st.setInt(5, oficio.getUser_id());
            st.setString(6, oficio.getOfi_obs());

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el oficio en la base de datos " + e);
        } finally {
            Conexion.conectar().close();
        }
    }

//    Actualizar Usuario
    public void updOficio(OficioModel oficio) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE oficio "
                    + "SET user_name = ?, depto_id = ?, user_rfc = ?, user_pwd = ?, user_rol = ? "
                    + "WHERE user_id = ?");
            st.setString(1, oficio.getDepen_name());
            st.setString(2, oficio.getDepen_resp());
            st.setString(3, oficio.getDepen_resp());
            st.setString(4, oficio.getOfi_fech_crea());
            st.setString(5, oficio.getOfi_obs());
            st.setInt(6, oficio.getOfi_id());

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
        } finally {
            Conexion.conectar().close();
        }
    }



    private void mostrarResp(String selDependencia) {
        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("SELECT depen_resp FROM dependencia WHERE depen_status = 1");
            ResultSet rs = st.executeQuery();
        } catch (Exception e) {
        }
    }
}
