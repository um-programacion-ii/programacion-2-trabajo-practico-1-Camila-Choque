package Vehiculos;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    //CONSTRUCTOR

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {

        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula.");
        }
        if (anio < 1900 || anio > 2025) { // Se usa 2025 como año máximo
            throw new IllegalArgumentException("El año debe estar entre 1900 y 2025.");
        }

        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un valor positivo.");
        }
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    //GETTER

    public String getPatente() {
        return patente;
    }
    public String getMarca() {
        return marca;
    }
    public int getAnio() {
        return anio;
    }
    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    //SETTER

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula.");
        }
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        if (anio < 1900 || anio > 2025) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y 2025.");
        }
        this.anio = anio;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un valor positivo.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }





}
