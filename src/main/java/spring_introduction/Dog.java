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
//@Component("dogBean")
public class Dog implements Pet {
   // private String name;
    public Dog() {
        System.out.println("Dog is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init() {
        System.out.println("init");
    }
    
    public void destroy() {
        System.out.println("destroy");
    }
    /**
     * @return the name
     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * @param name the name to set
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
}
