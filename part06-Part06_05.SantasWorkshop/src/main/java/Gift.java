/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class Gift {
    private String nameOnGift;
    private int weightOfGift;
    
    public Gift(String name, int weight){
        this.nameOnGift = name;
        this.weightOfGift = weight;
    }
    
    public String getName(){
        return this.nameOnGift;
    }
    
    public int getWeight(){
        return this.weightOfGift;
    }
    
    public String toString(){
        return this.getName() + " (" + this.getWeight() + " kg)";
    }
    
}
