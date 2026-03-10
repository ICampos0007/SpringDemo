package org.IrvinCampos.service;

import org.IrvinCampos.repository.LaptopRepository;
import org.IrvinCampos.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public boolean isGoodForProgramming() {
        return true;
    }
}
