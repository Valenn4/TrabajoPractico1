package empresa;

public class Persona {
    int documento;
    String nombre;
    String direccion;
    int numeroLegajo;
    int antiguedad;
    int sueldoBasico;

    // Constructor
    Persona(int documento, String nombre, String direccion, int numeroLegajo, int antiguedad, int sueldoBasico){
        this.documento = documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroLegajo = numeroLegajo;
        this.antiguedad = antiguedad;
        this.sueldoBasico = sueldoBasico;
    }

    public String toString(){
        return "Documento: " + documento + "\n" + "Nombre: " + nombre + "\n" + "Direccion: " + direccion + "\n" +
                "Numero Legajo: " + numeroLegajo + "\n" + "Antiguedad: " + antiguedad + "\n" + "Sueldo Basico: " + sueldoBasico;
    }

    public String equals(Persona obj){
        if(this.documento == obj.documento){
            return "Las personas son iguales";
        } else {
            return "Las personas no son iguales";
        }
    }

    public String calcularSueldo(){
        int sueldo = sueldoBasico * antiguedad;
        return "El sueldo es de: " + sueldo;
    }
}
