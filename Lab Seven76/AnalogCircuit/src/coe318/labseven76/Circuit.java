/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.labseven76;
import java.util.ArrayList;

/**
 *
 * @author e225wong
 */

public class Circuit {
    
    private static Circuit instance = null;
    public static Circuit getInstance() {
    if (instance == null) {
        instance = new Circuit();
    }
    return instance;
    }
    
    public static ArrayList<Component> components;
    public final ArrayList<Node> nodes;
    
    public Circuit() {
        this.components = new ArrayList<>();
        nodes = new ArrayList<>();
    }
    
    public int biggerNumber(int one, int two){
        if(one > two){
            return one;
        }
        return two;
    }
    
    public void addComponent(Component c){
        this.components.add(c);
    }
    
    public void addStrComp(String input){
        //makes an array out of the given input, elements are
        //separated by spaces. Very inefficient.
        String[] ainput = input.split(" ");
        //This detemines how many nodes need to be created to match the demand
        //required nodes = Bigger node number - number of existing nodes + 1
        int noRequiredNodes = biggerNumber(Integer.parseInt(ainput[1]), 
                Integer.parseInt(ainput[2])) - (nodes.size()-1);
        // in case that all the nodes involved exist already, required ndoes is set to 0
        if(biggerNumber(Integer.parseInt(ainput[1]),Integer.parseInt(ainput[2])) < nodes.size()){
            noRequiredNodes = 0;
        }
        for(int i = 1; i <= noRequiredNodes; i++){
            nodes.add(new Node());
        }
        
        // creates components accordingly, they are automatically added to the components arrayList
        if(ainput[0].equals("r")){
            new Resistor(Double.parseDouble(ainput[3]), nodes.get(Integer.parseInt(ainput[1])), nodes.get(Integer.parseInt(ainput[2])));
            
        }else if(ainput[0].equals("v")){
            new IDCVS(Double.parseDouble(ainput[3]), nodes.get(Integer.parseInt(ainput[1])), nodes.get(Integer.parseInt(ainput[2])));
        }
    }
    
    public void spiceDescription(){
        for(int i = 0; i < this.components.size(); i++){
            System.out.println(this.components.get(i).spiceDescription());
        }
        
    }
}