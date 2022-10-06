package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    int documento;
    String tipoDocumento;
    String nombre;
    String direccion;
    float numeroLegajo;
    int antiguedad;
    List<Double> sueldoBasico;

    // Constructor
    public Empleado(int documento, String tipoDocumento, String nombre, String direccion, float numeroLegajo, int antiguedad, ArrayList<Double> sueldoBasico){
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroLegajo = numeroLegajo;
        this.antiguedad = antiguedad;
        this.sueldoBasico = sueldoBasico;
    }

    public String toString(){
        return "Tipo documento: " + tipoDocumento + "\n" + "Documento: " + documento + "\n" + "Nombre: " + nombre + "\n" + "Direccion: " + direccion + "\n" +
                "Numero Legajo: " + numeroLegajo + "\n" + "Antiguedad: " + antiguedad + "\n" + "Sueldo Basico: " + (sueldoBasico.get(1) + sueldoBasico.get(2));
    }

    public String equals(Empleado obj){
        if(this.documento == obj.documento && this.tipoDocumento == obj.tipoDocumento){
            return "Las personas son iguales";
        } else {
            return "Las personas no son iguales";
        }
    }

    public String calcularSueldo(){
        double sueldo = sueldoBasico.get(2) * antiguedad;
        return "El sueldo mensual de " + this.nombre + " es de: " + sueldo;
    }
}
