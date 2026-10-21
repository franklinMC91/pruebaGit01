import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaBancariaTest {
    @Test
    void depositoDebeIncrementarSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);

        cuenta.depositar(50);

        assertEquals(150, cuenta.obtenerSaldo());
    }

    // agregando componente de la transferencia

    @Test
    void transferenciaDebeActualizarAmbosSaldos() {
        CuentaBancaria origen = new CuentaBancaria(1000);
        CuentaBancaria destino = new CuentaBancaria(100);

        origen.transferir(destino, 200);

        assertEquals(800, origen.obtenerSaldo(), 0.001);
        assertEquals(300, destino.obtenerSaldo(), 0.001);
    }

    @Test
    void cobrarComisionConSaldoSuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.cobrarComision(500);

        assertEquals(990, cuenta.obtenerSaldo(), 0.001);
    }

    @Test
    void cobrarComisionConSaldoInsuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(5);

        cuenta.cobrarComision(500);

        assertEquals(5, cuenta.obtenerSaldo(), 0.001);
    }

    @Test
    void cobrarComisionMontoNegativo() {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.cobrarComision(-100);

        assertEquals(1000, cuenta.obtenerSaldo(), 0.001);
    }

}
