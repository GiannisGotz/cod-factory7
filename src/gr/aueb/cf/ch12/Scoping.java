package gr.aueb.cf.ch12;

public class Scoping {
    static int result = 0;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        result = add(a, b);

        System.out.println(result);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int div(int a,int b)  {

        if ( b == 0) {
            boolean isZero = true;
            System.out.println("Is zero : " + isZero);
            return result;
        }
        return a / b;
    }
}
