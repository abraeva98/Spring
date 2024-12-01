/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop;

/**
 *
 * @author irinaabraeva
 */
public class Student {

    public Student(String nameSurname, int course, double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }
    private String nameSurname;
    private int course;

    @Override
    public String toString() {
        return "Student{" + "nameSurname=" + nameSurname + ", course=" + course + ", avgGrade=" + avgGrade + '}';
    }
    private double avgGrade;

    /**
     * @return the nameSurname
     */
    public String getNameSurname() {
        return nameSurname;
    }

    /**
     * @param nameSurname the nameSurname to set
     */
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    /**
     * @return the course
     */
    public int getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(int course) {
        this.course = course;
    }

    /**
     * @return the avgGrade
     */
    public double getAvgGrade() {
        return avgGrade;
    }

    /**
     * @param avgGrade the avgGrade to set
     */
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
    
}
