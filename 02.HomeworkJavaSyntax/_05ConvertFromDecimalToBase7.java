import java.util.Scanner;

public class _05ConvertFromDecimalToBase7 {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to convert to 7 base: ");
        Scanner input = new Scanner(System.in);
        Integer numberToConvert = input.nextInt();
        System.out.print(Integer.toString(numberToConvert, 7));
    }
}
