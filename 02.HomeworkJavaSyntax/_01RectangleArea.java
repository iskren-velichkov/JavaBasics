import java.util.Scanner;

public class _01RectangleArea {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter the sides of the rectangular - a and b:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a*b;
        System.out.println("the area is: " + area);
    }
}
