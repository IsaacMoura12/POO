package Aula11;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;


public class GradeBook  {
    private Map<Student, Double> students;

    GradeBook(){
        students = new TreeMap<>();

    }


    public void load(String file){

        //String separator = "|";
        try (Scanner scan = new Scanner(new File(file))){
            //scan.useDelimiter(separator);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] data = line.split("\\|");
                String name = data[0];
                List<Double> grades = new ArrayList<>();
    
                for (int i = 1; i < data.length; i++) {
                    grades.add(Double.parseDouble(data[i])); 
                } 

                Student student = new Student(name, grades);
                students.put(student, null);
               
            } scan.close();  
        
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void addStudent(Student student){
        if(students.containsKey(student)){
            System.out.println("Student already stored");

        } else {
            students.put(student, null);
            System.out.println("Student was stored");
        }
    }

    public void removeStudent(String student_toremove){
        Student removed = null;
        for(Map.Entry<Student, Double> entry : students.entrySet()){
            Student student = entry.getKey();
            if(student.getName().equals(student_toremove)){
                removed = student;
                students.remove(student);
                System.out.println("Removed Student " + student.getName());
                break;
            }
        } if (removed == null){
            System.out.println("Student does not exist");
        } 
    }

    public Student getStudent(String name){
        for(Map.Entry<Student, Double> entry : students.entrySet()){
            Student student = entry.getKey();
            if(student.getName().equals(name)){
                return student;
            }
        } 
        return null;
    }

    public double calculateAverageGrade(String name){
        for(Map.Entry<Student, Double> entry : students.entrySet()){
            Student student = entry.getKey();
            if(student.getName().equals(name)){
                List<Double> grades = student.getGrades();
                SimpleGradeCalculator calculator = new SimpleGradeCalculator(grades);
                students.put(student, calculator.getMedia());
                return calculator.getMedia();    
            }
        } 
        return 0;

    }

    public void calculateAllGrades(){
        for(Map.Entry<Student, Double> entry : students.entrySet()){
            Student student = entry.getKey();
            List<Double> grades = student.getGrades();
            SimpleGradeCalculator calculator = new SimpleGradeCalculator(grades);
            students.put(student, calculator.getMedia());    
            }
        } 

    

    public void printAllStudents(){
        for(Map.Entry<Student, Double> entry : students.entrySet()){
            Student student = entry.getKey();
            Double grade = entry.getValue();
        String name = String.format("%-20s", student.getName());
        String id = String.format("%-5s", student.getId());
        String finalGrade = String.format("%-5.2f", grade);
        System.out.println(id + " | " + name + " | Final Grade: " + finalGrade);
    }
}

    
}
