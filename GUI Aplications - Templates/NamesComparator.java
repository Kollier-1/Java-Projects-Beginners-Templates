/**
 * TOPIC: GUI Applications with Swing (Absolute Layout)
 * LEVEL: Beginner
 * DESCRIPTION: A simple GUI application that compares two names
 * entered by the user. The program checks if the names are the same
 * regardless of case (case-insensitive comparison).

 * LEARNING OBJECTIVES:
 * - Create a JFrame window with an absolute layout (null layout)
 * - Position components using setBounds() (x, y, width, height)
 * - Use two JTextField components for user input
 * - Use JButton to trigger the comparison
 * - Use JLabel to display the result
 * - Implement ActionListener to handle button clicks
 * - Use trim() to remove leading/trailing whitespace
 * - Use equalsIgnoreCase() for case-insensitive string comparison

 * KEY CONCEPTS:
 * - Absolute layout: Components are placed at specific coordinates
 * - setBounds(): Defines position and size of each component
 * - trim(): Removes whitespace from both ends of a string
 * - equalsIgnoreCase(): Compares strings ignoring case differences
 * - Event-driven programming: Responding to button clicks

 * EXAMPLE INPUT:
 * Name 1: Alice
 * Name 2: alice

 * EXAMPLE OUTPUT:
 * The names are same

 * EXAMPLE INPUT:
 * Name 1: Alice
 * Name 2: Bob

 * EXAMPLE OUTPUT:
 * The names are different
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NamesComparator extends JFrame implements ActionListener {
    private final JTextField txtName1, txtName2;
    private final JLabel lblResult;
    private final JButton btnCompare;

    public NamesComparator() {
        setTitle("Name's Comparator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl1 = new JLabel("Name 1:");
        lbl1.setBounds(30, 20, 80, 25);
        add(lbl1);

        txtName1 = new JTextField();
        txtName1.setBounds(120, 20, 120, 25);
        add(txtName1);

        JLabel lbl2 = new JLabel("Name 2:");
        lbl2.setBounds(30, 60, 80, 25);
        add(lbl2);

        txtName2 = new JTextField();
        txtName2.setBounds(120, 60, 120, 25);
        add(txtName2);

        btnCompare = new JButton("Compare");
        btnCompare.setBounds(90, 100, 100, 25);
        btnCompare.addActionListener(this);
        add(btnCompare);

        lblResult = new JLabel("");
        lblResult.setBounds(90, 130, 200, 25);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name1 = txtName1.getText().trim();
        String name2 = txtName2.getText().trim();

        if (name1.equalsIgnoreCase(name2))
            lblResult.setText("The names are same");
        else
            lblResult.setText("The names are different");
    }

    static void main(String[] args) {
        new NamesComparator();
    }
}