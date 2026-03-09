package org.IrvinCampos.config;

import org.IrvinCampos.model.Alien;
import org.IrvinCampos.model.Computer;
import org.IrvinCampos.model.Desktop;
import org.IrvinCampos.model.Laptop;
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
