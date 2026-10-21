public class CuentaBancaria {

    private double saldo;

    // NUEVO 1: Tasa de comisión del 2 %
    private static final double TASA_COMISION = 0.02;

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
    // NUEVO 2: Método de cobro de comisión
    public void cobrarComision(double montoOperacion) {
        double comision = montoOperacion * TASA_COMISION;

        if (montoOperacion > 0 && comision <= saldo) {
            saldo -= comision;
        }
    }
}






