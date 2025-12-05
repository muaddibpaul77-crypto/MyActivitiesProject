package activities;

public class Activity4 {
    public static void run() {

        int[] arr4 = {12, 5, 99, -3, 25};
        int smallest = arr4[0];
        int largest = arr4[0];

        for (int x : arr4) {
            if (x < smallest) smallest = x;
            if (x > largest) largest = x;
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}
