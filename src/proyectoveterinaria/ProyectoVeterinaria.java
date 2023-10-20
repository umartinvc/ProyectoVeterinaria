/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoveterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import proyecto.conexion.ClienteData;
import proyecto.conexion.MascotaData;
import proyecto.entidades.Cliente;
import proyecto.entidades.Mascota;

/**
 *
 * @author benjamin
 */
public class ProyectoVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ClienteData clienteData = new ClienteData();

       Cliente cliente = new Cliente(13,"Johan", "Luc", "Calle real 1","Lop", 123456623,381335567);
        
       //clienteData.guardarCliente(cliente);
        clienteData.modificarCliente(cliente);
        //clienteData.borrarCliente(1);
        
        //clienteData.guardarCliente(cliente);
        //System.out.println(clienteData.buscarClientePorDNI(45062053)); 

//        MascotaData md = new MascotaData();
//        Mascota mascota;
//        mascota = new Mascota("Popo", "mezcla", "macho", "rrope", "pelado", LocalDate.of(2020,1,23), 35.5, 40.0, cliente.getIdCliente());
//        
       
        //md.guardarMascota(mascota);
//        List<Mascota> mascotas = new ArrayList<Mascota>();
//                mascotas = md.obtenerMascotas(8);
//                System.out.println(mascotas);
//System.out.println(clienteData.MascotasdeCliente(8));



       
  //      MascotaData md = new MascotaData();
       //md.borrarMascota(2);
        //clienteData.ClientesTodos();

    }
    
}
