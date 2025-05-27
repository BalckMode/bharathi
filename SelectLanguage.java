import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectLanguage extends JFrame {

    public static String selectedLanguage = "English"; // Default language

    public SelectLanguage() {
        setTitle("Select Language / மொழியைத் தேர்ந்தெடுக்கவும்");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Select Language / மொழியைத் தேர்ந்தெடுக்கவும்", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        add(label, BorderLayout.NORTH);

        JButton englishButton = new JButton("English");
        JButton tamilButton = new JButton("தமிழ்");

        englishButton.setFont(new Font("Arial", Font.PLAIN, 16));
        tamilButton.setFont(new Font("Arial", Font.PLAIN, 16));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(englishButton);
        buttonPanel.add(tamilButton);
        add(buttonPanel, BorderLayout.CENTER);

        englishButton.addActionListener(e -> {
            selectedLanguage = "English";
            JOptionPane.showMessageDialog(this, "Language set to English");
            openNextPage();
        });

        tamilButton.addActionListener(e -> {
            selectedLanguage = "Tamil";
            JOptionPane.showMessageDialog(this, "மொழி தமிழ் ஆக அமைக்கப்பட்டது");
            openNextPage();
        });

        setVisible(true);
    }

    private void openNextPage() {
        // Example: open the main application window
        dispose(); // close this frame
        new HomePage(); // Replace with your main application class
    }

    public static String getSelectedLanguage() {
        return selectedLanguage;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SelectLanguage());
    }
}
