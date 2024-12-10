package gr.aueb.cf.myexperiments;

public class BinaryToDecimalApp {

    public static void main(String[] args) {
        int[] vector = {1, 0, 0, 0, 1, 1, 0, 1}; // 142
        int decimal = binaryToDecimalNew(vector);
        System.out.println("Value: " + decimal);
    }

// Convert a binary vector to decimal
public static int binaryToDecimalNew(int[] binaryVector) {
    int decimal = 0;

    if (binaryVector == null) {
        throw new IllegalArgumentException();
    }

    int n = binaryVector.length;

    for (int i = 0; i < n; i++) {
        decimal += binaryVector[i] * (int) Math.pow(2, n - 1 - i);
    }

    return decimal;
}
// Convert a binary vector to decimal
public static int binaryToDecimal(int[] binaryVector) {
    int decimal = 0;

    if (binaryVector == null) {
        throw new IllegalArgumentException();
    }

    int n = binaryVector.length;

    for (int i = 0; i < n; i++) {
        decimal += binaryVector[i] * (int) Math.pow(2, i);
    }

    return decimal;
}
}


