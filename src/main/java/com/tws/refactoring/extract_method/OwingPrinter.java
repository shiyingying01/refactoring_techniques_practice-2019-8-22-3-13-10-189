package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double totalAmount = 0.0;

        // print banner
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");

        // print owings
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            totalAmount += each.getAmount();
        }

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + totalAmount);
    }
}



