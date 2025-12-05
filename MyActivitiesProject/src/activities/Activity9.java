package activities;
import java.util.*;

public class Activity9 {
    public static void run() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input;

        do {
            System.out.print("Enter a number (0 stops): ");
            input = sc.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("Sum = " + sum);
    }
}
