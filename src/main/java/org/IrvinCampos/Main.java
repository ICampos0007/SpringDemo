package org.IrvinCampos;

import org.IrvinCampos.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Desktop desktop = applicationContext.getBean(Desktop.class);
        desktop.compile();

//        XML CONFIG Code Below

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien alien= applicationContext.getBean("alien", Alien.class);
//        Alien alien = applicationContext.getBean(Alien.class);
//        alien.setAge(21);
//        System.out.println(alien.getAge());
//        alien.code();

//        Alien alien2= (Alien) applicationContext.getBean("alien");
//        System.out.println(alien2.getAge());
//        alien2.code();

//        Laptop laptop = applicationContext.getBean("laptop", Laptop.class);
    }
}