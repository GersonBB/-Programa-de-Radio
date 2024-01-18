import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MainProgramTest {

    @Test
    void pruebaEncenderRadio_Positiva() {
        String input = "1\n1\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainProgram.main(new String[]{});

        assertTrue(outContent.toString().contains("Prende el radio"));

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void pruebaCambiarFrecuencia_Positiva() {
        String input = "1\n2\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainProgram.main(new String[]{});

        assertTrue(outContent.toString().contains("Cambia de AM a FM a AM"));

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void pruebaApagarRadio_Positiva() {
        String input = "1\n6\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainProgram.main(new String[]{});

        assertTrue(outContent.toString().contains("Apagar el radio"));

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void pruebaSeleccionarEmisora_Negativa() {
        String input = "1\n5\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainProgram.main(new String[]{});

        assertFalse(outContent.toString().contains("Permite seleccionar la emisora puesta en un botón"));

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void pruebaGuardarEmisora_Negativa() {
        String input = "1\n4\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainProgram.main(new String[]{});

        assertFalse(outContent.toString().contains("Permite guardar una emisora en uno de los 12 botones"));

        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    void pruebaOpcionInvalida_Negativa() {
        String input = "321\n1120\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainProgram.main(new String[]{});

        assertFalse(outContent.toString().contains("Opción noasdaasd válida"));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}



