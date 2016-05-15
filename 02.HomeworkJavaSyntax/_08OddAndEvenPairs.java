import java.util.ArrayList;
import java.util.Scanner;

public class _08OddAndEvenPairs {
    public static void main(String[] args) {
        System.out.println("Enter an array of integers separated by spaces (even length):");
        Scanner input = new Scanner(System.in);
        String[] stringNumbers = input.nextLine().split(" ");
        if (stringNumbers.length % 2 != 0){
            System.out.println("Invalid length");
        }
        else {
            for (int i = 0 ; i < stringNumbers.length; i+=2){
                int num1 = Integer.parseInt(stringNumbers[i]);
                int num2 = Integer.parseInt(stringNumbers[i+1]);
                String result = "different";
                if (num1 % 2 == 0 && num2 %2 ==0){
                    result = "both are even";
                }
                else if (num1 % 2 !=0 && num2 % 2 != 0){
                    result = "both are odd";
                }
                //System.out.printf("%d, %d -> %s\n", num1, num2, result);
                System.out.format("%d, %d -> %s\n", num1, num2, result);
            }
        }
    }
}
