/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyecto.entidades;

/**
 *
 * @author piry
 */
public enum ServiciosAdicionales {
    BAÑO_DE_LA_MASCOTA("Baño de la mascota", 25.0, true),
    PELUQUERIA_CANINA("Peluquería canina", 35.0, true),
    LIMPIEZA_DENTAL("Limpieza dental", 50.0, true),
    VACUNACION("Vacunación", 20.0, true),
    HOSPEDAJE_DE_MASCOTAS("Hospedaje de mascotas", 15.0, false);

    private String descripcion;
    private double importe;
    private boolean admiteContado;

    ServiciosAdicionales(String descripcion, double importe, boolean admiteContado) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.admiteContado = admiteContado;
    }
    
    public static ServiciosAdicionales buscarServicio(String descripcion) {
        for (ServiciosAdicionales servicio : ServiciosAdicionales.values()) {
            if (servicio.descripcion.equalsIgnoreCase(descripcion)) {
                return servicio;
            }
        }
        // Devuelve null si no se encuentra ningún servicio con la descripción dada
        return null;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public boolean admiteContado() {
        return admiteContado;
    }
}
