/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author uniegupires
 */
public class Student {
    private String name;
    private String ra;
    private String course;
    private double grade1;
    private double grade2;
    private double avg;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }
    
    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    
    public double calcGrade(double n1, double n2) {
        this.grade1 = n1;
        this.grade2 = n2;
        this.avg = (this.grade1 + this.grade2) / 2;
        
        if (this.avg < 5) this.status = "SUBSTITUTIVA";
        if (this.avg >= 5) this.status = "APROVADO";
        
        return this.avg;
    }
    
    public void getInfo() {
        System.out.println("==== INFORMACOES DO ALUNO ====");
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("RA: %s\n", this.ra);
        System.out.printf("Curso: %s\n", this.course);
        System.out.printf("N1: %f\n", this.grade1);
        System.out.printf("N2: %f\n", this.grade2);
        System.out.printf("Media: %f\n", this.avg);
        System.out.printf("Este aluno possui o status %s\n", this.status);
    }
}
