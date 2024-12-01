/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */
@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAspect: trying to return a book to the library");
        
        long begin = System.currentTimeMillis();
        System.out.println(begin);
        Object res = proceedingJoinPoint.proceed();   
        
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("aroundReturnBookLoggingAspect: returned a book to the library");
        System.out.println("aroundReturnBookLoggingAspect: method return book took " + (end - begin) + " ms to complete");
        return res;
    }
}
