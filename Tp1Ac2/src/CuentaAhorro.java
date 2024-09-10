import javax.xml.crypto.Data;

public class CuentaAhorro extends CuentaBancaria{
    private int realizadasExtracciones;
    private  int maxExtracciones;
    public CuentaAhorro(Persona titular, double saldo, double limite, Data fecha) {
        super(titular, saldo, 10, fecha, transaccion);
        this.realizadasExtracciones = 0;
        this.maxExtracciones = 10;
    }

    public int getRealizadasExtracciones() {
        return realizadasExtracciones;
    }
    public int getMaxExtracciones() {
        return maxExtracciones;
    }

    public void setRealizadasExtracciones(int realizadasExtracciones) {
        this.realizadasExtracciones = realizadasExtracciones;
    }

    @Override
    public void extraer(double valor) {
        if (getSaldo() - valor >= getLimite() || getMaxExtracciones() >= getRealizadasExtracciones()) {
            setRealizadasExtracciones(getRealizadasExtracciones() + 1);
            setSaldo(getSaldo() - valor);
            addTransaccion(valor, "Extraccion");
        }else {
            System.out.println("No realizable");
        }
    }

    @Override
    public void deposito(double valor) {
        setSaldo(getSaldo() + valor);
    }
}
