/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyecto.entidades;

/**
 *
 * @author piry
 */
public enum Sintomas {
    FIEBRE("fiebre"),
    DIARREA("diarrea"),
    VOMITOS("vómitos"),
    TOS("tos"),
    ESTORNUDOS("estornudos"),
    PICAZON("picazón"),
    COJERA("cojera"),
    CONGESTION("congestión"),
    FATIGA("fatiga"),
    DEBILIDAD("debilidad"),
    PERDIDA_DE_APETITO("pérdida de apetito"),
    SANGRADO("sangrado"),
    MOQUEO("moqueo"),
    OTROS("otros");

    private final String descripcion;

    Sintomas(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static Sintomas buscarSintomas(String text) {
        for (Sintomas sintoma : Sintomas.values()) {
            if (sintoma.descripcion.equalsIgnoreCase(text)) {
                return sintoma;
            }
        }
        return null; // Devuelve null si no se encuentra una coincidencia.
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

