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
    private double peso;
    private String sintomas;
    
    public Visita(){
        
    }

    public Visita(int codigoMascota, int codigoTratamiento, Date fecha, double peso, String sintomas) {
        this.codigoMascota = codigoMascota;
        this.codigoTratamiento = codigoTratamiento;
        this.fecha = fecha;
        this.peso = peso;
        this.sintomas = sintomas;
    }

    

    

    public Visita(int codigoMascota, int codigoTratamiento, double peso, String sintomas) {
        this.codigoMascota = codigoMascota;
        this.codigoTratamiento = codigoTratamiento;
        this.peso = peso;
        this.sintomas = sintomas;
    }

    public Visita(int idVisita, int codigoMascota, int codigoTratamiento, Date fecha, double peso, String sintomas) {
        this.idVisita = idVisita;
        this.codigoMascota = codigoMascota;
        this.codigoTratamiento = codigoTratamiento;
        this.fecha = fecha;
        this.peso = peso;
        this.sintomas = sintomas;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", codigoMascota=" + codigoMascota + ", codigoTratamiento=" + codigoTratamiento + ", fecha=" + fecha + ", peso=" + peso + ", sintomas=" + sintomas + '}';
    }
    
    
    
}
