package app;
import Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        DatosVehiculo(null, "Toyota", 2001, 98);
        DatosVehiculo ("AM15258", "Ford", 1800, 77);
        DatosVehiculo("AE1478", "Peugeot", 2011, -50);
        DatosVehiculo ("AA1489", "Kia", 2024, 30);
        DatosVehiculo ("AB4589", "Mercedes", 2025, 80);



    }

    //IMPRIME VEHICULOS Y VEHICULOS CON ERRORES
    public static void  DatosVehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        try {
            Vehiculo v = new Vehiculo(patente, marca, anio, capacidadCargaKg);
            System.out.println("INFORMACION DEL VEHICULO");
            v.mostrarInformacion();
            System.out.println("                             ");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("                             ");
        }

    }
}
