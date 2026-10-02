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

    //agregando metodo transferencia

    public void transferir(CuentaBancaria destino, double monto) {
        if (destino == null || destino == this) {
            throw new IllegalArgumentException("Cuenta de destino inválida");
        }

        if (!Double.isFinite(monto) || monto <= 0 || monto > saldo) {
            throw new IllegalArgumentException("Monto inválido o saldo insuficiente");
        }

        saldo -= monto;
        destino.depositar(monto);
    }
}






