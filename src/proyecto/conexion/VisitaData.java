/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.conexion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.entidades.Cliente;
import proyecto.entidades.Mascota;
import proyecto.entidades.Visita;

/**
 *
 * @author piry
 */
public class VisitaData {
    private Connection con = null;
    private ClienteData clienteData = new ClienteData();
    private List<Cliente> clientes = clienteData.ClientesTodos();
    public VisitaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarVisita(Visita visita){
        String sql = "INSET INTO visita(codigoTratamiento, codigoMascota, fechaVisita, sintomas, peso)"
                + "VALUES (?,?,?,?,?)";
        /*boolean existeCliente = false;
        Cliente cliente1 = new Cliente();
        for (Cliente cliente : clientes) {
            if(cliente.getIdCliente() == visita.getMascota().getIdCliente()){
                existeCliente = true;
                cliente1 = cliente;
            }
        }
        if(!existeCliente){*/
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getCodigoTratamiento());
            ps.setInt(2, visita.getCodigoMascota());
            ps.setDate(3, visita.getFecha());
            ps.setString(4, visita.getSintomas().getDescripcion());
            ps.setDouble(5, visita.getPeso());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Visita guardada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visita");
        }
        
    }
    public void modificarVisita(Visita visita){
        String sql = "UPDATE visita SET codigoTratamiento = ?, codigoMascota = ?, fechaVisita = ?, sintomas = ?, peso = ?"
                + " WHERE idVisita = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, visita.getCodigoTratamiento());
            ps.setInt(2, visita.getCodigoMascota());
            ps.setDate(3, visita.getFecha());
            ps.setString(4, visita.getSintomas().getDescripcion());
            ps.setDouble(5, visita.getPeso());
            ps.setInt(6, visita.getIdVisita());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Visita modificada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Visita");
        }
    }
    
    public void eliminarVisita(int idVisita){
        String sqlBorrarVisita = "DELETE FROM visita WHERE idVisita=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sqlBorrarVisita);
            ps.setInt(1, idVisita);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Visita eliminada","Éxito",JOptionPane.INFORMATION_MESSAGE);
              
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accceder a la tabla visita");
        }
    }
    
    
    
    
    
}
