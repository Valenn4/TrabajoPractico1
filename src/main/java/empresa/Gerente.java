package empresa;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado {
    String area;
    int comisionPactada;

    Gerente(int documento, String tipoDocumento, String nombre, String direccion, float numeroLegajo, int antiguedad, ArrayList<Double> sueldoBasico, String area, int comisionPactada) {
        super(documento, tipoDocumento, nombre, direccion, numeroLegajo, antiguedad, sueldoBasico);
        this.area = area;
        this.comisionPactada = comisionPactada;
    }

    public String toString(){
        return "Tipo documento: " + tipoDocumento + "\n" + "Documento: " + documento + "\n" + "Nombre: " + nombre + "\n" + "Direccion: " + direccion + "\n" +
                "Numero Legajo: " + numeroLegajo + "\n" + "Antiguedad: " + antiguedad + "\n" +
                "Sueldo Basico: " + (sueldoBasico.get(1) + sueldoBasico.get(2)) + "\n" + "Area: " + area + "\n" + "Comision: " + comisionPactada;
    }

    public String calcularSueldo(){
        double sueldo = sueldoBasico.get(2) * antiguedad + (sueldoBasico.get(2) * antiguedad)*comisionPactada/100;
        return "El sueldo mensual de " + this.nombre + " es de: " + sueldo;
    }
}
