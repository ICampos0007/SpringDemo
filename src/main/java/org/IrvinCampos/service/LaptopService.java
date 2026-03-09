package org.IrvinCampos.service;

import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop() {
        System.out.println("method called.");
    }

    public boolean isGoodForProgramming() {
        return true;
    }
}
