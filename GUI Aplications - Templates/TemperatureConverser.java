/**
 * TOPIC: GUI Applications with Swing (Absolute Layout)
 * LEVEL: Beginner
 * DESCRIPTION: A temperature converter application using Java Swing.
 * The user enters a temperature in Celsius, clicks the "Convert" button,
 * and the program displays the equivalent temperature in Fahrenheit.
 *
 * LEARNING OBJECTIVES:
 * - Create a JFrame window with an absolute layout (null layout)
 * - Position components using setBounds() (x, y, width, height)
 * - Use JTextField for user input
 * - Use JButton to trigger an action
 * - Use JLabel to display the result
 * - Implement ActionListener to handle button clicks
 * - Handle NumberFormatException for invalid input
 *
 * KEY CONCEPTS:
 * - Absolute layout: Components are placed at specific coordinates
 * - setBounds(): Defines position and size of each component
 * - Conversion formula: °F = (°C × 9/5) + 32
 * - Exception handling: Try-catch for parsing errors
 *
 * EXAMPLE OUTPUT:
 * (When user enters 25 and clicks "Convert"):
 * 25.0 °C = 77.0 °F
 *
 * (When user enters invalid text):
 * Error: enter a valid number.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TemperatureConverser extends JFrame implements ActionListener {
    private final JTextField txtCelsius;
    private final JLabel lblResult;
    private JButton btnConvert;

    public TemperatureConverser() {
        setTitle("Temperature Converser");
        setSize(300, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblCelsius = new JLabel("Degrees °C:");
        lblCelsius.setBounds(30, 20, 80, 25);
        add(lblCelsius);

        txtCelsius = new JTextField();
        txtCelsius.setBounds(120, 20, 100, 25);
        add(txtCelsius);

        btnConvert = new JButton("Convert");
        btnConvert.setBounds(100, 60, 100, 25);
        btnConvert.addActionListener(this);
        add(btnConvert);

        lblResult = new JLabel("");
        lblResult.setBounds(80, 100, 200, 25);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double celsius = Double.parseDouble(txtCelsius.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            lblResult.setText(celsius + " °C = " + fahrenheit + " °F");
        } catch (NumberFormatException ex) {
            lblResult.setText("Error: enter a valid number.");
        }
    }

    static void main(String[] args) {
        new TemperatureConverser();
    }
}