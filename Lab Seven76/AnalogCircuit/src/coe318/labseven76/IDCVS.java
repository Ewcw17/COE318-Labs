/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.labseven76;

/**
 *
 * @author IDCVS stands for "INDEPENDANT DIRECT CURRENT(DC) VOLTAGE SOURCE"
 */
public class IDCVS extends Component{
    double volts;
    Node node1;
    Node node2;
    static int nextid = 1;
    int id;
    
    public IDCVS(double volts, Node node1, Node node2){
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("nodes can not be null");
        }
        this.node1 = node1;
        this.node2 = node2;
        this.volts = volts;
        id = nextid;
        nextid++;
        
        Circuit cir = Circuit.getInstance();
        cir.addComponent(this);
    }
    
    @Override
    public String spiceDescription(){
        return "V" + id + " " + node1.id + " " + node2.id + " DC " + volts;
    }
}
