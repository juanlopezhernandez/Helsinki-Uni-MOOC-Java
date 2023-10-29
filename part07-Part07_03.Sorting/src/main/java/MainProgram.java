
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
     //length=9 index= 0-8      0   1    2  3  4  5  6  7  8
        int[] arrayOfNumbers = {3, 7 , -19, 1, 7, 5, 3,-5 , 5};
        
//        System.out.println("Smallest: " + MainProgram.smallest(arrayOfNumbers) );
//        System.out.println("Index of the Smallest: " + MainProgram.indexOfSmallest(arrayOfNumbers));
//        System.out.println("Index of the Smallest from: " + MainProgram.indexOfSmallestFrom(arrayOfNumbers,3));
//        System.out.println(Arrays.toString(arrayOfNumbers));
        MainProgram.sort(arrayOfNumbers);
    }
    
    public static int smallest(int[] array){        
        int hold = array[0];   
        
        for (int i=0; i<=(array.length-1); i++){
            if (array[i] < hold){
                hold = array[i];                
            }
        }       
        return hold;
    }
    
    public static int indexOfSmallest(int[] array){        
        int hold = array[0];//the value of index 0 of array set to hold
        int index = 0;  //will hold index from for loo-
       
        for (int i=0; i<(array.length-1); i++){
            //finds the smallest number sets it to hold
            if (array[i] < hold){               
                hold = array[i];              
            }
            //hold is then compared to the array [i] which equals the smallest inhold
            if (array[i] == hold){
             index = i;
            }                
        }
        //prints the index
       return index;             
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int hold = array[startIndex];
        int index = 0; 
        
        for (int i=startIndex; i<=(array.length-1); i++){
            if (array[i] < hold){               
                hold = array[i];              
            }
            if (array[i] == hold){
             index = i;
            }                
        }
    return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        //index1 is set to hold
        int hold = array[index1];
        //index2 is set to index1
        array[index1]=array[index2]; 
        //hold, which is set to index one before, is set to index2
        array[index2] = hold;        
    }
    public static void sort(int[] array){
        //go thro array, find the smallest, swap indexes from starting to where
        //smallest is, then start from one that index, print out list every time
       // MainProgram.indexOfSmallestFrom(array, 0);
       
        for(int i=0; i<=array.length-1;i++){
                int smallestindex = MainProgram.indexOfSmallestFrom(array, i);
                MainProgram.swap(array ,smallestindex,i );
                 System.out.println(Arrays.toString(array));
                 //counter++;
            }    
        
    }
}
