/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.labseven76;

/**
 *
 * @author Fartnite
 */
public class Node {
    static int nextid = 0;
    int id;
    
    public Node(){
        this.id = nextid;
        nextid++;
        
    }
    public int getNode(){
        return id;
    }
    
    @Override
    public String toString(){
       return String.valueOf(id); 
    }
}
