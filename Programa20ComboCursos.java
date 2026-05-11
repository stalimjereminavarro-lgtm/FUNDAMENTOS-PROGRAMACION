import javax.swing.*;
import java.awt.*;

public class Programa20ComboCursos extends JFrame {

    private JComboBox<String> comboCursos;
    private JLabel lblCurso;
    private JButton btnMostrar;

    public Programa20ComboCursos() {

        setTitle("Cursos");
        setSize(350, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // ComboBox con cursos
        comboCursos = new JComboBox<>(
                new String[]{"Java", "Python", "C++", "HTML"}
        );

        // Etiqueta
        lblCurso = new JLabel("Seleccione un curso");

        // Botón
        btnMostrar = new JButton("Mostrar");

        // Evento del botón
        btnMostrar.addActionListener(e -> mostrarCurso());

        // Agregar componentes
        add(comboCursos);
        add(btnMostrar);
        add(lblCurso);

        setVisible(true);
    }

    private void mostrarCurso() {

        lblCurso.setText(
                "Curso: " + comboCursos.getSelectedItem()
        );
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa20ComboCursos();
        });
    }
}