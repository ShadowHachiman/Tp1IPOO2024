import java.util.Vector;

public class Contenedor {
    private Vector<Producto> productos;
    private double nIDE;
    private String destino;
    private double pesoMax
    public Contenedor(double nIDE, String destino, double pesoMax) {
        this.nIDE = nIDE;
        this.destino = destino;
        this.pesoMax = pesoMax;
        this.productos = new Vector<>();
    }

    public Vector<Producto> getProductos() {
        return productos;
    }
    public void setProductos(Vector<Producto> productos) {
        this.productos = productos;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public double getnIDE() {
        return nIDE;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public double getPesoContendor(){
        double peso = 0;
        for (Producto p : productos) {
            peso += p.getPeso();
        }
        return peso;
    }

    public void addArticulo(Producto p) {
        if (p.getPeso() + getPesoContendor() <= getPesoMax() ) {
            addArticulo(p);
        }else {
            System.out.println("capasidad maxima alcansada");
        }
    }

    public double getValorContendor(){
        double valor = 0;
        for (Producto p : productos) {
            valor += p.getPrecio();
        }
        return valor;
    }
}
