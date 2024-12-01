package aop;


import aop.MyConfig;
import aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irinaabraeva
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        
     //   AbstractLibrary library1 = context.getBean("schoolLibrary", AbstractLibrary.class);
        //library1.getBook();
        
        Book book = context.getBean("book", Book.class);
      //  uniLibrary.getBook();
  /*      uniLibrary.returnBook();
        
        uniLibrary.returnMagazine();*/
        uniLibrary.addBook("Irina", book);
        uniLibrary.addMagazine();
        context.close();
    }
}
