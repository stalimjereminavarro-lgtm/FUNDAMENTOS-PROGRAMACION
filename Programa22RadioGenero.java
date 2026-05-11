import javax.swing.*;
import java.awt.*;

public class Programa22RadioGenero extends JFrame {

    private JRadioButton rbMasculino;
    private JRadioButton rbFemenino;
    private ButtonGroup grupoGenero;
    private JButton btnAceptar;

    public Programa22RadioGenero() {

        setTitle("RadioButton");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // RadioButtons
        rbMasculino = new JRadioButton("Masculino");
        rbFemenino = new JRadioButton("Femenino");

        // Grupo de botones
        grupoGenero = new ButtonGroup();
        grupoGenero.add(rbMasculino);
        grupoGenero.add(rbFemenino);

        // Botón
        btnAceptar = new JButton("Aceptar");

        // Evento del botón
        btnAceptar.addActionListener(e -> mostrarGenero());

        // Agregar componentes
        add(rbMasculino);
        add(rbFemenino);
        add(btnAceptar);

        setVisible(true);
    }

    private void mostrarGenero() {

        String genero;

        if (rbMasculino.isSelected()) {

            genero = "Masculino";

        } else if (rbFemenino.isSelected()) {

            genero = "Femenino";

        } else {

            genero = "No seleccionado";
        }

        JOptionPane.showMessageDialog(
                this,
                "Género: " + genero
        );
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa22RadioGenero();
        });
    }
}