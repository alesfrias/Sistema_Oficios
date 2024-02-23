package controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import sql.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.OficioModel;

public class OficioController {

    //Obtener Departamentos
    public List<OficioModel> getOficios(String oficio) throws Exception {

        List<OficioModel> list = null;
        try {
            Connection conn = Conexion.conectar();
//            String query = "SELECT * FROM oficio WHERE ofi_status = 1";
            String query = oficio.isEmpty() ? "SELECT o.ofi_id, o.depen_id, ofi_asunto, o.ofi_fech_crea, o.user_id, o.ofi_obs, o.ofi_status, "
                    + "d.depen_id, d.depen_name, d.depen_resp, u.user_id, u.user_name "
                    + "FROM oficio o, dependencia d, usuario_sistema u "
                    + "WHERE o.depen_id = d.depen_id AND o.user_id = u.user_id"
                    : "SELECT o.ofi_id, o.depen_id, ofi_asunto, o.ofi_fech_crea, o.user_id, o.ofi_obs, o.ofi_status, "
                    + "d.depen_id, d.depen_name, d.depen_resp, u.user_id, u.user_name "
                    + "FROM oficio o, dependencia d, usuario_sistema u "
                    + "WHERE depen_name LIKE '%" + oficio + "%' AND o.depen_id = d.depen_id AND o.user_id = u.user_id";

            PreparedStatement st = conn.prepareStatement(query);
            list = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                OficioModel oficios = new OficioModel();
                int estatus = rs.getInt("ofi_status");
                String status = "Vigente";
                if (estatus == 0) {
                    status = "Cancelado";
                }
                oficios.setOfi_id(rs.getInt("ofi_id"));
                oficios.setDepen_name(rs.getString("depen_name"));
                oficios.setDepen_resp(rs.getString("depen_resp"));
                oficios.setOfi_asunto(rs.getString("ofi_asunto"));
                oficios.setOfi_fech_crea(rs.getDate("ofi_fech_crea").toString());
                oficios.setUser_name(rs.getString("user_name"));
                oficios.setOfi_obs(rs.getString("ofi_obs"));
                oficios.setOfi_status(status);
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

//    Obtener Oficio por ID
    public OficioModel getOfiById(int oficioId) throws Exception {

        OficioModel oficio = new OficioModel();

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("SELECT o.ofi_id, o.depen_id, ofi_asunto, o.ofi_fech_crea, o.user_id, o.ofi_obs, o.ofi_status, d.depen_id, d.depen_name, d.depen_resp, u.user_name "
                    + "FROM oficio o, dependencia d, usuario_sistema u "
                    + "WHERE ofi_id = '" + oficioId + "' AND o.depen_id = d.depen_id AND o.user_id = u.user_id");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int estatus = rs.getInt("ofi_status");
                String status = "Vigente";
            System.out.println("Consulta --> " + rs.getString("depen_name"));
                if (estatus == 0) {
                    status = "Cancelado";
                }
                oficio.setOfi_id(rs.getInt("ofi_id"));
                oficio.setDepen_name(rs.getString("depen_name"));
                oficio.setDepen_resp(rs.getString("depen_resp"));
                oficio.setOfi_asunto(rs.getString("ofi_asunto"));
                oficio.setOfi_fech_crea(rs.getDate("ofi_fech_crea").toString());
                oficio.setUser_name(rs.getString("user_name"));
                oficio.setOfi_obs(rs.getString("ofi_obs"));
                oficio.setOfi_status(status);
            }
            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el oficio de la base de datos: " + e);
        }
        return oficio;
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

//    Actualizar Oficio
    public void updOficio(OficioModel oficio) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE oficio "
                    + "SET ofi_obs = ?, ofi_status = ? "
                    + "WHERE ofi_id = ?");
            st.setString(1, oficio.getOfi_obs());
            st.setInt(2, 0);
            st.setInt(3, oficio.getOfi_id());

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar cancelar el oficio en la base de datos: " + e);
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
