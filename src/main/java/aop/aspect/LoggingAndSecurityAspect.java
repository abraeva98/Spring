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
    //@Before("execution(public void aop.UniLibrary.getBook())")
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
    }
}
