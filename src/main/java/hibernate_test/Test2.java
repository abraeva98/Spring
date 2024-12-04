/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author irinaabraeva
 */
public class Test2 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Andrey", "Abraev", "IT", 1000);
            session.beginTransaction(); // open
            session.save(emp); // insert
            //session.getTransaction().commit(); // close 
            
            int myId = emp.getId();
            session = factory.getCurrentSession();
            //session.beginTransaction();
            Employee employee = session.get(Employee.class, myId); // get = select
            // in sql transactions are under the hood but in hibernate we need to specify it
            session.getTransaction().commit();
            System.out.println(employee);
        }
    }
}
