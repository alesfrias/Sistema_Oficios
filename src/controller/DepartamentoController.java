package controller;

import java.util.List;
import java.sql.Connection;
import model.DepartamentoModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sql.Conexion;

public class DepartamentoController {

    //Obtener Departamentos
    public List<DepartamentoModel> getDeptos() throws Exception {
//    public List<DepartamentoModel> getDeptos(String depto) throws Exception {
        List<DepartamentoModel> list = null;
        try {
            Connection conn = Conexion.conectar();
            String query = "SELECT depto_id, depto_name FROM departamento WHERE depto_status = 1";
//            String query = depto.isEmpty() ? "SELECT depto_id, depto_name FROM departamento WHERE depto_status = 1"
//                    : "SELECT depto_id, depto_name WHERE depto_name LIKE '%" + depto + "%' AND depto_status = 1";

            PreparedStatement st = conn.prepareStatement(query);
            list = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                DepartamentoModel deptos = new DepartamentoModel();
                deptos.setDepto_id(rs.getInt("depto_id"));
                deptos.setDepto_name(rs.getString("depto_name"));
                list.add(deptos);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener las jefaturas de la base de datos: " + e);
        } finally {

        }
        return list;
    }

    // Obtener Departamento por ID
    public DepartamentoModel getDeptoById(int deptoId) throws Exception {
        DepartamentoModel depto = new DepartamentoModel();

        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("SELECT depto_id, depto_name FROM departamento WHERE depto_id = " + deptoId + " AND depto_status = 1");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                depto.setDepto_id(rs.getInt("depto_id"));
                depto.setDepto_name(rs.getString("depto_name"));
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener las jefaturas de la base de datos: " + e);
        }
        return depto;
    }

    public void addDepto(DepartamentoModel departamento) throws Exception {
        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("INSERT INTO departamento VALUES(?, ?, 1, now())");
            st.setInt(1, 0);
            st.setString(2, departamento.getDepto_name());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la jefatura en la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
    }

    public void updDepto(DepartamentoModel departamento) throws Exception {
        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE departamento SET depto_name = ? WHERE depto_id = ?");
            st.setString(1, departamento.getDepto_name());
            st.setInt(2, departamento.getDepto_id());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la jefatura en la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
    }

    //Eliminar Departamento
    public void delDepto(int deptoId) throws Exception {
        try {
            Connection conn = Conexion.conectar();
            PreparedStatement st = conn.prepareStatement("UPDATE departamento SET depto_status = 0 WHERE depto_id = ?");
            st.setInt(1, deptoId);
            st.executeUpdate();
            System.out.println("Query --> " + st);
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la jefatura en la base de datos: " + e);
        } finally {
            Conexion.conectar().close();
        }
    }
}
