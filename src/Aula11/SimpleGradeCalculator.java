package Aula11;


import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator {


    private double grade;
    protected List<Double> grades;

    SimpleGradeCalculator(List<Double> grades){

        assert grade>=0;
        this.grades = grades;
        this.grade = calculate(grades);
        
    }

    public double getMedia(){
        return this.grade;
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
