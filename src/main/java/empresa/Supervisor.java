package empresa;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Empleado {
    String area;
    int empleadosCargo;

    Supervisor(int documento, String tipoDocumento, String nombre, String direccion, float numeroLegajo, int antiguedad, ArrayList<Double> sueldoBasico, String area, int empleadosCargo) {
        super(documento, tipoDocumento, nombre, direccion, numeroLegajo, antiguedad, sueldoBasico);
        this.area = area;
        this.empleadosCargo = empleadosCargo;
    }

    public String toString(){
        return "Tipo documento: " + tipoDocumento + "\n" + "Documento: " + documento + "\n" + "Nombre: " + nombre + "\n" + "Direccion: " + direccion + "\n" +
                "Numero Legajo: " + numeroLegajo + "\n" + "Antiguedad: " + antiguedad + "\n" +
                "Sueldo Basico: " + (sueldoBasico.get(1) + sueldoBasico.get(2)) + "\n" + "Area: " + area + "\n" + "Empleados a cargo: " + empleadosCargo;
    }

    public String calcularSueldo(){
        int porcentaje = 0;

        if(empleadosCargo > 0 && empleadosCargo<11){
            porcentaje = 5;
        } else if (empleadosCargo > 10 && empleadosCargo<21){
            porcentaje = 20;
        } else if (empleadosCargo > 20){
            porcentaje = 30;
        }

        double sueldo = sueldoBasico.get(2) * antiguedad + (sueldoBasico.get(2)*porcentaje/100);
        return "El sueldo mensual de " + this.nombre + " es de: " + sueldo;
    }
}
