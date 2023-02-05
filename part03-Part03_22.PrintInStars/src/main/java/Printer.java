
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0;i < array.length;i++){ 
            for (int r = 0; r < array[i];r++){ 
            System.out.print("*");
            }
            System.out.println("");
        } 
    }
}
/*
   
        int i = array[0];
        if (i<0){
        System.out.println("*");
        } else {
            
        }

*/