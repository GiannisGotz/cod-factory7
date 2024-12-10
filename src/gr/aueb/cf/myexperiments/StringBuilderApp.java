package gr.aueb.cf.myexperiments;

/**
 * Concatenates strings efficiently
 * with @link String Builder
 *
 */

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for ( int i = 1; i <= 15000; i++ ) {
            concatStr = concatStr + i;
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0;
        timeStart = System.nanoTime();

        for ( int i = 1; i <= 15000; i++ ) {
            sb.append(i);
        }
        timeEnd = System.nanoTime();
        sbElapsedTime = ( timeEnd = timeStart ) / 1_000_000_000.0;

        System.out.println("String concat time: " + stringElapsedTime + " seconds");
        System.out.println("String builder concat time: " + sbElapsedTime + " seconds");;

    }
}
