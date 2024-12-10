package gr.aueb.cf.myexperiments;

public class SymmeticMy {

    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;

        for ( int i = 0, j = arr.length; i <= j; i++ , j--) {
            if ( arr[i] != arr[j] ) {
                isSymmetric =false;
                break;
            }
        }
        return isSymmetric;
    }
}
