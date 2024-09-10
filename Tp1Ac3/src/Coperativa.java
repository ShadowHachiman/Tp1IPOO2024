import java.util.Vector;

public class Coperativa {
    private Vector<Chofer> chofers;
    public Coperativa() {
        this.chofers = new Vector<>();
    }

    public Vector<Chofer> getChofers() {
        return chofers;
    }

    public void addChoder(Chofer chofer){
        this.chofers.add(chofer);
    }
    public Chofer realizarViaje(int canPasajero, double km){
        for (Chofer chofer : chofers) {
            if (chofer.puedeTransportar(canPasajero)){
                chofer.registrarViaje(km);
                return chofer;
            }
        }
        return null;
    }
    public Colectivo mayorKilometro() {
        if (choferes.isEmpty()) {
            return null;
        }

        Chofer choferConMayorKilometraje = choferes.get(0);

        for (Chofer chofer : choferes) {
            if (chofer.obtenerKilometraje() > choferConMayorKilometraje.obtenerKilometraje()) {
                choferConMayorKilometraje = chofer;
            }
        }
        return choferConMayorKilometraje.obtenerColectivo();
    }
}
