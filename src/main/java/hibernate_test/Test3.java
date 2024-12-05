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
public class Test3 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            
            // List<Employee> emps = session.createQuery("from Employee").getResultList();
            // the key - firstName is referenced to class field and not column name, annotation column must be column name
            List<Employee> emps = session.createQuery("from Employee " + "where firstName='Kirill' and salary>650").getResultList();
            for(Employee e: emps) {
                System.out.println(e);
            }
            
            session.getTransaction().commit(); // open
            
        }
    }
}
