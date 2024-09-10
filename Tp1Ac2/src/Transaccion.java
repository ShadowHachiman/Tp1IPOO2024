import java.sql.Date;

public class Transaccion {
    private Date fecha;
    private double monto;
    private String tipo;
    public Transaccion(Date fecha, double monto, String tipo) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
