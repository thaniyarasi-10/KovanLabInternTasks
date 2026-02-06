package com.kovan.enumtask.controller;

import com.kovan.enumtask.model.OrderState;
import com.kovan.enumtask.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/state")
    public OrderState currentState() {
        return orderService.getCurrentState();
    }

    @PostMapping("/move")
    public OrderState move(@RequestParam OrderState next) {
        return orderService.moveOrder(next);
    }
}

// For GET http:
// http://localhost:8080/order/state

// For POST http:
// http://localhost:8080/order/move?next=PROCESSING 
// We cannot give the DELIVERED as the next state from the PROCESSING state
// We cannot give the NEW as the next state from the PROCESSING state
