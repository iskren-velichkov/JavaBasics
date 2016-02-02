import java.util.Scanner;

/**
 * Created by ani on 29-Jan-16.
 */
public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a= ");
        int a = input.nextInt();
        System.out.print("b= ");
        int b  = input.nextInt();
        int sum = a+b;
        System.out.println("sum = " + sum);
    }
}
