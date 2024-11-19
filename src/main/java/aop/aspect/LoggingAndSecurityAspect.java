/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.aspect;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 *
 * @author irinaabraeva
 */
@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {};
    
    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {};
    
    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()") 
    private void allMethodsExceptReturnMagazineFromUniLibrary() {};
    
    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: log #10");
    }
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
            
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: trying to get a book");
    }
    
    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: trying to return a book");
    }
    
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check security");
    }*/
}
