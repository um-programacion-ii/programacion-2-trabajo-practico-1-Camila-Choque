public class Vehiculo {
    private String patente;
    private String marca;
    private String anio;
    private String capacidadCargaKg;

    //CONSTRUCTOR
    public Vehiculo(String patente, String marca, String anio, String capacidadCargaKg) {
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

    public String getAnio() {
        return anio;
    }

    public String getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    //SETTERS
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setCapacidadCargaKg(String capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }
    //METODO
    public void mostrarInformacion(){
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Anio: " + anio);
        System.out.println("capacidadCargaKg: " + capacidadCargaKg);
    }

}
