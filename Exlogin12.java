import javax.swing.*;
import java.awt.*;

/**
 * Exlogin12 is a simple Java Swing GUI application that simulates a login screen.
 * It uses JFrame, JPanel, JLabel, JTextField, JPasswordField, and JButton components
 * to collect username and password input from the user.
 * 
 * Author: [Your Name]
 * Date: [Optional]
 */
public class Exlogin12 extends JFrame {

    // GUI components
    JPanel panel = new JPanel();
    JLabel l1 = new JLabel("Username");
    JLabel l2 = new JLabel("Password");
    JTextField t1 = new JTextField(15);
    JPasswordField t2 = new JPasswordField(15);
    JButton blogin = new JButton("Login");
    JButton reg = new JButton("New Member! Register Here");

    /**
     * Main method - Entry point of the application.
     * Uses SwingUtilities.invokeLater to ensure thread safety when building the GUI.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exlogin12());
    }

    /**
     * Constructor - Sets up the login window with all UI components.
     */
    public Exlogin12() {
        super("Login Authentication");             // Set the title of the window
        setSize(1366, 768);                         // Set window size
        setLocationRelativeTo(null);                // Center the window on screen

        panel.setLayout(null);                      // Absolute positioning
        panel.setBackground(Color.ORANGE);          // Set background color

        // Set bounds for each component (x, y, width, height)
        l1.setBounds(500, 300, 150, 20);
        l2.setBounds(500, 350, 150, 20);
        t1.setBounds(600, 300, 150, 20);
        t2.setBounds(600, 350, 150, 20);
        blogin.setBounds(500, 400, 150, 20);
        reg.setBounds(500, 450, 250, 20);

        // Add components to panel
        panel.add(l1);
        panel.add(l2);
        panel.add(t1);
        panel.add(t2);
        panel.add(blogin);
        panel.add(reg);

        // Add panel to the JFrame
        getContentPane().add(panel);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);                           // Make the window visible
    }
}

