/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */
//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
