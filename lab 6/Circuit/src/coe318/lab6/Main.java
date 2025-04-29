package coe318.lab6;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();

        Resistor r1 = new Resistor(30, n1, n2);
        Resistor r2 = new Resistor(50, n2, n3);

        System.out.println(Circuit.getInstance());
    }
}
