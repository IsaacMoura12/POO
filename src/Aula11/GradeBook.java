package Aula11;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GradeBook implements IGradeCalculator {
    private List<Student> students;

    GradeBook(){
        students = new ArrayList<>();

    }


    public double calculate(List<Double> grades){

        double soma = 0;
        for(Double nota : grades){
            soma = soma + nota;
        }

        double media = soma /grades.size();
        return media;
    }

    
}
