package org.example.array;

import org.example.generic.Pair;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 1);    
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }

}
