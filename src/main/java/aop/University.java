/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */

@Component
public class University {
    private List<Student> students = new ArrayList<>();
    
    public void addStudents() {
        Student st1 = new Student("Irina Abraeva", 4, 9);
        Student st2 = new Student("Anna Abraeva", 3, 10);
        Student st3 = new Student("Kirill Abraev", 2, 8);
        
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    
    public List<Student> getStudents() {
        System.out.println("Info from mathod getStudents:");
        System.out.println(students);
        return students;
    }
}
