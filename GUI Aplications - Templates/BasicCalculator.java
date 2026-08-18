/**  * TOPIC: GUI Applications with Swing
 * LEVEL: Beginner
 * DESCRIPTION: A basic calculator application using Java Swing.
 * It allows the user to enter two numbers and perform addition,
 * subtraction, multiplication, and division operations.

 * LEARNING OBJECTIVES:
 * - Create a JFrame window with a GridLayout
 * - Use JTextField for numeric input
 * - Use JButton for operation buttons
 * - Use JLabel to display results
 * - Implement ActionListener to handle button events
 * - Handle NumberFormatException for invalid input

 * KEY CONCEPTS:
 * - JFrame: The main window container
 * - GridLayout: Arranges components in a grid
 * - ActionListener: Interface for handling button clicks
 * - Event-driven programming: Responding to user actions
 * - Exception handling: Try-catch for parsing errors

 * EXAMPLE OUTPUT:
 * (When user enters 10 and 5, then clicks "Sum"):
 * Result: 15.0

 * (When user enters invalid text):
 * Error: write valid numbers.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BasicCalculator extends JFrame implements ActionListener {
    private final JTextField txtNum1, txtNum2;
    private final JLabel lblResult;
    private final JButton btnSum;
    private final JButton btnSubtract;
    private final JButton btnMulti;
    private final JButton btnDiv;

    public BasicCalculator() {
        setTitle("Basic Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Number 1:"));
        txtNum1 = new JTextField();
        add(txtNum1);

        add(new JLabel("Number 2:"));
        txtNum2 = new JTextField();
        add(txtNum2);

        btnSum = new JButton("Sum");
        btnSubtract = new JButton("Subtract");
        btnMulti = new JButton("Multiplication");
        btnDiv = new JButton("Division");

        btnSum.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMulti.addActionListener(this);
        btnDiv.addActionListener(this);

        add(btnSum);
        add(btnSubtract);
        add(btnMulti);
        add(btnDiv);

        lblResult = new JLabel("Result: ");
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double result = 0;

            if (e.getSource() == btnSum) result = num1 + num2;
            else if (e.getSource() == btnSubtract) result = num1 - num2;
            else if (e.getSource() == btnMulti) result = num1 * num2;
            else if (e.getSource() == btnDiv) result = num1 / num2;

            lblResult.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            lblResult.setText("Error: write valid numbers.");
        }
    }

    static void main(String[] args ) {
        new BasicCalculator();
    }
}