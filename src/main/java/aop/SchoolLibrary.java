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
public class SchoolLibrary extends AbstractLibrary {
 //   @Override
    public void getBook() {
        System.out.println("Get a book from school library");
    }
}
