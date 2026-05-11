import javax.swing.*;
import java.awt.*;

public class Programa23Progreso extends JFrame {

    private JProgressBar barraProgreso;
    private JButton btnIniciar;

    public Programa23Progreso() {

        setTitle("Barra de Progreso");
        setSize(350, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Barra de progreso
        barraProgreso = new JProgressBar(0, 100);
        barraProgreso.setValue(0);
        barraProgreso.setStringPainted(true);

        // Botón
        btnIniciar = new JButton("Iniciar");

        // Evento del botón
        btnIniciar.addActionListener(e -> iniciarProgreso());

        // Agregar componentes
        add(barraProgreso);
        add(btnIniciar);

        setVisible(true);
    }

    private void iniciarProgreso() {

        new Thread(() -> {

            for (int i = 0; i <= 100; i++) {

                barraProgreso.setValue(i);

                try {
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }

        }).start();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa23Progreso();
        });
    }
}