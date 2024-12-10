package gr.aueb.cf.myexperiments;

public class MergeSort {

    public static void main(String[] args) {
        int []arr = new int[] {1, 2, 6, 55, 55 ,7, 7, 8, 8, 9 ,9 ,9, 10, 11};

        int [] merged = mergeSortOf(arr, 0, arr.length-1);

        for (int row : merged) {
            System.out.print(row + " ");
        }

    }

    public static int[] mergeSortOf(int []arr, int s, int n ) {
        if (n - s <= 0)  return new int[] {arr[s]};

        int middle = (n + s) / 2;

        int[] left = mergeSortOf(arr, s, middle);
        int[] right = mergeSortOf(arr, middle+1, n);

        return merge( left, right);

    }

    public static int[] merge(int [] left, int[] right) {
        int []merged = new int[left.length+ right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < left.length) && (j < right.length)) {
            if ( left[i] <= right[j] ) {
                merged[k++] = left[i++];
            }  else {
                merged[k++] = right[j++];
                }
            }


        while ( i < left.length) {
             merged[k++] = left[i++];
        }

        while ( j < right.length ) {
             merged[k++] = right[j++];
        }

        return merged;

    }
}
