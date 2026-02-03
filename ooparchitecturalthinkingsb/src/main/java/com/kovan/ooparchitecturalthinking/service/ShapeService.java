package com.Kovan.OopArchitecturalThinking.Service;

import com.Kovan.OopArchitecturalThinking.Model.Circle;
import com.Kovan.OopArchitecturalThinking.Model.Shape;
import com.Kovan.OopArchitecturalThinking.Model.Square;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    public double calculateTotalArea(){
        Shape [] shapes = new Shape[]{
                new Circle(5),
                new Square(5)
        };

        double totalArea= 0;

        for(Shape shape: shapes){
            totalArea += shape.area();
        }

        return  totalArea;
    }
}
