package gr.aueb.cf.myexperiments;

public class SearchArrayWithMethod {

    public static void main(String[] args) {
        int[] quantities = {300, 40, 50, 6, 7, 8};
        int position = 0;
        int value = 7;

        position = getElementPosition(quantities, value);
        System.out.printf("Position of %d is: %d", value, position+1);
    }


    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == value) {
                return i;
            }

        }
        return -1;
    }
}