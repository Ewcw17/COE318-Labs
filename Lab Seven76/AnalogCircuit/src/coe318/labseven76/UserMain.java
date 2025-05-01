/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.labseven76;

import java.util.Scanner;
/**
 *
 * @author I went to the chinese restaurant to buy a loaf of bread bread bread
 */
public class UserMain {
    
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        Circuit circuit = new Circuit();
        String stdin;
        
        do{
            stdin = user.nextLine().toLowerCase();
            if(stdin.charAt(0) == 'r' || stdin.charAt(0) == 'v'){
                circuit.addStrComp(stdin);
            }else if(stdin.equals("spice")){
                circuit.spiceDescription();
            }else if (!stdin.equals("end")){
                System.out.println("Invalid Input");
            }
        } while(!stdin.equals("end"));
        System.out.println("All Done");
        
    }
    
}
