package gr.aueb.cf.myexperiments;

public class SortingWork {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 4, 4, 4, 6, 7, 8, 8 , 8,8, 8, 7, 7,8 };
        int[] newArr = (getLowAndHighIndexOf(arr, 7));

        for (int el : newArr) {
            System.out.print(el + " ");
        }

    }


    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        if (arr == null) {
            System.out.println("Array not compatible");
            return new int[]{-1, 1};
        }

            int lowIndex = -1;
            int highIndex = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    lowIndex = i + 1;
                    break;
                }
            }
            if ( lowIndex == -1 ) {
                System.out.println("key not found");
                return new int[]{-1, 1};
            }

            for ( int i = lowIndex; i < arr.length; i++ ) {
                if ( arr[i] == key ) {
                highIndex = i;
                continue;
            } }
            if (highIndex == -1) {
                highIndex = arr.length - 1;
            }

            return new int [] {lowIndex, highIndex};

        }
    }
