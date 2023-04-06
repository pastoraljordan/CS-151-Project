import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UserInputSave extends JFrame {
    private JTextField inputBox;
    private JButton submitButton;

    public UserInputSave() {
        // JFrame
        setTitle("Input task name and task time.");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // JPanel
        JPanel panel = new JPanel();
        inputBox = new JTextField(20);
        panel.add(inputBox);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitListener());
        panel.add(submitButton);

        // Add the panel to the JFrame
        add(panel);

        // Display JFrame
        setVisible(true);
    }

    private class SubmitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Button click event
            String userInput = inputBox.getText();

            // Write task to a txt file
            try {
                FileWriter writer = new FileWriter("user_tasks_save.txt", true);
                writer.write(userInput + "\n");
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(UserInputSave.this, "Saved: " + userInput);
        }
    }

    public static void main(String[] args) {
        new UserInputSave();
    }
}