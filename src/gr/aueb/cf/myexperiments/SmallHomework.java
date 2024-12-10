package gr.aueb.cf.myexperiments;

public class SmallHomework {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 52, 3, 5, 102};
        int maxValue = 0;
        maxValue = arr[getMaxPosition(arr, 0 , arr.length-1)];

        System.out.printf("Position is %d and value is %d", getMaxPosition(arr, 0 , arr.length-1), maxValue);
    }


    public static int getMaxPosition(int arr[], int low, int high) {
        if ( arr == null || low > high || high>= arr.length || low < 0 ) return -1;
        int maxPosition = low;
        int maxValue = arr[low];
        arr[maxPosition] = maxValue;

        for ( int i = low; i <= high; i++) {
            if ( arr[i] > maxValue ) {
                maxValue = arr[i];
                maxPosition = i;
            }

        }
        return maxPosition;
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

        for ( int i = 1; i < arr.length; i++) {
            if ( arr[i] < secondMinValue && arr[i] != arr[getMinPosition(arr)] ) {
                secondMinValue = arr[i];
            }
        }
        return arr[secondMinValue];
    }

}
