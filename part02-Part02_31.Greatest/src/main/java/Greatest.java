
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
      //write code here
        int holder = 0;
        if (number1 > number2) {
            holder =+ number1;
        } else { 
            holder=+number2;
        }
        if (holder > number3) {
            return holder; 
        } else {
            return number3; 
        }
    }

       
    

    public static void main(String[] args) {
        int result = greatest(99, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
