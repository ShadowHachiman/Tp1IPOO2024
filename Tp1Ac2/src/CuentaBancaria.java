import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.Vector;

public abstract class CuentaBancaria {
    private Persona titular;
    private double saldo;
    private double limite;
    private Data fecha;
    private Vector<Transaccion> transacciones;

    public CuentaBancaria(Persona titular, double saldo, double limite, Data fecha) {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.fecha = fecha;
        this.transacciones = new Vector<>();
    }
    // Metodos comunes

    public Persona getTitular() {
        return titular;
    }
    public Data getFecha() {
        return fecha;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Vector<Transaccion> getTransacciones() {
        return transacciones;
    }
    public void addTransaccion(double monto, String tipo) {
        transacciones.add(new Transaccion(new Date(), monto, tipo));
    }

    // Metodos Abstractos para las Cuenta coriente y de ahorro

    public abstract void extraer(double valor);
    public abstract void deposito(double valor);
}
