public abstract class Producto {
    public String nombre;
    publis Producto(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public abstract double getPeso();
    public abstract double getPrecio();
}
