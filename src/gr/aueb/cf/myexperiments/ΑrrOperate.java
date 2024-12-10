package gr.aueb.cf.myexperiments;


public class ΑrrOperate {

    public static void main(String[] args) {
        int[] arr = new int[] {6, 52, 3, 5, 102};
        int[] arr1 = new int[] {-2, -3, -5};

        System.out.println(getValuePosition(arr, 5));
        printsArrOdds(arr);
        System.out.println();
        doubleArr(arr);
        for ( int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(positiveExists(arr1));
        System.out.println(allPositives(arr));

    }


    public static int getValuePosition (int[] arr, int value) {
        if ( arr == null ) return -1;
        int iPosition = -1;


        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                iPosition = i;
            }
        }
        return iPosition;
    }

    public static void printsArrOdds ( int [] arr ) {

        for ( int el : arr) {
            if ( el % 2 == 0) ;
            System.out.print(el + " ");
        }

    }

    public static int[] doubleArr ( int[] arr ) {

        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] *= 2;
        }
        return arr;
    }

    public static boolean positiveExists (int[] arr ) {

        for ( int el : arr ) {
            if (el > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean allPositives ( int [] arr ) {

        for (int el :arr ) {
            if (el < 0) {
                return false;
            }
        }
        return true;
    }
}
