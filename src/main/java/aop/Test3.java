/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author irinaabraeva
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        
        System.out.println("Returning book " + bookName);
        context.close();  
        
        System.out.println("Method main ends");
    }
}
