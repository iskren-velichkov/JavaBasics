import java.util.Scanner;


public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        System.out.print("N = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //System.out.println(n);
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += i;
           //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
