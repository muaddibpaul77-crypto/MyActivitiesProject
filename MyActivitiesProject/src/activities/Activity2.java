package activities;

public class Activity2 {
    public static void run() {

        int[] arr2 = {3, 7, 1, 7, 9, 7, 2, 4, 7, 10};
        int count7 = 0;

        for (int x : arr2) {
            if (x == 7) count7++;
        }

        System.out.println("Count of 7 = " + count7);
    }
}
