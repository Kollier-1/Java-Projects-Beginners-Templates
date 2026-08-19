/**
 * TOPIC: File I/O (Writing Text Files)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates how to write data to a text file using
 * FileWriter. A simple Student class is defined with name and grade,
 * and two Student objects are written to a file in text format.

 * LEARNING OBJECTIVES:
 * - Create a simple class with fields, constructor, and toString()
 * - Use FileWriter to write text to a file
 * - Handle IOException using try-catch blocks
 * - Understand the importance of closing file resources
 * - Save object data in a human-readable text format

 * KEY CONCEPTS:
 * - FileWriter: A class for writing character files
 * - IOException: Exception that occurs during file operations
 * - toString(): Overridden to provide a readable representation
 * - try-catch: Handling potential errors during file I/O
 * - Resource management: Closing the writer to save changes
 * - File path: Students are saved to "students.txt"

 * EXAMPLE OUTPUT (console):
 * Student: Lucía, Grade: 8.5
 * Student: Pedro, Grade: 7.0

 * Data saved in alumnos.txt correctly.

 * FILE CONTENT (students.txt):
 * Student: Lucía, Grade: 8.5
 * Student: Pedro, Grade: 7.0
 */

import java.io.FileWriter;
import java.io.IOException;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Grade: " + grade;
    }
}

public class ShowDatesInText {
    public static void main(String[] args) {
        Student student1 = new Student("Lucía", 8.5);
        Student student2 = new Student("Pedro", 7.0);

        System.out.println(student1);
        System.out.println(student2);

        try {
            FileWriter writer = new FileWriter("students.txt");
            writer.write(student1.toString() + "\n");
            writer.write(student2.toString() + "\n");
            writer.close();
            System.out.println("\nData saved in alumnos.txt correctly.");
        } catch (IOException e) {
            System.out.println("There was an error writing the file.");
        }
    }
}