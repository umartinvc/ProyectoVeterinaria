/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.conexion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.entidades.Mascota;

/**
 *
 * @author benja
 */
public class MascotaData {
    private Connection con = null;
public MascotaData(){
    con = Conexion.getConexion();
    
}
public void guardarMascota(Mascota mascota){
   
    String sqlMascota="INSERT INTO mascota( alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoMedio, pesoActual, idCliente)"
            +"VALUES(?,?,?,?,?,?,?,?,?)";
    try{
        PreparedStatement psMascota= con.prepareStatement(sqlMascota, Statement.RETURN_GENERATED_KEYS);
        psMascota.setString(1, mascota.getAlias());
        psMascota.setString(2, mascota.getSexo());
        psMascota.setString(3, mascota.getEspecie());
        psMascota.setString(4, mascota.getRaza());
        psMascota.setString(5, mascota.getColorPelo());
        psMascota.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
        psMascota.setDouble(7, mascota.getPesoMedio());
        psMascota.setDouble(8, mascota.getPeso());
        psMascota.setInt(9, mascota.getIdCliente());
        psMascota.executeUpdate();
        ResultSet rsMascota = psMascota.getGeneratedKeys();
        if (rsMascota.next()){
            mascota.setCodigo(1);
            JOptionPane.showMessageDialog(null, "Mascota guardada correctamente");
        }
        psMascota.close();
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla mascota, asegurese de haber ingresado todos los datos");
    }
}
public void borrarMascota(int codigo){
    String sql= "DELETE from mascota where codigo=?";
    
    try{
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, codigo);
        int exito= ps.executeUpdate();
        if (exito==1){
            JOptionPane.showMessageDialog(null, "Mascota eliminada");
        }
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota");
    }
}
public void modificarMascota(Mascota mascota){
    String sql = "UPDATE mascota SET alias=?, sexo=?, especie=?, raza=?, colorPelo=?, fechaNacimiento=', pesoMedio=?, pesoActual=?, idCliente=?"
            + "WHERE codigo=?";
    try{
        PreparedStatement psMascota= con.prepareStatement(sql);
       psMascota.setString(1, mascota.getAlias());
        psMascota.setString(2, mascota.getSexo());
        psMascota.setString(3, mascota.getEspecie());
        psMascota.setString(4, mascota.getRaza());
        psMascota.setString(5, mascota.getColorPelo());
        psMascota.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
        psMascota.setDouble(7, mascota.getPesoMedio());
        psMascota.setDouble(8, mascota.getPeso());
        psMascota.setInt(9, mascota.getIdCliente());
        int exito=psMascota.executeUpdate();
        if(exito==1){
            JOptionPane.showMessageDialog(null, "Mascota modificada");
            
        }
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota");
    }
}
public Mascota buscarMascota(int codigo){
    String sql= "SELECT alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoMedio, pesoActual, idCliente FROM mascota WHERE codigo=?";
    Mascota mascota = null;
    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs= ps.executeQuery();
        if (rs.next()){
            mascota = new Mascota();
            mascota.setAlias(rs.getString("alias"));
            mascota.setSexo(rs.getString("sexo"));
            mascota.setEspecie(rs.getString("especie"));
            mascota.setRaza(rs.getString("raza"));
            mascota.setColorPelo(rs.getString("colorPelo"));
            mascota.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            mascota.setPesoMedio(rs.getDouble("pesoMedio"));
            mascota.setPeso(rs.getDouble("pesoActual"));
            mascota.setIdCliente(rs.getInt("idCliente"));
        }
       
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la mascota");
    }
    return mascota;
}
public List<Mascota> obtenerMascotas(int id){
    List<Mascota> mascotas = new ArrayList<Mascota>();
    try{
        String sql = "SELECT * FROM mascota WHERE idCliente=?";
        PreparedStatement obtenermascotas = con.prepareStatement(sql);
        obtenermascotas.setInt(1,id);
        ResultSet rs= obtenermascotas.executeQuery();
        Mascota mascota;
        while(rs.next()){
           mascota = new Mascota();
            mascota.setAlias(rs.getString("alias"));
            mascota.setSexo(rs.getString("sexo"));
            mascota.setEspecie(rs.getString("especie"));
            mascota.setRaza(rs.getString("raza"));
            mascota.setColorPelo(rs.getString("colorPelo"));
            mascota.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            mascota.setPesoMedio(rs.getDouble("pesoMedio"));
            mascota.setPeso(rs.getDouble("pesoActual"));
            mascota.setIdCliente(rs.getInt("idCliente"));
            
            mascotas.add(mascota);
            
        }
        obtenermascotas.close();
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Error al obtener materias."+ e.getMessage());
    
    }
    return mascotas;
}
}
