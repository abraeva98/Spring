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
    }
    
    public void returnBook() {
        System.out.println("We return a book to Uni Library");
    }
    
    public void returnMagazine() {
        System.out.println("We return a magazine to Uni Library");
    }
    
    public void addBook() {
        System.out.println("We're adding a book to Uni Library");
    }
    
    public void addMagazine() {
        System.out.println("We're adding a magazine to Uni Library");
    }
}
