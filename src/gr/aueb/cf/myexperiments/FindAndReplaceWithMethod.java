package gr.aueb.cf.myexperiments;

public class FindAndReplaceWithMethod {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        replaceElement(arr, 5, 11);
        printArr(arr);
    }


    public static void replaceElement(int[] arr, int oldValue, int newValue) {
        int positionToUpdate = -1;

        if (arr == null) return;
        positionToUpdate = getElementPosition(arr, oldValue);
        if (positionToUpdate != -1)  arr[positionToUpdate] = newValue;
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

    public static void printArr(int []arr) {

        for (int el : arr) {
            System.out.print(el + " ");
        }
}
}
