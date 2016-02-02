import java.util.Scanner;

/**
 * Created by ani on 01-Feb-16.
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {
        System.out.print("numberOfLetters = ");
        Scanner input = new Scanner(System.in);
        int numberOfLetters = input.nextInt();
        // System.out.println(n);
        // Top Half
        for (int rowTop = 1; rowTop <= numberOfLetters ; rowTop++){
            for (char i = 'a'; i < 'a' + rowTop; i++) {
            System.out.print(i + " ");
            }
            System.out.println();
        }
        // BOT Half
        for (int rowBot = numberOfLetters -1; rowBot >= 1; rowBot--){
            for (char j = 'a'; j <= 'a' + rowBot-1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
