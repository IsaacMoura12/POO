package Aula11;

import java.util.List;
import java.util.ArrayList;

public class GradebookTester {
    public static void main(String[] args) {
        // Create a new Gradebook instance
        GradeBook gradebook = new GradeBook();
       

        // Load the student data from a text file
        gradebook.load("src/Aula11/alunos.txt");

        // Add a new student to the collection
        Student newStudent = new Student("Johny May", new ArrayList<>(List.of(10.0, 15.0, 19.0)));
        gradebook.addStudent(newStudent);
        System.out.println();

        // Add student that has the same name and grades as another
        Student newStudent2 = new Student("Johny May", new ArrayList<>(List.of(10.0, 15.0, 19.0)));
        gradebook.addStudent(newStudent2);
        System.out.println();

        // Remove a student from the collection
        gradebook.removeStudent("Jane Smith");
        System.out.println();


        // Retrieve a student from the collection
        Student student = gradebook.getStudent("John Doe");
        System.out.println(student);
        System.out.println();


       
       

        // Calculate the average grade for a specific student
        double averageGrade = gradebook.calculateAverageGrade("John Doe");
        System.out.println("Average grade for John Doe: " + averageGrade);
        System.out.println();


        // Calculate all grades
        gradebook.calculateAllGrades();


        // Print a summary of all students in the collection
        gradebook.printAllStudents();
    }
}

