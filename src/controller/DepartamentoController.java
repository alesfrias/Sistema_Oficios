package controller;

import java.sql.Connection;
import model.DepartamentoModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import sql.Conexion;

public class DepartamentoController {

    public DepartamentoModel getDeptos() throws Exception{
        DepartamentoModel departamento = new DepartamentoModel();
        
        try {
            Connection conn = Conexion.conectar();
           PreparedStatement st = conn.prepareStatement("SELECT depto_id, depto_name FROM departamento WHERE depto_status = 1");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al obtener los departamentos de la base de datos" + e);
        }
    return departamento;
    }
}
