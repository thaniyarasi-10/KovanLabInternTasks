package com.kovan.enumtask.model;

public enum OrderState {

    NEW {
        @Override
        public boolean canTransitionTo(OrderState next) {
            return next == PROCESSING;
        }
    },

    PROCESSING {
        @Override
        public boolean canTransitionTo(OrderState next) {
            return next == SHIPPED;
        }
    },

    SHIPPED {
        @Override
        public boolean canTransitionTo(OrderState next) {
            return next == DELIVERED;
        }
    },

    DELIVERED {
        @Override
        public boolean canTransitionTo(OrderState next) {
            return false;
        }
    };

    public abstract boolean canTransitionTo(OrderState next);
}
