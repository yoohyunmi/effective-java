package me.whiteship.item01;

import java.util.*;

import java.util.EnumSet;
import main.java.me.whiteship.item01.OrderStatus;

public class Order {

    // Type saved
    // 컴파일 시 잡아낼 수 있으므로 String, Int, Short 를 썼을 때보다 안전
    private OrderStatus orderStatus;

    public static void main(String[] args) {

        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        // for ( int i=0; i<OrderStatus.values().length; i++) {
        //     System.out.println(OrderStatus.values()[i]);
        // }

        Set<OrderStatus> enumSet = EnumSet<OrderStatus>();
        for(OrderStatus item : enumSet) {
            System.out.println(item + " is in the map.");
        }
    }

}
