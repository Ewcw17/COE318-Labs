/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Estelle Bright
 */
public class Resistor {
    double resistance;
    Node node1;
    Node node2;
    static int nextid = 1;
    int id;
    
    public Resistor(double resistance, Node node1, Node node2){
        System.out.println("made it");
        if(resistance < 0){
            throw new IllegalArgumentException("resistance cannot be negative");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.id = nextid;
        nextid++;
        
        Circuit cir = Circuit.getInstance();
        cir.add(this);
    }
    
    public Node[] getNodes(){
        Node[] nodes = new Node[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        
        return nodes;
    }
    
    @Override
    public String toString(){
        return ("R" + this.id + " " + this.getNodes()[0] + " " +
                this.getNodes()[1] + " " + this.resistance + " ");
    }
    
}
