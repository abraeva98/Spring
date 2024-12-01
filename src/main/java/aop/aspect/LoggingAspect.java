/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.aspect;
import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;

/**
 *
 * @author irinaabraeva
 */
@Component
@Aspect
@Order(1)
public class LoggingAspect {
    /*
    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {};
    
    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {};
    
    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()") 
    private void allMethodsExceptReturnMagazineFromUniLibrary() {};
    
    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: log #10");
    }*/
    /*
    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {};
    
    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {};
    
    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {};
    
    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }
    
    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    } 
    
    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnMethodsFromUniLibrary() {
        System.out.println("beforeGetAndReturnMethodsFromUniLibrary: writing Log #3");
    }*/
    //@Before("execution(public void aop.UniLibrary.getBook())")
 /*
    @Pointcut("execution(* get*())")
    private void allGetMethods(){};
           
    
    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: trying to return a book");
    }
    */
    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature =  " + methodSignature);
        System.out.println("methodSignature.getMethod() =  " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() =  " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() =  " + methodSignature.getName());
        System.out.println("beforeGetLoggingAdvice: trying to get a book");
        System.out.println("----------------------------");
        
        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments) {
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Book info: name - " + myBook.getName() + " author - " + myBook.getAuthor() + " year - " + myBook.getYearOfPublication());
                } else if(obj instanceof String) {
                    System.out.println("The book was added by " + obj);
                }
            }
        }
    }
}
