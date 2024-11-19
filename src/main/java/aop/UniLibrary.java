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
    
    public String returnBook() {
        System.out.println("We return a book to Uni Library");
        return "Hello";
    }
    
    public void getMagazine() {
        System.out.println("Get a magazine from Uni Library");
    }
}
