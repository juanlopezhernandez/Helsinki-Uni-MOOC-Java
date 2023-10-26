/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class Container {
    
    private int container;
    
    public Container(){
        this.container = 0;
    }
    
    public int contains(){
        return this.container;
    }
    
    public void add(int amount){
        this.container+=amount;
    }
    
    public void remove(int amount){
        this.container-=amount;
    }
    
    public String toString(){
        return contains()+"/100";
    }
    
}
