/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author irinaabraeva
 */
@Component
public class Book {
    @Value("Преступление и наказание")
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
