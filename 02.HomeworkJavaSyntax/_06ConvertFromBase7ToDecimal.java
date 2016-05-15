import java.util.Scanner;

public class _06ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the 7 base number you want to convert to decimal: ");
        Scanner input = new Scanner(System.in);
        int numberInBase7 = Integer.parseInt(input.nextLine(), 7);
        String numberInDecimal = Integer.toString(numberInBase7, 10);
        System.out.println(numberInDecimal);
    }
}
