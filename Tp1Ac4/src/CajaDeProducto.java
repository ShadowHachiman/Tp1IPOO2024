import java.util.Vector;

public class CajaDeProducto extends Producto {
    private Vector<Producto> productos;


    public CajaDeProducto(String nombre) {
        super(nombre);
        productos = new Vector<>();
    }

    public Vector<Producto> getProductos() {
        return productos;
    }

    @Override
    public double getPeso() {
        double peso = 0;
        for (Producto producto : productos) {
            peso += producto.getPeso();
        }
        return peso;
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (Producto producto : productos) {
            precio += producto.getPrecio();
        }
        return precio;
    }
}
