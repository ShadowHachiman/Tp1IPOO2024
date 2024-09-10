public class Colectivo {
    private String patente;
    private String modelo;
    private int capacidadPasajeros;
    private float kilometraje;

    public Colectivo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.capacidadPasajeros = 0;
        this.kilometraje = 0;
    }
    public String getPatente() {
        return patente;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    public float getKilometraje() {
        return kilometraje;
    }
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void addKilometraje(float kilometraje) {
        setKilometraje(getKilometraje() + kilometraje);
    }
}
