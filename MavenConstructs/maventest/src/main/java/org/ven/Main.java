package org.ven;
public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO!");
        org.ven.TestLogging tl = new org.ven.TestLogging();
        tl.bar();
        org.ven.AnotherComponent ac = new org.ven.AnotherComponent();
        ac.foo();
    }
}
