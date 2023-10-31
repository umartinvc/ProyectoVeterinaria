/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.entidades.Tratamiento;
import proyecto.entidades.TratamientosEnum;

/**
 *
 * @author piry
 */
public class TratamientoData {
    private Connection con = null;
    
    public TratamientoData(){
        con = Conexion.getConexion();
    }
    
    public void guardarTratamiento(Tratamiento tratamiento){
        String sql = "INSERT INTO tratamiento(tipo,descripcion,importe,estado)"
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps1 = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps1.setString(1, tratamiento.getTipo().toString());
            ps1.setString(2, tratamiento.getDescripcion());
            ps1.setDouble(3, tratamiento.getImporte());
            ps1.setBoolean(4, tratamiento.isActivo());
            ps1.executeUpdate();
            ResultSet rs = ps1.getGeneratedKeys();
            if(rs.next()){
                tratamiento.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Tratamiento guardado");
            }
            ps1.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamiento");
        }
        
    }
    public Tratamiento buscarTratamiento(int idTratamiento){
        String sql= "SELECT tipo, descripcion, importe, estado FROM mascota WHERE codigo_Tratamiento = ?";
        Tratamiento tratamiento = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTratamiento);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                tratamiento = new Tratamiento();
                tratamiento.setCodigo(idTratamiento);
                tratamiento.setTipo(TratamientosEnum.buscarTratamiento(rs.getString("tipo")));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("estado"));
                
            }

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamiento");
        }
        return tratamiento;
    }
    public void modificarTratamiento(Tratamiento tratamiento){
        String sql = "UPDATE tratamiento SET tipo = ?, descripcion = ?, importe = ?, estado = ?"
                + " WHERE codigo_Tratamiento = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tratamiento.getTipo().toString());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setBoolean(4, tratamiento.isActivo());
            ps.setInt(5, tratamiento.getCodigo());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Tratamiento modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamiento");
        }
        
    }
    
    public void eliminarTratamiento(int id){
        String sql = "UPDATE tratamiento SET estado = 0 WHERE codigo_Tratamiento = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Tratamiento elimanado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamiento");
        }
    }
    
    public List<Tratamiento> listarTratamiento(){
        String sql = "SELECT * FROM tratamiento WHERE estado = 1";
        ArrayList <Tratamiento> tratamientos = new ArrayList<>();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Tratamiento tratamiento = new Tratamiento();
                tratamiento.setCodigo(rs.getInt("codigo_Tratamiento"));
                tratamiento.setTipo(TratamientosEnum.buscarTratamiento(rs.getString("tipo")));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("estado"));
                //System.out.println(tratamiento.toString());
                tratamientos.add(tratamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamiento");
        }
        return tratamientos;
    }
            
}
