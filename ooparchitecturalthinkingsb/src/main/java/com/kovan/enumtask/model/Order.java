package com.kovan.enumtask.model;

public class Order {

    private OrderState state = OrderState.NEW; // initially NEW

    public OrderState getState() {
        return state;
    }

    public void moveTo(OrderState nextState) {
        if (!state.canTransitionTo(nextState)) {
            throw new IllegalStateException(
                    "Invalid transition: " + state + " → " + nextState
            );
        }
        state = nextState;
    }
}
