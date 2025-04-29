/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;
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
    
    public final ArrayList<Resistor> resistors;
    
    private Circuit() {
        resistors = new ArrayList<>();
    }
    
    public void add(Resistor r){
        resistors.add(r);
    }
    
    @Override
    public String toString(){
        String allresistors = "";
        for(int i = 0; i < resistors.size(); i++){
            allresistors = allresistors.concat((resistors.get(i)).toString());
        }
        return allresistors;
    }
}
