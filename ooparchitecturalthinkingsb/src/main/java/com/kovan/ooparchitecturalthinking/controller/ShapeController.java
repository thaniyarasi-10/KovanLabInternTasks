package com.Kovan.OopArchitecturalThinking.Controller;

import com.Kovan.OopArchitecturalThinking.Service.ShapeService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/shape/")
public class ShapeController {
    private final ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping("total-area")

    public double getTotalArea(){
        return shapeService.calculateTotalArea();
    }

}
