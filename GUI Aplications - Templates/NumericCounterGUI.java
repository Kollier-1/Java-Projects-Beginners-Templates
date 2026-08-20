// Ejercicio 3 - Programación GUI:
// Diseña una aplicación gráfica con una ventana que muestre un contador numérico.-
/**
 * TOPIC: GUI Applications with Swing (FlowLayout & State Management)
 * LEVEL: Beginner
 * DESCRIPTION: A simple counter application with "Increase" and "Reboot"
 * buttons. The counter tracks the number of clicks and displays it in
 * a JLabel. This demonstrates state management, event handling, and
 * layout management in Swing.

 * LEARNING OBJECTIVES:
 * - Create a JFrame window with FlowLayout
 * - Use JLabel with custom font for display
 * - Use JButton for user interaction
 * - Manage state with a counter variable
 * - Implement ActionListener using anonymous inner classes
 * - Add functionality to increment and reset the counter

 * KEY CONCEPTS:
 * - FlowLayout: Components are arranged in a line, wrapping as needed
 * - State management: counter variable tracks the current count
 * - Event handling: ActionListener responds to button clicks
 * - Font customization: setFont() for visual styling
 * - Reset functionality: Reboot button resets counter to 0

 * EXAMPLE OUTPUT:
 * (Initial window): Counter: 0
 * (After 5 clicks): Counter: 5
 * (After clicking Reboot): Counter: 0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumericCounterGUI extends JFrame {

    private int counter = 0;
    private JLabel counterTag;

    public NumericCounterGUI() {
        setTitle("Simple Counter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        counterTag = new JLabel("Counter: 0");
        counterTag.setFont(new Font("Arial", Font.BOLD, 20));

        JButton IncreaseButton = new JButton("Increase");
        JButton RebootButton = new JButton("Reboot");

        IncreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterTag.setText("Counter: " + counter);
            }
        });

        RebootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                counterTag.setText("Counter: " + counter);
            }
        });

        add(counterTag);
        add(IncreaseButton);
        add(RebootButton);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumericCounterGUI();
    }
}