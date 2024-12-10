package gr.aueb.cf.myexperiments;

public class SmallHomeWork2 {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 52, 3, 5, 102};

        System.out.println(getSecondMinValue(arr));

    }


public static int getMinPosition(int arr[] ) {
    if ( arr == null ) return -1;
    int minPosition = 0;
    int minValue = arr[0];

    for ( int i = 1; i < arr.length; i++) {
        if ( arr[i] < minValue ) {
            minValue = arr[i];
            minPosition = i;
        }

    }
    return minPosition;
}

public static int getSecondMinValue(int arr[]) {
    if ( arr == null || arr.length < 2) return -1;

    int secondMinValue = Integer.MAX_VALUE;
    int minValue;
    minValue = arr[getMinPosition(arr)];

    for ( int i = 0; i < arr.length; i++) {
        if ( arr[i] < secondMinValue && arr[i] != minValue) {
            secondMinValue = arr[i];
        }
    }
    return secondMinValue;
}

}