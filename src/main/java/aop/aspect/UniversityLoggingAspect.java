/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */
@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: logging before getStudents");
//    }
//    
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade += 1;
//        firstStudent.setAvgGrade(avgGrade);
//        System.out.println("afterGetStudentsLoggingAdvice: logging after getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: logging exception " + exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudents() {
        System.out.println("afterGetStudents: logging regardless of status");
    }
}

