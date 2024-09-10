import java.util.Vector;

public class Cuenta {
    private String nombreUsuario;
    private String direccionGmail;
    private Vector<Contacto> contactos;
    private Vector<Correo> correosRecividos;
    private Vector<Correo> correosEnviados;

    public Cuenta(String nombreUsuario, String direccionGmail) {
        this.nombreUsuario = nombreUsuario;
        this.direccionGmail = direccionGmail;
        this.contactos = new Vector<>();
        this.correosRecividos = new Vector<>();
        this.correosEnviados = new Vector<>();
    }

    // gets and sets

    public String getDireccionGmail() {
        return direccionGmail;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public Vector<Contacto> getContactos() {
        return contactos;
    }
    public void setContactos(Vector<Contacto> contactos) {
        this.contactos = contactos;
    }
    public Vector<Correo> getCorreosRecividos() {
        return correosRecividos;
    }
    public void setCorreosRecividos(Vector<Correo> correosRecividos) {
        this.correosRecividos = correosRecividos;
    }
    public Vector<Correo> getCorreosEnviados() {
        return correosEnviados;
    }
    public void setCorreosEnviados(Vector<Correo> correosEnviados) {
        this.correosEnviados = correosEnviados;
    }

    // Methods

    public int cantidadDeCorreos(){
        return getCorreosEnviados().size() + getCorreosEnviados().size();
    }

    public int cantidadCorreosRecibidos(){
        return getCorreosRecividos().size();
    }

    public int cantidadCorreosEnviados(){
        return getCorreosEnviados().size();
    }

    public int cantidadCorreosNoLeidos(){
        int cantidad = 0;
        for (Correo correo : getCorreosRecividos()) {
            if (correo.isLeido()){
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cantidadContactos(){
        return getContactos().size();
    }

    public void agregarCorreoRecibido(Correo correo) {
        getCorreosRecividos().add(correo);
    }

    public void agregarCorreoEnviado(Correo correo) {
        getCorreosEnviados().add(correo);
    }

    public void agregarContacto(Contacto contacto) {
        getContactos().add(contacto);
    }
}
