package Solve;

import javax.swing.*;
import java.awt.*;

public class Solve {

    public static void main(String[] args) {
        // Erstellen des JFrame
        JFrame frame = new JFrame("JPanel Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Erstellen des Haupt-Panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Erstellen eines oberen Panels
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.add(new JLabel("Oben"));

        // Erstellen eines unteren Panels mit Buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.CYAN);
        bottomPanel.add(new JButton("OK"));
        bottomPanel.add(new JButton("Abbrechen"));

        // Hinzufügen der Panels zum Hauptpanel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Hinzufügen des Hauptpanels zum JFrame
        frame.add(mainPanel);

        // Sichtbar machen des Fensters
        frame.setVisible(true);
    }
}
