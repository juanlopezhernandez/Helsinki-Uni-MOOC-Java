

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
           System.out.println(i);
            i++;
           
           }
        for (int r = 1; r<=number; r++){
               System.out.println(r);
        }
    }
}        
        