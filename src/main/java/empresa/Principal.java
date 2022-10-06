package empresa;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        menu(empleados);


    }

    // Menú
    public static void menu(List empleados){

        Scanner scanner = new Scanner(System.in);

        System.out.print("--- MENU ---" + "\n" + "1) Agregar nuevo empleadoo" + "\n" + "2) Ver lista de empleados" + "\n" + "3) Ver sueldo de cada empleado" + "\n" + "4) Cerrar" + "\n" + "Ingrese una opcion: ");
        int opcion = scanner.nextInt();

        if(opcion == 1){
            pedirDatos(empleados);

        } else if (opcion == 2){
            if(empleados.size() == 0){
                System.out.println("\n" + "No hay ningun empleado cargado en el sistema" + "\n");
                menu(empleados);
            }

            System.out.println("\n" + "Lista de empleados: ");
            empleados.forEach((el) -> System.out.println("--------- \n" + el + "\n" + "---------" + "\n"));

            menu(empleados);

        } else if (opcion == 3) {
            Empleado[] salariosEmpleados = new Empleado[empleados.size()];

            if(salariosEmpleados.length == 0){
                System.out.println("\nNo hay registros cargados! \n");
            }
            for(int i = 0; i<empleados.size(); i++){
                salariosEmpleados[i] = (Empleado) empleados.get(i);
            }

            for(Empleado el:salariosEmpleados){
                System.out.println("\n" + el.calcularSueldo());
            }
            menu(empleados);
        } else if(opcion == 4){
            System.out.println("\n" + "Cerrado correctamente.");

        } else {
            System.out.println("\n" + "Ingrese una opcion correcta");
            menu(empleados);
        }
    }

    // Pedir Datos
    public static String pedirNombre(Scanner scanner){
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        if(nombre.length() == 0) {
            System.out.println("\nDebe ingresar un nombre!");
            return pedirNombre(scanner);
        } else {
            String[] numeros = {"1","2","3","4","5","6","7","8","9", "0"};
            for (int i = 0; i<nombre.length(); i++){
                for(String el:numeros){
                    if(nombre.contains(el)){
                        System.out.println("\nEl nombre no puede contener numeros!");
                        return pedirNombre(scanner);
                    }
                }
            }
            return nombre;
        }
    }

    public static int pedirDocumento(Scanner scanner){
        System.out.print("Ingrese el numero de documento: ");

        int documento = scanner.nextInt();

        if (String.valueOf(documento).length() != 8) {
            System.out.println("\nEl documento debe contener 8 numeros.");
            return pedirDocumento(scanner);
        } else {
            return documento;
        }

    }

    public static String pedirTipoDocumento(Scanner scanner){
        System.out.print("Ingrese el tipo de documento [DNI, PASAPORTE o LICENCIA]: ");
        String tipoDocumento = scanner.next();

        if(tipoDocumento.toUpperCase().equals("DNI") || tipoDocumento.toUpperCase().equals("PASAPORTE") || tipoDocumento.toUpperCase().equals("LICENCIA")){
            return tipoDocumento;
        } else {
            System.out.println("\nIngrese una opcion CORRECTA!");
            return pedirTipoDocumento(scanner);
        }
    }

    public static String pedirDireccion(Scanner scanner){
        System.out.print("Ingrese la direccion: ");
        String direccion = scanner.nextLine();

        if(direccion.length() < 1){
            System.out.println("\nDebe ingresar una direccion!");
            return pedirDireccion(scanner);
        } else {
            return direccion;
        }
    }

    public static int pedirLegajo(Scanner scanner){
        System.out.print("Ingrese el numero de legajo: ");
        int numLegajo = scanner.nextInt();

        if(String.valueOf(numLegajo).length() < 1 || String.valueOf(numLegajo).equals("0")){
            System.out.println("\nEl numero de legajo debe ser mayor a 0!");
            return pedirLegajo(scanner);
        } else {
            return numLegajo;
        }
    }

    public static int pedirAntiguedad(Scanner scanner){
        System.out.print("Ingrese la antiguedad: ");
        Integer antiguedad = scanner.nextInt();

        if(String.valueOf(antiguedad).length() < 1 || String.valueOf(antiguedad).equals("0")){
            System.out.println("\nEl numero de antiguedad debe ser mayor o igual a 1!");
            return pedirAntiguedad(scanner);
        } else {
            return antiguedad;
        }
    }

    public static List pedirSaldo(Scanner scanner){
        System.out.println("-- Ingrese los ultimos tres sueldos --");
        System.out.print("Sueldo del mes 3: ");
        double sueldoBasico3 = scanner.nextDouble();
        System.out.print("Sueldo del mes 2: ");
        double sueldoBasico2 = scanner.nextDouble();
        System.out.print("Sueldo del mes 1: ");
        double sueldoBasico1 = scanner.nextDouble();

        if(String.valueOf(sueldoBasico3).length() < 1 || String.valueOf(sueldoBasico3).equals("0")) {
            System.out.println("\nEl saldo debe ser mayor o igual a 1!");
            return pedirSaldo(scanner);
        } else if(String.valueOf(sueldoBasico2).length() < 1 || String.valueOf(sueldoBasico2).equals("0")){
                System.out.println("\nEl saldo debe ser mayor o igual a 1!");
                return pedirSaldo(scanner);
        } else if(String.valueOf(sueldoBasico1).length() < 1 || String.valueOf(sueldoBasico1).equals("0")){
            System.out.println("\nEl saldo debe ser mayor o igual a 1!");
            return pedirSaldo(scanner);
        } else {
            ArrayList<Double> sueldos = new ArrayList<>();
            sueldos.add(sueldoBasico3);
            sueldos.add(sueldoBasico2);
            sueldos.add(sueldoBasico1);

            return sueldos;
        }
    }

    public static String pedirArea(Scanner scanner){
        System.out.print("Ingrese el area [MARKETING, VENTAS, CONTABILIDAD, PRODUCCION]: ");
        String area = scanner.next();

        if(area.toUpperCase().equals("MARKETING") || area.toUpperCase().equals("VENTAS") ||
                area.toUpperCase().equals("CONTABILIDAD") || area.toUpperCase().equals("PRODUCCION")){
            return area;
        } else {
            System.out.println("\nIngrese una opcion CORRECTA!");
            return pedirArea(scanner);
        }
    }

    public static int pedirEmpleadosCargo(Scanner scanner){
        System.out.print("Ingrese el numero de empleados a cargo: ");
        int empleadosCargo = scanner.nextInt();

        if(String.valueOf(empleadosCargo).length() < 1 || String.valueOf(empleadosCargo).equals("0")){
            System.out.println("\nEl numero de empleados a cargo debe ser igual o mayor a 1!");
            return pedirEmpleadosCargo(scanner);
        } else {
            return empleadosCargo;
        }
    }

    public static int pedirComision(Scanner scanner){
        System.out.print("Ingrese la comision pactada: ");
        int comision = scanner.nextInt();

        if(String.valueOf(comision).length() < 1){
            System.out.println("\nLa comision debe ser igual o mayor a 0!");
            return pedirComision(scanner);
        } else {
            return comision;
        }
    }

    public static void pedirDatos(List empleados){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de empleado (EMPLEADO, SUPERVISOR o GERENTE): ");
        String tipoEmpleado = scanner.next();

        if(tipoEmpleado.toUpperCase().equals(("EMPLEADO"))){
            System.out.print(scanner.nextLine());


            String nombre = pedirNombre(scanner);

            int documento = pedirDocumento(scanner);

            String tipoDocumento = pedirTipoDocumento(scanner);

            System.out.print(scanner.nextLine());

            String direccion = pedirDireccion(scanner);

            float numLegajo = pedirLegajo(scanner);

            int antiguedad = pedirAntiguedad(scanner);

            ArrayList sueldos = (ArrayList) pedirSaldo(scanner);

            empleados.add(new Empleado(documento, tipoDocumento, nombre,  direccion, numLegajo, antiguedad, sueldos));

            System.out.println("");
            menu(empleados);

        }
        else if(tipoEmpleado.toUpperCase().equals("SUPERVISOR")){
            System.out.print(scanner.nextLine());

            String nombre = pedirNombre(scanner);

            int documento = pedirDocumento(scanner);

            String tipoDocumento = pedirTipoDocumento(scanner);


            System.out.print(scanner.nextLine());

            String direccion = pedirDireccion(scanner);

            float numLegajo = pedirLegajo(scanner);

            int antiguedad = pedirAntiguedad(scanner);

            ArrayList sueldos = (ArrayList) pedirSaldo(scanner);

            String area = pedirArea(scanner);

            int empleadosCargo = pedirEmpleadosCargo(scanner);

            empleados.add(new Supervisor(documento, tipoDocumento, nombre, direccion, numLegajo, antiguedad, sueldos, area, empleadosCargo));

            System.out.println("");
            menu(empleados);

        }
        else if(tipoEmpleado.toUpperCase().equals("GERENTE")){
            System.out.print(scanner.nextLine());

            String nombre = pedirNombre(scanner);

            int documento = pedirDocumento(scanner);

            String tipoDocumento = pedirTipoDocumento(scanner);

            System.out.print(scanner.nextLine());

            String direccion = pedirDireccion(scanner);

            float numLegajo = pedirLegajo(scanner);

            int antiguedad = pedirAntiguedad(scanner);

            ArrayList sueldos = (ArrayList) pedirSaldo(scanner);

            String area = pedirArea(scanner);

            int comision = pedirComision(scanner);

            empleados.add(new Gerente(documento, tipoDocumento, nombre, direccion, numLegajo, antiguedad, sueldos, area, comision));

            System.out.println("");
            menu(empleados);

        }
        else{
            System.out.println("\n" + "Ingrese una opcion correcta!");
            pedirDatos(empleados);
        }


    }
}
