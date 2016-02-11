

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String[] ghettoSystem = {"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};
        List<Integer> output = new ArrayList<>();
        if (number > 0) {
            do {
                int digit = number % 10;
                output.add(digit);
                //System.out.println(output);
                number = number / 10;
            } while (number > 0);
        }
        for (int i = output.size() - 1; i >=0; i-- ){
            //System.out.print(output.get(i));
            int j = output.get(i);
            System.out.print(ghettoSystem[j]);
        }
    }

}
