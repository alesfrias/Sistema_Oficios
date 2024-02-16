package controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DependenciaModel;
import sql.Conexion;

public class DependenciaController {

//    Obtener Dependencias
    public List<DependenciaModel> getDependencias(String dependencia) throws Exception {

        List<DependenciaModel> list = null;

        try {
            Connection conn = Conexion.conectar();
            String query = dependencia.isEmpty() ? "SELECT depen_id, depen_name, depen_resp FROM dependencia WHERE depen_status = 1"
                    : "SELECT depen_id, depen_name, depen_resp FROM dependencia WHERE depen_name LIKE '%" + dependencia + "%' AND depen_status = 1";

            PreparedStatement st = conn.prepareStatement(query);
            list = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                DependenciaModel dependenciaModel = new DependenciaModel();
                dependenciaModel.setDepen_id(rs.getInt("depen_id"));
                dependenciaModel.setDepen_name(rs.getString("depen_name"));
                dependenciaModel.setDepen_resp(rs.getString("depen_resp"));
                list.add(dependenciaModel);
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener las dependencias de la base de datos: " + e);
        }
        return list;
    }

//    Obtener Dependencia por ID
    public DependenciaModel getDepenById(int depenId) throws Exception {
        DependenciaModel dependencia = new DependenciaModel();

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("SELECT depen_id, depen_name, depen_resp FROM dependencia WHERE depen_id = " + depenId + " AND depen_status = 1");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                dependencia.setDepen_id(rs.getInt("depen_id"));
                dependencia.setDepen_name(rs.getString("depen_name"));
                dependencia.setDepen_resp(rs.getString("depen_resp"));
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la dependencia de la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
        return dependencia;
    }

// Agregar Dependencia
    public void addDependencia(DependenciaModel dependencia) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("INSERT INTO dependencia VALUES(?, ?, ?, 1, now())");
            st.setInt(1, 0);
            st.setString(2, dependencia.getDepen_name());
            st.setString(3, dependencia.getDepen_resp());

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar dependencia en la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
    }

//    Actualizar Dependencia
    public void updDependencia(DependenciaModel dependencia) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE dependencia SET depen_name = ?, depen_resp = ? WHERE depen_id = ?");
            st.setString(1, dependencia.getDepen_name());
            st.setString(2, dependencia.getDepen_resp());
            st.setInt(3, dependencia.getDepen_id());

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar al dependencia en la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
    }

//    Eliminar Dependencia
    public void delDependencia(int depenId) throws Exception {

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE dependencia SET depen_status = 0 WHERE depen_id = ?");
            st.setInt(1, depenId);

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar dependencia de la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
    }
}
