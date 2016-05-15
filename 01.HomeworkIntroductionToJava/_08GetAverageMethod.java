import java.util.Scanner;

public class GetAverageMethod {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double average = averageMethod(a, b, c);
        System.out.printf("The average is: %.2f\n", average);
    }
    public static double averageMethod(double n1, double n2, double n3){
        double result = (n1 + n2 + n3)/3;
        return result;
    }
}
