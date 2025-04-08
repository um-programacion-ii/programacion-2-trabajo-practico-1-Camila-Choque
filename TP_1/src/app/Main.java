package app;
import Vehiculos.VehiculoPrinter;
import Vehiculos.Vehiculo;
import Vehiculos.Camion;
import Vehiculos.Auto;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> listavehiculos = new ArrayList<>();


        //listavehiculos.add(new Vehiculo("AA1489", "Kia", 2024, 30));
        //listavehiculos.add(new Vehiculo("AB4589", "Mercedes", 2025, 80));
        listavehiculos.add(new Camion("AA124", "Volvo", 2020, 15000, true));
        listavehiculos.add(new Auto("AH123", "Mazda", 2024, 500, 5));
        listavehiculos.add(new Camion("AM487", "CAT", 2018, 17000, false));
        listavehiculos.add(new Auto("AC748", "Ford", 2020, 900, 5));
        listavehiculos.add(new Camion("AD496", "CAT", 2000, 14500, true));
        listavehiculos.add(new Auto("AA120", "Mercedes", 1900, 500, 2));
        listavehiculos.add(new Auto("AA121", "BMW", 2005, 450, 4));
        listavehiculos.add(new Auto("AA122", "Toyota", 2010, 300, 5));
        listavehiculos.add(new Auto("AA123", "Ford", 2015, 350, 4));
        listavehiculos.add(new Auto("AA124", "Honda", 2018, 400, 5));
        listavehiculos.add(new Auto("AA125", "Chevrolet", 2020, 380, 4));


        // Recorrer la lista e imprimir los atributos de cada vehículo
        for (Vehiculo vehiculo : listavehiculos) {
            if (vehiculo instanceof Auto) {
                System.out.println("INFORMACION DE AUTO: " );
                VehiculoPrinter.mostrarInformacion((Auto) vehiculo);
                System.out.println("--------------------");

            }
            else if (vehiculo instanceof Camion) {
                System.out.println("INFORMACION DE CAMION: " );
                VehiculoPrinter.mostrarInformacion((Camion) vehiculo);
                System.out.println("--------------------");

            }
        }


    }
}