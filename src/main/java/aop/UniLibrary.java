/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop;

import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */
@Component
public class UniLibrary extends AbstractLibrary {
   // @Override
    public void getBook() {
        System.out.println("Get a book from Uni Library ");
        System.out.println("----------------------------");
    }
    
    public String returnBook() {
        double k = 10 / 0;
        System.out.println("We return a book to Uni Library");
        System.out.println("----------------------------");
        return "War and Piece";
    }
    
    public void returnMagazine() {
        System.out.println("We return a magazine to Uni Library");
        System.out.println("----------------------------");
    }
    
    public void addBook(String person_name, Book book) {
        System.out.println("We're adding a book to Uni Library");
        System.out.println("----------------------------");
    }
    
    public void addMagazine() {
        System.out.println("We're adding a magazine to Uni Library");
        System.out.println("----------------------------");
    }
}
