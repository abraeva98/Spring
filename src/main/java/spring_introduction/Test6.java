/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author irinaabraeva
 */
public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        Person person = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
//        person.callYourPet();
        
//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();
        context.close();
    }
}
