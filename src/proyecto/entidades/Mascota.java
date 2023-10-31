
package proyecto.entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author benjamin
 */
public class Mascota {
    private String alias;
    private String raza;
    private String sexo;
    private String especie;
    private int codigo;
    private String colorPelo;
    private LocalDate fechaNacimiento;
    private double peso;
    private List<Visita> visitas;
    private int IdCliente;
    
    public Mascota(){
        
    }

    public Mascota(String alias, String raza, String sexo, String especie, String colorPelo, LocalDate fechaNacimiento, double peso,  List<Visita> visitas, int IdCliente) {
        this.alias = alias;
        this.raza = raza;
        this.sexo = sexo;
        this.especie = especie;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
      
        this.visitas = visitas;
        this.IdCliente= IdCliente;
    }
    public Mascota(String alias, String raza, String sexo, String especie, String colorPelo, LocalDate fechaNacimiento, double peso, int IdCliente) {
        this.alias = alias;
        this.raza = raza;
        this.sexo = sexo;
        this.especie = especie;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;

        this.IdCliente= IdCliente;
    }

    public Mascota(String alias, String raza, String sexo, String especie, int codigo, String colorPelo, LocalDate fechaNacimiento, double peso,  List<Visita> visitas, int IdCliente) {
        this.alias = alias;
        this.raza = raza;
        this.sexo = sexo;
        this.especie = especie;
        this.codigo = codigo;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;

        this.visitas = visitas;
        this.IdCliente= IdCliente;

    }

    

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void agregarVisita(Visita visita) {
        visitas.add(visita);
    }

    public List<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Visita> visitas) {
        this.visitas = visitas;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
@Override
    public String toString() {
        return  codigo + "," +alias;
    }
    
public double obtenerPesoMedio(){
    double total=0;
    List<Visita> listaFinal;
    List<Visita> ultimasVisitas=null;
    boolean trigger= false;
    if(visitas.isEmpty()){
        return 0.0;
    }
    if(visitas.size()>10)
        {
        ultimasVisitas = visitas.subList(visitas.size()-10, visitas.size());
        trigger= false;
        
    }
    
     while(visitas.size()<=10 )
    {
        for(int a= 0; a<=(10-visitas.size()); a++){
            Visita visita = new Visita();
            visita.setPeso(0);
            visitas.add(visita);
            trigger= true;
 
        }
    }
    
if(trigger){
    listaFinal=visitas;
}else{
    listaFinal=ultimasVisitas;
}
for(int a=0;  a<listaFinal.size();a++){
    System.out.println("visita"+a+":"+listaFinal.get(a));
        total= total+listaFinal.get(a).getPeso();
}
double pesoMedio=total/10;
return pesoMedio;    
}
    


    
}