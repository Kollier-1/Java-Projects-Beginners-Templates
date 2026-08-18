/**
 * TOPIC: GUI Applications with Swing (Event Handling)
 * LEVEL: Beginner
 * DESCRIPTION: A simple click counter application using Java Swing.
 * The user clicks a button, and the program tracks and displays the
 * total number of clicks. This demonstrates event-driven programming
 * and state management in GUI applications.

 * LEARNING OBJECTIVES:
 * - Create a JFrame window with an absolute layout
 * - Use JButton to trigger actions
 * - Use JLabel to display dynamic data
 * - Implement ActionListener to handle button clicks
 * - Maintain and update state (counter variable)
 * - Update UI elements in response to user interaction

 * KEY CONCEPTS:
 * - Event-driven programming: The program responds to user actions
 * - ActionListener: Interface that handles button click events
 * - State management: Using a variable (counter) to track application state
 * - UI update: Changing JLabel text to reflect new state
 * - ActionEvent: Object that contains information about the event

 * EXAMPLE OUTPUT:
 * (Initial window): Clicks: 0
 * (After 5 clicks): Clicks: 5
 * (After 10 clicks): Clicks: 10
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClickCounter extends JFrame implements ActionListener {
    private int counter = 0;
    private final JLabel IblCounter;
    private final JButton btnClick;

    public ClickCounter() {
        setTitle("Click Counter");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        btnClick = new JButton("Click Here");
        btnClick.setBounds(50, 30, 130, 30);
        btnClick.addActionListener(this);

        IblCounter = new JLabel("Clicks: 0");
        IblCounter.setBounds(90, 70, 100, 30);

        add(btnClick);
        add(IblCounter);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        IblCounter.setText("Clicks: " + counter);
    }

    static void main(String[] args) {
        new ClickCounter();
    }
}