package Vehiculos;



public class VehiculoPrinter {
    public VehiculoPrinter() {
    }
    //METODO
    public static void mostrarInformacion(Vehiculo v){
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Anio: " + v.getAnio());
        System.out.println("capacidadCargaKg: " + v.getCapacidadCargaKg());
    }
}
