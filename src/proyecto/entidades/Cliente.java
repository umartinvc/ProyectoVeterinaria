/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.util.List;

/**
 *
 * @author benjamin
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String nombreAlt;
    private String direccion;
    private String apellido;
    private int documento;
    private long telefono;
    private List<Mascota> mascotas;
    
    public Cliente(){
        
    }

    public Cliente(String nombre, String nombreAlt, String direccion, String apellido, int documento, long telefono) {
        this.nombre = nombre;
        this.nombreAlt = nombreAlt;
        this.direccion = direccion;
        this.apellido = apellido;
        this.documento = documento;
        this.telefono = telefono;
   
    }

    public Cliente(int idCliente, String nombre, String nombreAlt, String direccion, String apellido, int documento, long telefono, List<Mascota> mascotas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.nombreAlt = nombreAlt;
        this.direccion = direccion;
        this.apellido = apellido;
        this.documento = documento;
        this.telefono = telefono;
        this.mascotas = mascotas;
    }

    public Cliente(int idCliente, String nombre, String nombreAlt, String direccion, String apellido, int documento, long telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.nombreAlt = nombreAlt;
        this.direccion = direccion;
        this.apellido = apellido;
        this.documento = documento;
        this.telefono = telefono;
    }
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAlt() {
        return nombreAlt;
    }

    public void setNombreAlt(String nombreAlt) {
        this.nombreAlt = nombreAlt;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  idCliente + "," +nombre;
    }
    
    public boolean isEmpty(){
        if(idCliente == 0 && nombre == null && nombreAlt == null && direccion == null && apellido == null && documento == 0 && telefono == 0 && mascotas == null){
            return true;
        }else{
            return false;
        }
    }
  
}
