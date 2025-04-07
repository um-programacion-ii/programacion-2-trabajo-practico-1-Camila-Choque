package app;
import Vehiculos.VehiculoPrinter;
import Vehiculos.Vehiculo;
import Vehiculos.Camion;
import Vehiculos.Auto;



public class Main {
    public static void main(String[] args) {
        DatosVehiculo(null, "Toyota", 2001, 98);
        DatosVehiculo ("AM15258", "Ford", 1800, 77);
        DatosVehiculo("AE1478", "Peugeot", 2011, -50);
        DatosVehiculo ("AA1489", "Kia", 2024, 30);
        DatosVehiculo ("AB4589", "Mercedes", 2025, 80);
        DatosCamion("AA124","Volvo",2020,15000,true);
        DatosCamion(null,"CAT",2018,15000,true);
        DatosAuto("AH1234","Mazda",2024,500,5);
        DatosAuto("AC7894","Toyota",1800,200,2);


    }

    //IMPRIME VEHICULOS Y VEHICULOS CON ERRORES
    public static void  DatosVehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        try {
            Vehiculo v = new Vehiculo(patente, marca, anio, capacidadCargaKg);
            System.out.println("INFORMACION DEL VEHICULO");
            VehiculoPrinter.mostrarInformacion(v);
            System.out.println("                             ");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("                             ");
        }

    }
    //IMPRIME CAMIONES Y CAMIONES CON ERRORES
    public static void DatosCamion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        try {
            Camion c = new Camion(patente, marca, anio, capacidadCargaKg, tieneAcoplado);
            System.out.println("INFORMACION DEL CAMION");
            VehiculoPrinter.mostrarInformacion(c);
            System.out.println("                             ");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("                             ");
        }
    }
    //IMPRIME AUTOS Y AUTOS CON ERRORES
    public static void DatosAuto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        try {
            Auto a = new Auto(patente, marca, anio, capacidadCargaKg, cantidadPasajeros);
            System.out.println("INFORMACION DEL AUTO");
            VehiculoPrinter.mostrarInformacion(a);
            System.out.println("                             ");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("                             ");
        }

    }
}
