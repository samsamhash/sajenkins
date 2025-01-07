
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testSaludo() {
        App app = new App();
        String resultado = app.saludo("Mundo");
        assertEquals("Hola, Mundo!", resultado);
    }
}