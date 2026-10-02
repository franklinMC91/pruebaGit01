import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaBancariaTest {
    @Test
    void depositoDebeIncrementarSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);

        cuenta.depositar(50);

        assertEquals(200, cuenta.obtenerSaldo());
    }
}
