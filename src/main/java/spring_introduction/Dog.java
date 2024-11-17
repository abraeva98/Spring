/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */
//@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {
   // private String name;
    public Dog() {
        System.out.println("Dog is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

 //   @PostConstruct
//    public void init() {
//        System.out.println("init");
//    }
//    
//  //  @PreDestroy
//    public void destroy() {
//        System.out.println("destroy");
//    }
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
