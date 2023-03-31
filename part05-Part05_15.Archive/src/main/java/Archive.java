/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive (String id, String name){
        this.identifier = id;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public String getidentifier(){
        return this.identifier;
    }
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
        return false;
        }
        
        Archive comparedItem = (Archive) compared;
        if(this.identifier.equals(comparedItem.identifier) ){
            return true;
        }
        
        return false;
    }
    
}
