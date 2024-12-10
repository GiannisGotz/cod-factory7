package gr.aueb.cf.myexperiments;

public class AddBigOneVtwo {

    public static void main(String[] args) {

            int[] arr = {9, 7, 8};
            int[] arrOut;
            arrOut = addOneNew(arr);

            for (int item : arrOut) {
                System.out.print(item + " ");
            }
        }

        public static int[] addOneNew(int[] arr){
            int sumarrOut = 0;
            int carry = 1;
            int[] arrOut = new int[arr.length + 1];

            for (int i = arr.length-1; i >= 0; i--) {
                if ((arr[i] + carry) % 10  == 0 ) {
                    arrOut[i + 1] = 0;
                } else{
                    arrOut[i + 1] = arr[i] + carry;
                    carry = arrOut[i + 1] / 10;
                }
            }
            for (int i = 1; i < arrOut.length; i++) {
                sumarrOut += arrOut[i];
            }
            arrOut[0] = (sumarrOut == 0) ? 1 : 0;
            return arrOut;
        }
    }

