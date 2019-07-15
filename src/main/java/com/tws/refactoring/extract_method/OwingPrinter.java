package com.tws.refactoring.extract_method;

import java.util.*;

public class OwingPrinter {
   public void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;
        // print owings
       outstanding=calculateAmount(elements);

        printBanner();
        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    public double calculateAmount(Iterator<Order> elements){
        double outstanding = 0.0;
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    public void printBanner(){
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
