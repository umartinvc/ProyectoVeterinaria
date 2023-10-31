/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import proyecto.entidades.Cliente;
import proyecto.entidades.Mascota;
import proyecto.conexion.Conexion;
/**
 *
 * @author Matìas Fernàndez
 */
public class ClienteData {
     private Connection con = null;

    public ClienteData() {
        con = Conexion.getConexion();
    }
    
    public void guardarCliente(Cliente cliente){
        String sqlCliente="INSERT INTO cliente(dni, apellido, nombre, nombreAlt, direccion, telefono)"
                +"VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement psCliente= con.prepareStatement(sqlCliente,Statement.RETURN_GENERATED_KEYS);
            psCliente.setInt(1, cliente.getDocumento());
            psCliente.setString(2, cliente.getApellido());
            psCliente.setString(3, cliente.getNombre());
            psCliente.setString(4, cliente.getNombreAlt());
            psCliente.setString(5, cliente.getDireccion());
            psCliente.setLong(6, cliente.getTelefono());
            psCliente.executeUpdate();
            ResultSet rsCliente= psCliente.getGeneratedKeys();
            if (rsCliente.next()) {
               cliente.setIdCliente(1);
                JOptionPane.showMessageDialog(null, "Cliente guardado correctamente","Éxito",JOptionPane.INFORMATION_MESSAGE);
                
            }
            psCliente.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno, asegurese de haber ingresado todos los datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarCliente(int id){
      
        try {
             String sqlBorrarCliente = "DELETE FROM cliente WHERE idCliente=?;";
            PreparedStatement psBorrarCliente = con.prepareStatement(sqlBorrarCliente);
            psBorrarCliente.setInt(1, id);
            int exito = psBorrarCliente.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado","Éxito",JOptionPane.INFORMATION_MESSAGE);
              
            }
         psBorrarCliente.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accceder a la tabla cliente","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificarCliente(Cliente cliente){
        String sqlmodcliente="UPDATE cliente SET dni=?, apellido=?, nombre=?, nombreAlt=?, direccion=?, telefono=?"
                + " WHERE idCliente=?";
        
         try {
             PreparedStatement psModCliente= con.prepareStatement(sqlmodcliente);
             psModCliente.setInt(1,cliente.getDocumento());
             psModCliente.setString(2, cliente.getApellido());
             psModCliente.setString(3, cliente.getNombre());
             psModCliente.setString(4, cliente.getNombreAlt());
             psModCliente.setString(5, cliente.getDireccion());
             psModCliente.setLong(6, cliente.getTelefono());
             psModCliente.setInt(7, cliente.getIdCliente());
            int exito= psModCliente.executeUpdate();
             if (exito==1) {
               
                 JOptionPane.showMessageDialog(null, "El cliente se modifico con exito","Éxito",JOptionPane.INFORMATION_MESSAGE);
             }
         } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"No se pudo modificar al cliente","ERROR",JOptionPane.ERROR_MESSAGE);
         }
    }
    
    public Cliente buscarClientePorDNI(int dni){
    String sql = "SELECT idCliente, apellido, nombre, nombreAlt, direccion, telefono FROM cliente WHERE dni=?";
    Cliente cliente1 = null;
    
    try {
        PreparedStatement psBuscarCliente = con.prepareStatement(sql);
        psBuscarCliente.setInt(1, dni);
        ResultSet rs = psBuscarCliente.executeQuery();
        
        if (rs.next()) {         
            cliente1 = new Cliente();
            cliente1.setIdCliente(rs.getInt("idCliente"));
            cliente1.setDocumento(dni);
            cliente1.setApellido(rs.getString("apellido"));
            cliente1.setNombre(rs.getString("nombre"));
            cliente1.setNombreAlt(rs.getString("nombreAlt"));
            cliente1.setDireccion(rs.getString("direccion"));
            cliente1.setTelefono(rs.getLong("telefono"));
        } else {
            cliente1 = null;
        }
        
        psBuscarCliente.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
    }  
    return cliente1;
}
    
    
    
    public List<Cliente>ClientesTodos(){
        String sql="SELECT idCliente, dni, apellido, nombre, nombreAlt, direccion, telefono FROM cliente";
        List<Cliente>clientes= new ArrayList<Cliente>();
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDocumento(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setNombreAlt(rs.getString("nombreAlt"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getLong("telefono"));
                clientes.add(cliente);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
         return clientes;
    }
    public List<Mascota>MascotasdeCliente(int idCliente){
        String sqlListaMascota="SELECT*FROM mascota WHERE idCliente=?";
        List<Mascota> mascotas= new ArrayList<Mascota>();
        try {
            PreparedStatement psListaMascota = con.prepareStatement(sqlListaMascota);
            psListaMascota.setInt(1, idCliente); 
            ResultSet rsListaMascota = psListaMascota.executeQuery();
            
            while (rsListaMascota.next()) {
                Mascota mascota=new Mascota();
                
                mascota.setCodigo(rsListaMascota.getInt("codigo"));
                mascota.setAlias(rsListaMascota.getString("alias"));
                mascota.setSexo(rsListaMascota.getString("sexo"));
                mascota.setEspecie(rsListaMascota.getString("especie"));
                mascota.setRaza(rsListaMascota.getString("raza"));
                mascota.setColorPelo(rsListaMascota.getString("colorPelo"));
              mascota.setFechaNacimiento(rsListaMascota.getDate("fechaNacimiento").toLocalDate());
                mascota.setPeso(rsListaMascota.getDouble("PesoActual"));
                    mascota.setIdCliente(idCliente); 
             mascotas.add(mascota); 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return mascotas;
    } 
}
