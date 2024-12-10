package gr.aueb.cf.myexperiments;

public class TryCatchBlock
{
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Optional block that executes regardless of an exception
            System.out.println("The 'try catch' block is finished.");
        }
    }
}
