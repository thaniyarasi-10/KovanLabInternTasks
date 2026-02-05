package com.kovan.composition.service;

import com.kovan.composition.model.Ram;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {

    private Ram ram = new Ram(8); // initial RAM

    public int getRam() {
        return ram.getRam();
    }

    //update new RAM (Task 2)
    public String upgradeRam(int newRam) {
        if (newRam > ram.getRam()) {
            ram = new Ram(newRam);
            return newRam + " GB is the new RAM";
        }
        return "New RAM is not updated";
    }
}
