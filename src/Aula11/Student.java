package Aula11;

import java.util.List;

public class Student implements Comparable<Student>{

    private String name;
    private List<Double> grades;
    private int id;
    private static int id_iterator = 1000;


    public Student(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
        this.id = id_iterator++;
    }

    public String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }


    @Override
    public String toString(){
        return "Student " + this.getId() + ": "  + this.getName();
    }


    @Override
    public int compareTo(Student other){
         // Compare by name
         int cmp = this.name.compareTo(other.name);
         if (cmp != 0) {
             return cmp;
         }
         // If names are equal, compare by ID
         return Integer.compare(this.id, other.id);

    }
}
