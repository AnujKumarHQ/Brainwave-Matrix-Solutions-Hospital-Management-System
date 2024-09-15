package hospitalmanagment;

import javax.swing.JFrame;

public class HOSPITALMANAGMENT extends JFrame {

    public HOSPITALMANAGMENT() {
        setTitle("Hospital Management System");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LOGIN loginPanel = new LOGIN();
        add(loginPanel);
        setSize(974,635);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and display the MainFrame
        java.awt.EventQueue.invokeLater(() -> {
            HOSPITALMANAGMENT hospitalmanagment = new HOSPITALMANAGMENT();
        });
    }
}