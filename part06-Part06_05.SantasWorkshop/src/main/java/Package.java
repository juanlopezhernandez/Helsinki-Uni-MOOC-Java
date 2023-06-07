
import java.util.ArrayList;

 /* @author juanlopez
 */
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList();
    }
    
    public void addGift (Gift gift){
        this.gifts.add(gift);
    }
    public void clearList(){
        this.gifts.clear();
    }
    
    public int totalWeight (){
        int pesoTotal = 0;
        
        for (Gift variable : gifts){
            pesoTotal += variable.getWeight();
        }
        
        return pesoTotal;
                                
    }    
}
