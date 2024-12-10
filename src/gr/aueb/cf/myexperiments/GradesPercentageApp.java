package gr.aueb.cf.myexperiments;

public class GradesPercentageApp {

    public static void main(String[] args) {
        int []grades = new int [] {1, 2, 2, 4, 5, 5, 0, 2, 0 ,4 ,5, 2,1 ,1};
        int []counts = new int [6];

        for ( int grade : grades) {
            counts[grade]++;
        }

        for (int i = 0; i < counts.length; i++ ) {
            double percentage = (double) counts[i] / grades.length *  100;
            System.out.printf("Grade %d: Count : %d Percentage: %6.2f%%\n", i, counts[i], percentage);
        }
    }
}
