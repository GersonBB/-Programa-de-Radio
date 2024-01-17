// RadioCarro.java
import java.util.Random;

public class RadioCarro implements Radio {
    private boolean encendido;
    private String frecuencia;
    private double dial;

    public RadioCarro() {
        this.encendido = false;
        this.frecuencia = "AM";
        this.dial = 530.0;  // Frecuencia inicial de AM
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Radio encendido");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Radio apagado");
    }

    @Override
    public void cambiarFrecuencia() {
        frecuencia = (frecuencia.equals("AM")) ? "FM" : "AM";
        System.out.println("Frecuencia cambiada a: " + frecuencia);
    }

    @Override
    public void avanzarDial() {
        Random random = new Random();
        dial = (frecuencia.equals("AM")) ? dial + 10 * random.nextInt(10) : dial + 0.2 * random.nextInt(10);
        if (frecuencia.equals("AM") && dial > 1610.0) {
            dial = 530.0;  // Vuelve al inicio del dial de AM
        } else if (frecuencia.equals("FM") && dial > 107.9) {
            dial = 87.9;  // Vuelve al inicio del dial de FM
        }
        System.out.println("Dial avanzado a: " + dial);
    }

    @Override
    public void guardarEmisora(int boton) {
        // Implementa lógica para guardar la emisora en el botón especificado
        System.out.println("Emisora guardada en botón " + boton);
    }

    @Override
    public void seleccionarEmisora(int boton) {
        // Implementa lógica para seleccionar la emisora del botón especificado
        System.out.println("Seleccionando emisora del botón " + boton);
    }
}
