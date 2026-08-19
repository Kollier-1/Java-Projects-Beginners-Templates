/**
 * TOPIC: GUI Applications with Swing (Text Processing)
 * LEVEL: Beginner
 * DESCRIPTION: A simple GUI application that asks the user for their
 * name and displays a personalized greeting message. This demonstrates
 * text input handling and string concatenation in a Swing application.
 
 * LEARNING OBJECTIVES:
 * - Create a JFrame window with an absolute layout
 * - Use JTextField for text input (name)
 * - Use JButton to trigger the greeting
 * - Use JLabel to display the personalized message
 * - Implement an anonymous ActionListener class for event handling
 * - Concatenate strings to create a personalized message

 * KEY CONCEPTS:
 * - Text input: JTextField captures user input as String
 * - String concatenation: Combining static text with variable input
 * - Anonymous inner class: Inline event handler
 * - setBounds(): Position components with absolute layout
 * - Event-driven programming: Responding to button clicks

 * EXAMPLE INPUT:
 * (Enter "Carlos" in the text field)
 * ¡Hi, Carlos! Welcome to the program.

 * EXAMPLE INPUT (empty):
 * (Leave field empty)
 * ¡Hi, ! Welcome to the program.
 */

 import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingsProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Personalized Greeting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JTextField fieldName = new JTextField();
        fieldName.setBounds(50, 30, 150, 25);
        frame.add(fieldName);

        JButton greetButton = new JButton("Greet");
        greetButton.setBounds(80, 70, 100, 30);
        frame.add(greetButton);

        JLabel greetTag = new JLabel("");
        greetTag.setBounds(40, 120, 250, 25);
        frame.add(greetTag);

        greetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fieldName.getText();
                greetTag.setText("¡Hi, " + name + "! Welcome to the program.");
            }
        });

        frame.setVisible(true);
    }
}