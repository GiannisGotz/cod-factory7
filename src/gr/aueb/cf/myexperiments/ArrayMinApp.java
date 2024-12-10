package gr.aueb.cf.myexperiments;

public class ArrayMinApp {

    public static void main(String[] args) {
        int []arr = { 2 ,6 ,6 ,8, 6, 214, 55};
        System.out.println(getMinPosition(arr,0,3));

        int minPosition = 0;
        int minValue= arr[minPosition];

        for ( int i = 0; i < arr.length; i++)
        {
            if ( arr[i] < minValue ) {
                minPosition= i;
                minValue=arr[minPosition];
            }
        }
        System.out.println(arr[minPosition]);
    }


    public static int getMinPosition ( int[] arr, int low, int high) {
        int minPosition = low;
        int minValue;

        if ((low < 0) || (high > arr.length - 1) || (high < low)) {
            System.out.println("Error in array dimension");
            return -1;
        }
        minValue= arr[low];
        for ( int i = low; i <= high; i++) {
            if ( arr[i]< minValue) {
                minPosition = i;
                minValue= arr[i];
            }
        }
        return arr[minPosition];
    }
}
