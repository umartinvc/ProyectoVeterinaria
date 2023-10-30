/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyecto.entidades;

/**
 *
 * @author piry
 */
public enum TratamientosEnum {
    DESPARASITACION("Desparasitación"),
    VACUNACION("Vacunación"),
    CIRUGIA("Cirugía"),
    EXAMEN_DE_SANGRE("Examen de Sangre"),
    LIMPIEZA_DENTAL("Limpieza Dental"),
    TRATAMIENTO_DE_HERIDAS("Tratamiento de Heridas"),
    FISIOTERAPIA("Fisioterapia"),
    DIAGNOSTICO_POR_IMAGEN("Diagnóstico por Imagen"),
    TERAPIA_DE_CONDUCTA("Terapia de Conducta"),
    OTROS("Otros");

    private String descripcion;

    TratamientosEnum(String descripcion) {
        this.descripcion = descripcion;
    }
    public static TratamientosEnum buscarTratamiento(String text) {
        for (TratamientosEnum tratamiento : TratamientosEnum.values()) {
            if (tratamiento.descripcion.equalsIgnoreCase(text)) {
                return tratamiento;
            }
        }
        return null; // Devuelve null si no se encuentra una coincidencia.
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
