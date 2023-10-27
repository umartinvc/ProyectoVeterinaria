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
    BAÑO("Baño de la mascota", 25.0, true),
    PELUQUERIA("Peluquería canina", 35.0, true),
    DENTAL("Limpieza dental", 50.0, true),
    VACUNAS("Vacunación", 20.0, true),
    HOSPEDAJE("Hospedaje de mascotas", 15.0, false);

    private final String descripcion;
    private final double importe;
    private final boolean admiteContado;

    ServiciosAdicionales(String descripcion, double importe, boolean admiteContado) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.admiteContado = admiteContado;
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
