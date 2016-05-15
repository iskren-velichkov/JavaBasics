import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _07RandomizeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
            list.add(i);
        }
        Random rnd = new Random();
        for (int i = list.size(); i > 0; i--){
            int rndNumber = rnd.nextInt(i);
            System.out.format("%d ", list.remove(rndNumber));
        }
    }
}
