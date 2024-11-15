/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

/**
 *
 * @author irinaabraeva
 */
public class Person {
    private Pet pet;
    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }
    
    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
