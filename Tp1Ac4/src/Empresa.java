import java.util.Vector;

public class Empresa {
    private String nombre;
    private String direccion;
    private Vector<Contenedor> contenedores;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contenedores = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Vector<Contenedor> getContenedores() {
        return contenedores;
    }

    public void addContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public double valorDeTodosLosArticulos(){
        double total = 0;
        for(Contenedor contenedor : contenedores ){
            total += contenedor.getValorContendor();
        }
        return total;
    }

    public double pesoContenedores(){
        double total = 0;
        for(Contenedor contenedor : contenedores ){
            total += contenedor.getPesoContendor();
        }
        return total;
    }
}
