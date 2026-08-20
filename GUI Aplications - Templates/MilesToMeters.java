/**
 * TOPIC: GUI Applications with Swing (Unit Conversion)
 * LEVEL: Beginner
 * DESCRIPTION: A simple GUI application that converts miles to meters
 * using the conversion factor: 1 mile = 1609.34 meters. The user enters
 * a value in miles, and the program displays the equivalent in meters.

 * LEARNING OBJECTIVES:
 * - Create a JFrame window with an absolute layout (null)
 * - Position components using setBounds()
 * - Use JTextField for user input
 * - Use JButton to trigger the conversion
 * - Use JLabel to display the result
 * - Implement an anonymous ActionListener for event handling
 * - Handle NumberFormatException for invalid input
 * - Format output using String.format()

 * KEY CONCEPTS:
 * - Unit conversion: 1 mile = 1609.34 meters
 * - Absolute layout: Components placed at specific coordinates
 * - setBounds(): Defines position and size of each component
 * - Event-driven programming: Responding to button clicks
 * - Exception handling: Try-catch for parsing errors
 * - String.format(): Formats the output with two decimal places

 * EXAMPLE INPUT:
 * (Enter 5 in the text field)
 * Result: 8046.70 meters

 * EXAMPLE INPUT (invalid):
 * (Enter "abc")
 * Please enter a valid number.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilesToMeters {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Miles to Meter Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JTextField fieldMiles = new JTextField();
        fieldMiles.setBounds(50, 30, 150, 25);
        frame.add(fieldMiles);

        JButton ConvertButton = new JButton("Convert");
        ConvertButton.setBounds(80, 70, 100, 30);
        frame.add(ConvertButton);

        JLabel ResultTag = new JLabel("Result: ");
        ResultTag.setBounds(60, 120, 200, 25);
        frame.add(ResultTag);

        ConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double miles = Double.parseDouble(fieldMiles.getText());
                    double meters = miles * 1609.34;
                    ResultTag.setText(String.format("Result: %.2f meters", meters));
                } catch (NumberFormatException ex) {
                    ResultTag.setText("Please enter a valid number.");
                }
            }
        });

        frame.setVisible(true);
    }
}