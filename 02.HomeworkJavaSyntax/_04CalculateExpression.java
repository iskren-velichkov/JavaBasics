import java.util.Locale;
import java.util.Scanner;

public class _04CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Enter three floating point numbers:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        //System.out.println(a);
        double b = input.nextDouble();
        double c = input.nextDouble();
        double f1 = Math.pow(((a*a + b*b) / (a*a - b*b)), ((a + b + c) / Math.sqrt(c)));
        System.out.printf("F1 result: %.2f", f1);
        double f2 = Math.pow((a*a + b*b - c*c*c), (a - b));
        System.out.printf("; F2 result: %.2f", f2);
        double averageABC = (a+b+c)/3;
        double averageF1F2 = (f1+f2)/2;
        double diff = Math.abs(averageABC - averageF1F2);
        System.out.printf("; Diff: %.2f", diff);
        System.out.println();
    }
}
