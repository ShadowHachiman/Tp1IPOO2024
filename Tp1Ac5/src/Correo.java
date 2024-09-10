import java.util.Vector;

public class Correo {
    private String asunto;
    private String mensaje;
    private boolean leido;
    private Contacto origen;
    private Vector<Contacto> destino;
    public Correo(String asunto, String mensaje, Contacto contacto) {
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.leido = false;
        this.origen = contacto;
        this.destino = new Vector<>();
    }

    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    public Vector<Contacto> getDestino() {
        return destino;
    }
    public void setDestino(Vector<Contacto> contactos) {
        this.destino = contactos;
    }
    public Contacto getOrigen() {
        return origen;
    }

    public boolean isLeido() {
        return leido;
    }
}
