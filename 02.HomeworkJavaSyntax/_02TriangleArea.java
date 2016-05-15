import java.util.Scanner;

public class _02TriangleArea {
    public static void main(String[] args) {
        System.out.println("enter coordinates for point A");
        Scanner input = new Scanner(System.in);
        int ax = input.nextInt();
        int ay = input.nextInt();
        System.out.println("enter coordinates for point B");
        int bx = input.nextInt();
        int by = input.nextInt();
        System.out.println("enter coordinates for point C");
        int cx = input.nextInt();
        int cy = input.nextInt();
        int area = Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2);
        System.out.println("the area is: "+area);
    }
}
