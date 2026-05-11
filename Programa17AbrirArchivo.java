import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Programa17AbrirArchivo extends JFrame {

    private JTextArea areaTexto;
    private JButton btnAbrir;

    public Programa17AbrirArchivo() {

        setTitle("Abrir Archivo");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scroll = new JScrollPane(areaTexto);

        btnAbrir = new JButton("Abrir");

        btnAbrir.addActionListener(e -> abrirArchivo());

        add(scroll, BorderLayout.CENTER);
        add(btnAbrir, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void abrirArchivo() {

        JFileChooser selector = new JFileChooser();

        int opcion = selector.showOpenDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            try (BufferedReader lector = new BufferedReader(
                    new FileReader(selector.getSelectedFile()))) {

                areaTexto.read(lector, null);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Error al abrir el archivo"
                );
            }
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa17AbrirArchivo();
        });
    }
}