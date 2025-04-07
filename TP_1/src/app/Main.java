package app;
import Vehiculos.VehiculoPrinter;
import Vehiculos.Vehiculo;
import Vehiculos.Camion;
import Vehiculos.Auto;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> listavehiculos = new ArrayList<>();


        listavehiculos.add(new Vehiculo("AA1489", "Kia", 2024, 30));
        listavehiculos.add(new Vehiculo("AB4589", "Mercedes", 2025, 80));
        listavehiculos.add(new Camion("AA124", "Volvo", 2020, 15000, true));
        listavehiculos.add(new Auto("AH1234", "Mazda", 2024, 500, 5));



    }
}