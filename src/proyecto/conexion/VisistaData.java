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
public class VisistaData {
    private Connection con = null;
    private ClienteData clienteData = new ClienteData();
    private List<Cliente> clientes = clienteData.ClientesTodos();
    public VisistaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarVisita(Visita visita){
        String sql = "INSET INTO visita(codigoTratamiento, codigoMascota, fechaVisita, sintomas, pesoPromedio)"
                + "VALUES (?,?,?,?,?)";
        boolean existeCliente = false;
        Cliente cliente1 = new Cliente();
        for (Cliente cliente : clientes) {
            if(cliente.getIdCliente() == visita.getMascota().getIdCliente()){
                existeCliente = true;
                cliente1 = cliente;
            }
        }
        if(!existeCliente){
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, visita.getTratamiento().getCodigo());
                ps.setInt(2, visita.getMascota().getCodigo());
                ps.setDate(3, Date.valueOf(visita.getFecha()));
                ps.setString(4, visita.getSintomas());
                ps.setDouble(5, visita.getPesoPromedio());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    visita.setIdVisita(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Visita guardada");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visita");
            }
        }else{
            List<Mascota> mascotasDelCliente = cliente1.getMascotas();
            for (Mascota mascota : mascotasDelCliente) {
                
            }
        }
    }
    
    
    
    
    
}
