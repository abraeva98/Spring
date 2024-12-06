/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernate_test;

import hibernate_test.entity.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author irinaabraeva
 */
public class Test5 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            
//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);
//            
            session.createQuery("delete Employee where surname='Abraeva'").executeUpdate();
            session.getTransaction().commit(); // open
            
        }
    }
}
