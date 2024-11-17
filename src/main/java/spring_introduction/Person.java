/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */
@Component("personBean")

public class Person {
 //   @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
  //  @Value("${person.surname}")
    private String surname;
  //  @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }
//    @Autowired
//    public Person(@Qualifier("dogBean") Pet pet) {
//        System.out.println("Person is created");
//        this.pet = pet;
//    }
//    
//    public Person() {
//        System.out.println("Person without arg is created");
//    }
//    
    // name="pet" -> setPet
   // @Autowired
  //  @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    
    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
