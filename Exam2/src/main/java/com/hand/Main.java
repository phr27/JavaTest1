package com.hand;

public class Main {

    public static void main(String[] args) {
        Calc c = Calc.getInstance();
        System.out.println("userA: " + c.calc(5000));
        System.out.println("userB: " + c.calc(10000));
        System.out.println("userC: " + c.calc(15000));
        System.out.println("userD: " + c.calc(60000));
    }
}
