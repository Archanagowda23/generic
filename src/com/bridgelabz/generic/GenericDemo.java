package com.bridgelabz.generic;

public class GenericDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to generic program");
        Generic<String> g1 = new Generic<String>("Archana");
        g1.show();
        System.out.println(g1.getObject());

        Generic<Integer> g2 = new Generic<Integer>(10);
        g2.show();
        System.out.println(g2.getObject());

        Generic<Double> g3 = new Generic<Double>(10.5);
        g3.show();
        System.out.println(g3.getObject());
    }

}

