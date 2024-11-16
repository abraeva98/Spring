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
public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        
        System.out.println(myDog == yourDog); // true
        System.out.println(myDog.toString());
        System.out.println(yourDog.toString());
        
        myDog.setName("Belka");
        yourDog.setName("Strelka");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());
    }
}
