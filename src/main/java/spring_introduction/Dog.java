/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

/**
 *
 * @author irinaabraeva
 */
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
