package org.IrvinCampos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int age;
//    @Qualifier("desktop")
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object Created");
    }
    @ConstructorProperties({"age","computer"})
    public Alien(int age, Computer computer) {
        this.age = age;
        this.computer = computer;
    }

    public void code() {
        System.out.println("Coding");
        computer.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }
    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
