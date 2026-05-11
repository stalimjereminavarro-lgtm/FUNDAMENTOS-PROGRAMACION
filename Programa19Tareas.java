import javax.swing.*;
import java.awt.*;

public class Programa19Tareas extends JFrame {

    private DefaultListModel<String> modeloLista;
    private JList<String> listaTareas;
    private JTextField campoTarea;
    private JButton btnAgregar;
    private JButton btnEliminar;

    public Programa19Tareas() {

        setTitle("Lista de Tareas");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Modelo y lista
        modeloLista = new DefaultListModel<>();
        listaTareas = new JList<>(modeloLista);

        JScrollPane scroll = new JScrollPane(listaTareas);

        // Campo de texto
        campoTarea = new JTextField();

        // Botones
        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar");

        // Evento agregar
        btnAgregar.addActionListener(e -> agregarTarea());

        // Evento eliminar
        btnEliminar.addActionListener(e -> eliminarTarea());

        // Panel superior
        JPanel panelSuperior = new JPanel(new BorderLayout());

        panelSuperior.add(campoTarea, BorderLayout.CENTER);
        panelSuperior.add(btnAgregar, BorderLayout.EAST);

        // Agregar componentes
        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(btnEliminar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void agregarTarea() {

        String tarea = campoTarea.getText().trim();

        if (!tarea.isEmpty()) {

            modeloLista.addElement(tarea);
            campoTarea.setText("");
        }
    }

    private void eliminarTarea() {

        int indice = listaTareas.getSelectedIndex();

        if (indice != -1) {

            modeloLista.remove(indice);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Programa19Tareas();
        });
    }
}