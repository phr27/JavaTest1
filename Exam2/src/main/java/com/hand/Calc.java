package com.hand;

public class Calc {

    private static Calc ourInstance = new Calc();

    public static Calc getInstance() {
        return ourInstance;
    }

    private Calc() {
    }

    public double calc(double salary) {
        if (salary <= 1500) {
            return salary * 0.03;
        }
        if (salary <= 4500) {
            return 45 + (salary - 1500) * 0.1;
        }
        if (salary <= 9000) {
            return 345 + (salary - 4500) * 0.2;
        }
        if (salary <= 35000) {
            return 845 + (salary - 9000) * 0.25;
        }
        if (salary <= 55000) {
            return 7345 + (salary - 35000) * 0.3;
        }
        if (salary <= 80000) {
            return 13345 + (salary - 55000) * 0.35;
        }

        return 22095 + (salary - 80000) * 0.45;
    }
}
