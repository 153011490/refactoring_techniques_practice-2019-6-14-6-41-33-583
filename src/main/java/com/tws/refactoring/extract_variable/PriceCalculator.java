package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    private static final int OFF_QUANTITY= 500;
    private static final double OFF_DISCOUNT = 0.05;
    private static final double SHIPPING_COST_DISCOUNT = 0.1;
    private static final double MAX_SHIPPING_COST = 100;


    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        return quantity * itemPrice -
                Math.max(0, quantity - OFF_QUANTITY) * itemPrice * OFF_DISCOUNT +
                Math.min(quantity * itemPrice * SHIPPING_COST_DISCOUNT, MAX_SHIPPING_COST);

    }
}
