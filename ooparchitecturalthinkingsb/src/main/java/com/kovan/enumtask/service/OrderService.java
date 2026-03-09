package com.kovan.enumtask.service;

import com.kovan.enumtask.model.Order;
import com.kovan.enumtask.model.OrderState;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final Order order = new Order(); // simple in-memory order

    public OrderState getCurrentState() {
        return order.getState();
    }

    public OrderState moveOrder(OrderState nextState) {
        order.moveTo(nextState);
        return order.getState();
    }
}
