/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author irinaabraeva
 */
public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}
