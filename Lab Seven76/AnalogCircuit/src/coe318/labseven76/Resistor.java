/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.labseven76;

/**
 *
 * @author Jack Black
 */
public class Resistor extends Component {
    double resistance;
    Node node1;
    Node node2;
    static int nextid = 1;
    int id;
    
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance < 0){
            throw new IllegalArgumentException("resistance cannot be negative");
        }
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("nodes can not be null");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.id = nextid;
        nextid++;
        
        Circuit cir = Circuit.getInstance();
        cir.addComponent(this);
    }
    
    public Node[] getNodes(){
        Node[] nodes = new Node[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        
        return nodes;
    }
    
    public String spiceDescription(){
       return ("R" + this.id + " " + this.node1 + " " +
                this.node2 + " " + this.resistance + " ");
    }
    
}
