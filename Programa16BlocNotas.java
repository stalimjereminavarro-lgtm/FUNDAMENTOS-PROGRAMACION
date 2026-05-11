import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

public class Programa16BlocNotas extends JFrame {

    private JTextArea areaTexto;
    private JButton btnGuardar;

    public Programa16BlocNotas() {

        setTitle("Bloc de Notas Simple");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scroll = new JScrollPane(areaTexto);

        btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(e -> guardarArchivo());

        add(scroll, BorderLayout.CENTER);
        add(btnGuardar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void guardarArchivo() {

        try (PrintWriter escritor = new PrintWriter("nota.txt")) {

            escritor.print(areaTexto.getText());

            JOptionPane.showMessageDialog(
                    this,
                    "Archivo guardado correctamente"
            );

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al guardar el archivo"
            );
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa16BlocNotas();
        });
    }
}