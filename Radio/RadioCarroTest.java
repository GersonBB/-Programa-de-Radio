import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioCarroTest {

    @Test
    public void testEncender() {
        RadioCarro radioCarro = new RadioCarro();
        assertFalse(radioCarro.isEncendido());

        radioCarro.encender();
        assertTrue(radioCarro.isEncendido());
    }

    @Test
    public void testApagar() {
        RadioCarro radioCarro = new RadioCarro();
        radioCarro.encender();

        radioCarro.apagar();
        assertFalse(radioCarro.isEncendido());
    }

    @Test
    public void testCambiarFrecuencia() {
        RadioCarro radioCarro = new RadioCarro();
        assertEquals("AM", radioCarro.getFrecuencia());

        radioCarro.cambiarFrecuencia();
        assertEquals("FM", radioCarro.getFrecuencia());

        radioCarro.cambiarFrecuencia();
        assertEquals("AM", radioCarro.getFrecuencia());
    }

    @Test
    public void testAvanzarDial() {
        RadioCarro radioCarro = new RadioCarro();
        assertEquals(530.0, radioCarro.getDial(), 0.001);

        radioCarro.avanzarDial();
        assertTrue(radioCarro.getDial() > 530.0);

       
    }

    
}
