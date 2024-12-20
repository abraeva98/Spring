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
public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.callYourPet();
//        Cat myCat = context.getBean("catBean", Cat.class);
        
        context.close();
    }
}
