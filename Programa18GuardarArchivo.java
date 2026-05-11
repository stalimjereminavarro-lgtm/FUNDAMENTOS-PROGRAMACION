import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.PrintWriter;

public class Programa18GuardarArchivo extends JFrame {

    private JTextArea areaTexto;
    private JButton btnGuardar;

    public Programa18GuardarArchivo() {

        setTitle("Guardar Archivo");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scroll = new JScrollPane(areaTexto);

        btnGuardar = new JButton("Guardar como");

        btnGuardar.addActionListener(e -> guardarArchivo());

        add(scroll, BorderLayout.CENTER);
        add(btnGuardar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void guardarArchivo() {

        JFileChooser selector = new JFileChooser();

        int opcion = selector.showSaveDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            File archivo = selector.getSelectedFile();

            try (PrintWriter escritor = new PrintWriter(archivo)) {

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
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa18GuardarArchivo();
        });
    }
}