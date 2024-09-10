import javax.xml.crypto.Data;
import java.util.Vector;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente() {
        super(titular, saldo, -150, fecha, transacciones);
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void extraer(double valor) {

    }

    @Override
    public void deposito(double valor) {

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        addTransaccion(valor, "deposito");
    }

    @Override
    public double extrac(double valor) {
        if (getSaldo() - valor >= getLimite()) {
            setSaldo(getSaldo() - valor);
            addTransaccion(valor, "extraccion");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

}
