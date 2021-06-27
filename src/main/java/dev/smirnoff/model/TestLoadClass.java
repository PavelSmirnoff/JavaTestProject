package dev.smirnoff.model;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 14.05.2021
 */
class testA {
    {
        System.out.print("A1");
    }
    static {
        System.out.print("A2");
    }

    public testA() {
        System.out.print("A3");
    }
}

class testB extends testA {
    {
        System.out.print("B1");

    }
    static {
        System.out.print("B2");
    }

    public testB() {
        System.out.print("B3");
    }
}

public class TestLoadClass {
    public static void main(String[] args) {
        new testB();
    }
}
