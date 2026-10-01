public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    //agregando el metodo de retiro

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }
}






