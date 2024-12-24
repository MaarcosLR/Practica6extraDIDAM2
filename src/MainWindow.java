import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        // Configuración del JFrame
        setTitle("Gestión Directiva");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // Crear un JPanel para aplicar el borde
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 3, 10, 10)); // 3 filas y 3 columnas, con espaciado de 10px entre componentes

        // Añadir borde alrededor del panel
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // margen de 20px alrededor del panel

        // Crear botones con su actionListener correspondiente.
        addButton(buttonsPanel, "Añadir Empleados", e -> {new AddEmployeeWindow();});
        addButton(buttonsPanel, "Gestionar Departamentos", e -> {new ManageDepartmentsWindow();});
        addButton(buttonsPanel, "Generar Informes", e -> {new GenerateReportsWindow();});
        addButton(buttonsPanel, "Subir Foto de Empleado", e -> {new UploadPhotoWindow();});
        addButton(buttonsPanel, "Ver Lista de Empleados", e -> {new ViewEmployeesWindow();});
        addButton(buttonsPanel, "Editar Empleados", e -> {new EditEmployeeWindow();});
        addButton(buttonsPanel, "Eliminar Empleados", e -> {new DeleteEmployeeWindow();});
        addButton(buttonsPanel, "Ver Estadísticas", e -> {new ViewStatisticsWindow();});

        // Crear botón "Salir" con color rojo
        JButton exitButton = new JButton("Salir");
        exitButton.setBackground(Color.RED);
        exitButton.addActionListener(e -> {dispose();});
        buttonsPanel.add(exitButton);

        // Añadir el panel al JFrame
        add(buttonsPanel);

        // Hacer visible la ventana
        setVisible(true);
    }

    private void addButton(JPanel panel, String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        panel.add(button);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
