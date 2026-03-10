package org.IrvinCampos;

import org.IrvinCampos.config.AppConfiguration;
import org.IrvinCampos.model.Alien;
import org.IrvinCampos.model.Laptop;
import org.IrvinCampos.service.LaptopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        LaptopService laptopService = applicationContext.getBean(LaptopService.class);
        laptopService.addLaptop(new Laptop());

        Laptop laptop = applicationContext.getBean(Laptop.class);


//        Alien alien= applicationContext.getBean("alien", Alien.class);
//        Alien alien = applicationContext.getBean(Alien.class);
//        alien.setAge(21);
//        System.out.println(alien.getAge());
//        alien.code();

//        with naming
//        Desktop desktop = applicationContext.getBean("desktop",Desktop.class);

//        Desktop desktop = applicationContext.getBean(Desktop.class);
//        desktop.compile();
//
//        Desktop desktop1 = applicationContext.getBean(Desktop.class);
//        desktop1.compile();

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