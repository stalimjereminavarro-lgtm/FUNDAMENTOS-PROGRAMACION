import javax.swing.*;
import java.awt.*;

public class Programa21CheckHobbies extends JFrame {

    private JCheckBox chkLeer;
    private JCheckBox chkDeporte;
    private JCheckBox chkMusica;
    private JButton btnMostrar;

    public Programa21CheckHobbies() {

        setTitle("Hobbies");
        setSize(350, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // CheckBox
        chkLeer = new JCheckBox("Leer");
        chkDeporte = new JCheckBox("Deporte");
        chkMusica = new JCheckBox("Música");

        // Botón
        btnMostrar = new JButton("Mostrar");

        // Evento del botón
        btnMostrar.addActionListener(e -> mostrarHobbies());

        // Agregar componentes
        add(chkLeer);
        add(chkDeporte);
        add(chkMusica);
        add(btnMostrar);

        setVisible(true);
    }

    private void mostrarHobbies() {

        String resultado = "Hobbies: ";

        if (chkLeer.isSelected()) {
            resultado += "Leer ";
        }

        if (chkDeporte.isSelected()) {
            resultado += "Deporte ";
        }

        if (chkMusica.isSelected()) {
            resultado += "Música ";
        }

        JOptionPane.showMessageDialog(this, resultado);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa21CheckHobbies();
        });
    }
}