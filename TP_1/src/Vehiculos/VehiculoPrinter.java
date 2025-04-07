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
    public static void mostrarInformacion(Camion c){
        System.out.println("Patente: " + c.getPatente());
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Anio: " + c.getAnio());
        System.out.println("capacidadCargaKg: " + c.getCapacidadCargaKg());
        System.out.println("Tiene Acoplado: " + c.isTieneAcoplado());
    }
}
