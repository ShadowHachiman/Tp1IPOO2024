public class Chofer {
    private String name;
    private Colectivo colectivo;
    public Chofer (String name, Colectivo colectivo) {
        this.name = name;
        this.colectivo = colectivo;
    }
    public String getName() {
        return name;
    }

    public Colectivo getColectivo() {
        return this.colectivo;
    }
    public void registrarViaje(float cantKmts) {
        colectivo.registrarKilometraje(cantKmts);
    }
    public float getKilometraje() {
        return colectivo.getKilometraje();
    }
    public boolean puedeTransportar(int cantPasajeros) {
        return colectivo.getCapacidadPasajeros() >= cantPasajeros;
    }
}
