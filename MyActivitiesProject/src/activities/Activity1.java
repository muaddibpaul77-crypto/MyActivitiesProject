package activities;
import java.util.*;

public class Activity1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a number between 1 and 100: ");
            num = sc.nextInt();
        } while (num < 1 || num > 100);
    }
}
