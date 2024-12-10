package gr.aueb.cf.ch10mine;

public class MaxZerosBetweenOnes {

    public static void main(String[] args) {
        int n = 81;
        System.out.println("Max zeros between ones in binary representation of " + n + " is: " + maxZerosBetweenOnes(n));
    }

    public static int maxZerosBetweenOnes(int n) {
        String binaryString = Integer.toBinaryString(n);
        int maxZeros = 0;
        int currentZeros = 0;
        boolean foundOne = false;

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                if (foundOne) {
                    maxZeros = Math.max(maxZeros, currentZeros);
                }
                foundOne = true;
                currentZeros = 0;
            } else if (c == '0') {
                currentZeros++;
            }
        }

        return maxZeros;
    }
}
