/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author benjamin
 */
public class Visita {
    private int idVisita;
    private int codigoMascota;
    private int codigoTratamiento;
    private Date fecha;
    private double pesoPromedio;
    private String sintomas;
    private ServiciosAdicionales servicio;
    
    public Visita(){
        
    }

    public Visita(int idVisita, int codigoMascota, int codigoTratamiento, Date fecha, double pesoPromedio, String sintomas, ServiciosAdicionales servicio) {
        this.idVisita = idVisita;
        this.codigoMascota = codigoMascota;
        this.codigoTratamiento = codigoTratamiento;
        this.fecha = fecha;
        this.pesoPromedio = pesoPromedio;
        this.sintomas = sintomas;
        this.servicio = servicio;
    }

    public ServiciosAdicionales getServicio() {
        return servicio;
    }

    public void setServicio(ServiciosAdicionales servicio) {
        this.servicio = servicio;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getCodigoMascota() {
        return codigoMascota;
    }

    public void setCodigoMascota(int codigoMascota) {
        this.codigoMascota = codigoMascota;
    }

    public int getCodigoTratamiento() {
        return codigoTratamiento;
    }

    public void setCodigoTratamiento(int codigoTratamiento) {
        this.codigoTratamiento = codigoTratamiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    
}
