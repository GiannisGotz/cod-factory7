package gr.aueb.cf.ch10mine;

public class CyclicRotation {

    public static void main(String[] args) {

        int[]  arr =  {1 ,2 , 3};
        int[] rotated = doCircularShiftBy(arr, 1);

        for ( int el : rotated) {
            System.out.print(el + " ");
        }

    }

    public static int[]  doCircularShiftBy ( int []arr, int n ) {
        int[] arrShifted = new int[arr.length];

        for ( int i = 0; i < arr.length; i++ ) {
            arrShifted [ (i + n) % arr.length] = arr [i];
        }

        return arrShifted;

    }
}
