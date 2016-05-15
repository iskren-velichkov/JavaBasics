import java.util.Locale;
import java.util.Scanner;

public class _03FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.print("enter int a(0 ≤ a ≤ 500):");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("enter floating point numbers b and c");
        double b = input.nextDouble();
        double c = input.nextDouble();
        //string aString = int.toString(a);
        String aHexString = Integer.toHexString(a).toUpperCase();
        int aBinaryInt = Integer.parseInt(Integer.toBinaryString(a));
        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", aHexString, aBinaryInt, b,c);
    }
}
