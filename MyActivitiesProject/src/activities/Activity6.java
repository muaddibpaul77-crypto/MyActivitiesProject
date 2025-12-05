package activities;

public class Activity6 {
    public static void run() {

        int[] arr6 = {3, 10, 15, 22, 9};
        int oddSum = 0, oddCount = 0;

        for (int x : arr6) {
            if (x % 2 != 0) {
                oddSum += x;
                oddCount++;
            }
        }

        double oddAvg = (oddCount > 0) ? (double) oddSum / oddCount : 0;

        System.out.println("Average of odd numbers = " + oddAvg);
    }
}
