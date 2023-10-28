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
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.entidades.Mascota;
import proyecto.entidades.Tratamiento;
import proyecto.entidades.Visita;

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
   
    String sqlMascota="INSERT INTO mascota( alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoActual, idCliente)"
            +"VALUES(?,?,?,?,?,?,?,?)";
    try{
        PreparedStatement psMascota= con.prepareStatement(sqlMascota, Statement.RETURN_GENERATED_KEYS);
        psMascota.setString(1, mascota.getAlias());
        psMascota.setString(2, mascota.getSexo());
        psMascota.setString(3, mascota.getEspecie());
        psMascota.setString(4, mascota.getRaza());
        psMascota.setString(5, mascota.getColorPelo());
        psMascota.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
        psMascota.setDouble(7, mascota.getPeso());
        psMascota.setInt(8, mascota.getIdCliente());
        psMascota.executeUpdate();
        ResultSet rsMascota = psMascota.getGeneratedKeys();
        if (rsMascota.next()){
            mascota.setCodigo(1);
            JOptionPane.showMessageDialog(null, "Mascota guardada correctamente");
        }
        psMascota.close();
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla mascota, asegurese de haber ingresado todos los datos"+e);
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
    String sql = "UPDATE mascota SET alias=?, sexo=?, especie=?, raza=?, colorPelo=?, fechaNacimiento=?, pesoActual=?, idCliente=?"
            + " WHERE codigo=?";
    try{
        PreparedStatement psMascota= con.prepareStatement(sql);
        psMascota.setString(1, mascota.getAlias());
        psMascota.setString(2, mascota.getSexo());
        psMascota.setString(3, mascota.getEspecie());
        psMascota.setString(4, mascota.getRaza());
        psMascota.setString(5, mascota.getColorPelo());
        psMascota.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
        psMascota.setDouble(7, mascota.getPeso());
        psMascota.setInt(8, mascota.getIdCliente());
        psMascota.setInt(9, mascota.getCodigo());
        int exito=psMascota.executeUpdate();
        System.out.println(exito);
        if(exito==1){
            JOptionPane.showMessageDialog(null, "Mascota modificada");
            
        }
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota");
    }
}
public Mascota buscarMascota(int codigo){
    String sql= "SELECT alias, sexo, especie, raza, colorPelo, fechaNacimiento,  pesoActual, idCliente FROM mascota WHERE codigo=?";
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
           mascota.setCodigo(rs.getInt("codigo"));
            mascota.setAlias(rs.getString("alias"));
            mascota.setSexo(rs.getString("sexo"));
            mascota.setEspecie(rs.getString("especie"));
            mascota.setRaza(rs.getString("raza"));
            mascota.setColorPelo(rs.getString("colorPelo"));
            mascota.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
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
public List<Visita> obtenerVisitas(int codigo){
    List<Visita> visitas = new ArrayList <Visita>();
    try{
        String sql = "SELECT  * FROM visita WHERE codigoMascota=? ";
        PreparedStatement obtenerVisitas = con.prepareStatement(sql);
        obtenerVisitas.setInt(1, codigo);
        ResultSet rs  = obtenerVisitas.executeQuery();
        Visita visita;
        Mascota mascota;
        MascotaData md = new MascotaData();
        Tratamiento tratamiento;
        TratamientoData td= new TratamientoData();
        
        while(rs.next()){
            visita=new Visita();
            visita.setIdVisita(rs.getInt("idVisita"));
            visita.setTratamiento(tratamiento= td.buscarTratamiento(rs.getInt("codigoTratamiento")));
            visita.setMascota(mascota= md.buscarMascota(rs.getInt("codigoMascota")));
            visita.setFecha(rs.getDate("fechaVisita").toLocalDate());
            visita.setSintomas(rs.getString("sintomas"));
            visita.setPeso(rs.getDouble("peso"));
            
            visitas.add(visita);
            
        }
        obtenerVisitas.close();
    }catch (SQLException e){
         JOptionPane.showMessageDialog(null, "Error al obtener visitas."+ e.getMessage());
    }
 return visitas;   
}
    
}