/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.time.LocalDate;

/**
 *
 * @author benjamin
 */
public class Visita {
    private int idVisita;
     private Mascota mascota;
    private Tratamiento tratamiento;
    private LocalDate fecha;
    private double peso;
    private String sintomas;
    
    public Visita(){
        
    }

    public Visita(Mascota mascota, Tratamiento tratamiento, LocalDate fecha, double peso, String sintomas) {
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.sintomas = sintomas;
        this.peso=peso;
    }
    public Visita(Mascota mascota, Tratamiento tratamiento,  double peso, String sintomas) {
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.sintomas = sintomas;
        this.peso=peso;
    }

    public Visita(int idVisita, Mascota mascota, Tratamiento tratamiento, LocalDate fecha, double peso, String sintomas) {
        this.idVisita = idVisita;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.sintomas = sintomas;
        this.peso= peso;
    }
    
    public Visita(Tratamiento tratamiento){
        
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", tratamiento=" + tratamiento + ",peso=" +  peso +", sintomas=" + sintomas + '}';
    }
    
    
    
}
