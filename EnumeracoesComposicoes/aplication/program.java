package aplication;

import java.util.Date;

import entities.Order;
import entitiesenums.ordersStatus;

public class program {
    public static void main(String[]args){
    Order order = new Order(1080, new Date(),entitiesenums.ordersStatus.PEDDING_PAYMENT);
    System.out.println(order);
    }
}
