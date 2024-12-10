package gr.aueb.cf.myexperiments;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 4, 1, 2};
        int max;
        int maxPosition;
        int tmp;

        for (int i = arr.length -1;  i > 0; i--) {
            max = arr[i];
            maxPosition = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < max) {
                    max = arr[j];
                    maxPosition = j;
                }
            }
            tmp = arr[i];
            arr[i] = max;
            arr[maxPosition] = tmp;
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
