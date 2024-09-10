import java.sql.Date;

public class ProductoSimple extends Producto {
    private Date fecha;
    private double precio;
    private  double peso;

    public ProductoSimple(Date fecha, double precio, double peso, String nombre) {
        super(nombre);
        this.fecha = fecha;
        this.peso = peso;
        this.precio = precio;
    }


    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
}
