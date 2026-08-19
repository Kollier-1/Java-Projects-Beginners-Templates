/**
 * TOPIC: GUI Applications with Swing (Anonymous ActionListener)
 * LEVEL: Beginner
 * DESCRIPTION: A simple GUI application that adds two numbers entered
 * by the user. It uses an anonymous ActionListener class to handle
 * button clicks, demonstrating a different approach from implementing
 * the ActionListener interface directly.

 * LEARNING OBJECTIVES:
 * - Create a JFrame window with an absolute layout
 * - Use JTextField for user input
 * - Use JButton to trigger the addition
 * - Use JLabel to display the result
 * - Implement an anonymous ActionListener class for event handling
 * - Handle NumberFormatException for invalid input

 * KEY CONCEPTS:
 * - Anonymous inner class: A class defined inline for event handling
 * - ActionListener: Functional interface for button click events
 * - setBounds(): Position components with absolute layout
 * - Double.parseDouble(): Convert string to double
 * - Exception handling: Try-catch for parsing errors

 * EXAMPLE INPUT:
 * (Enter 25 in first field, 15 in second field)
 * Result: 40.0

 * EXAMPLE INPUT (invalid):
 * (Enter "abc" in first field)
 * Please enter valid numbers.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JTextField field1 = new JTextField();
        field1.setBounds(30, 30, 100, 25);
        frame.add(field1);

        JTextField field2 = new JTextField();
        field2.setBounds(150, 30, 100, 25);
        frame.add(field2);

        JButton sumButton = new JButton("Sum");
        sumButton.setBounds(90, 70, 100, 30);
        frame.add(sumButton);

        JLabel ResultTag = new JLabel("Result: ");
        ResultTag.setBounds(90, 120, 200, 25);
        frame.add(ResultTag);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(field1.getText());
                    double num2 = Double.parseDouble(field2.getText());
                    double sum = num1 + num2;
                    ResultTag.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    ResultTag.setText("Please enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}