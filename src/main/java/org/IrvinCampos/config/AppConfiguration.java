package org.IrvinCampos.config;

import org.IrvinCampos.Alien;
import org.IrvinCampos.Computer;
import org.IrvinCampos.Desktop;
import org.IrvinCampos.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.IrvinCampos")
public class AppConfiguration {
    //@Qualifier("desktop")
//    @Bean
//    public Alien alien(Computer computer)  {
//        Alien alien = new Alien();
////        alien.setAge(25);
//        alien.setComputer(computer);
//        return alien;
//    }
//
//    @Bean
//    @Primary
//
//    //@Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
