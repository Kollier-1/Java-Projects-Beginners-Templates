/**
 * TOPIC: GUI Applications with Swing (Simple Greeting)
 * LEVEL: Beginner
 * DESCRIPTION: A simple GUI application that asks the user for their
 * name and displays a personalized greeting. This demonstrates basic
 * Swing components and event handling.

 * LEARNING OBJECTIVES:
 * - Create a JFrame window with an absolute layout
 * - Use JTextField for text input
 * - Use JButton to trigger the greeting
 * - Use JLabel to display the personalized message
 * - Implement an anonymous ActionListener class for event handling
 * - Concatenate strings to create a personalized message

 * KEY CONCEPTS:
 * - JFrame: The main window container
 * - JTextField: Input field for user text
 * - JButton: Interactive element to trigger actions
 * - JLabel: Display text or images
 * - Absolute layout: Components positioned with setBounds()
 * - ActionListener: Interface for handling button clicks

 * EXAMPLE INPUT:
 * (Enter "Carlos" in the text field)
 * Hello Carlos!

 * EXAMPLE INPUT (empty):
 * (Leave field empty)
 * Hello !
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIprogramation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 20, 200, 25);
        frame.add(textField);

        JButton button = new JButton("Greet");
        button.setBounds(100, 50, 100, 25);
        frame.add(button);

        JLabel label = new JLabel("");
        label.setBounds(50, 80, 200, 25);
        frame.add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                label.setText("Hello " + name + "!");
            }
        });

        frame.setVisible(true);
    }
}