/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author irinaabraeva
 */
@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_introduction") - looks for annotations
public class MyConfig {
    // only this bean is created
    @Bean // we will create only this bean
    @Scope("singleton")
    // method name is bean id
    public Pet catBean() {
        return new Cat();
    }
    
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
