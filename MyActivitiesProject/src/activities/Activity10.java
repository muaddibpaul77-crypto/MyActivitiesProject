package activities;

public class Activity10 {
    public static void run() {

        int[] arr10 = {9, 7, 3, 14, 5};
        int firstEvenIndex = -1;

        for (int i = 0; i < arr10.length; i++) {
            if (arr10[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }

        System.out.println("First even index = " + firstEvenIndex);
    }
}
