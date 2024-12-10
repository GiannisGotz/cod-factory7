package gr.aueb.cf.myexperiments;

public class ArrExp {

    public static void main(String[] args) {
        int[] ages = {20, 25, 30, 33, 45, 19, 90, 55};

        printArray(ages, 0, ages.length-1);
        System.out.println();
        printArray(ages, 1, ages.length - 4);

    }

    // εκτυπώνει επιθυμητό μέρος του πίνακα
    public static void printArray(int[] arr, int low, int high) {
        if ( low < 0 || high > arr.length -1 || low > high ) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
