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
                    : "SELECT depen_id, depen_name, depen_resp FROM dependencia WHERE depen_name LIKE '%" + dependencia + "%' depen_status = 1";

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
        } finally {
            Conexion.conectar().close();
        }
        return list;
    }

//    Obtener Dependencia por ID
    public DependenciaModel getDepenById(int depenId) throws Exception {

        DependenciaModel dependencia = new DependenciaModel();

        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la dependencia de la base de datos: " + e);
        }

        return dependencia;
    }

}
