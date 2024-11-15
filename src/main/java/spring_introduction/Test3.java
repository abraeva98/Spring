/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author irinaabraeva
 */
public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //    Pet pet = context.getBean("myPet", Pet.class);
    //    Person person = new Person(pet);
      //  Person person = context.getBean("myPerson", Person.class);
     //   person.callYourPet();
    
        
        context.close();
    }
}
