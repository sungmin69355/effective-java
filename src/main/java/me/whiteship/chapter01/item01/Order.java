package me.whiteship.chapter01.item01;

import java.util.*;
import java.util.stream.Collectors;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.stream(OrderStatus.values()).collect(Collectors.toList()));
    }

}
