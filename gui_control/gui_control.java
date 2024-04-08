
package gui_control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class gui_control{
    private static JLabel etiqueta, etiqueta2;
    private static JButton boton, boton2, boton3;

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame ventana = new JFrame("Mi GUI con Swing");
        ventana.setSize(500, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una etiqueta
        etiqueta = new JLabel("Estado del motor: Detenido");
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta.setForeground(Color.BLUE);
        etiqueta.setBounds(0, 100, 500, 50);
        ventana.add(etiqueta);
        etiqueta2 = new JLabel();
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta2.setForeground(Color.BLUE);
        etiqueta2.setBounds(0, 150, 500, 50);
        ventana.add(etiqueta2);

        // Crear botones
        try {
        boton = new JButton();
        boton.setIcon(new ImageIcon("gui_control/flecha-izquierda.png"));
        boton.setBounds(0, 0, 100, 100);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                izquierda();
            }
        });
        ventana.add(boton);

        boton2 = new JButton();
        boton2.setIcon(new ImageIcon("gui_control/pausa.png"));
        boton2.setBounds(100, 0, 100, 100);
        boton2.setEnabled(false);
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                detener();
            }
        });
        ventana.add(boton2);

        boton3 = new JButton();
        boton3.setIcon(new ImageIcon("gui_control/flecha-correcta.png"));
        boton3.setBounds(200, 0, 100, 100);
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                derecha();
            }
        });
        ventana.add(boton3);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarFechaHora();
            }
        });
        timer.start();

        // Ejecutar el bucle de eventos
        ventana.setVisible(true);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void izquierda() {
        etiqueta.setText("Estado del motor: Girando en sentido antihorario");
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton.setEnabled(false);
    }

    public static void derecha() {
        etiqueta.setText("Estado del motor: Girando en sentido horario");
        boton2.setEnabled(true);
        boton3.setEnabled(false);
        boton.setEnabled(true);
    }

    public static void detener() {
        etiqueta.setText("Estado del motor: Detenido");
        boton2.setEnabled(false);
        boton3.setEnabled(true);
        boton.setEnabled(true);
    }

    public static void actualizarFechaHora() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss - yyyy-MM-dd");
        etiqueta2.setText(fechaHoraActual.format(formatter));
    }
}