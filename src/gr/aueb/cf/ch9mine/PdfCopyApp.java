package gr.aueb.cf.ch9mine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Αντιγράφει ένα pdf αρχείο ως binary
 *
 */
public class PdfCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;

        try (FileInputStream fis = new FileInputStream("C:/tmp/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-out.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("File with size %.1f KB (%d bytes) copied successfully\n",
                    (counter / 1024.0), counter);
            System.out.printf("Elapsed time: %.2f seconds\n", elapsedTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
