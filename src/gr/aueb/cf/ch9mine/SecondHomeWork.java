package gr.aueb.cf.ch9mine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class SecondHomeWork {

    public static void main(String[] args) {
        long start;
        long end;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192]; // 8kb
        int bytesRead;
        int totalBytes = 0;

        String userInputFile = "userInputFile.pdf";
        String inputPath = "C:/tmp/" + userInputFile;

        // Generate a new file name with UUID
        String newFileName = UUID.randomUUID().toString().replace(":", "_") + "_" + userInputFile;
        String outputPath = "C:/tmp/" + newFileName;

        try (FileInputStream inputFile = new FileInputStream(inputPath);
             FileOutputStream outputFile = new FileOutputStream(outputPath)) {

            start = System.currentTimeMillis();
            while ((bytesRead = inputFile.read(buffer)) != -1) {
                outputFile.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }
            System.out.printf("File size %.2f kb or %d bytes\n\n", totalBytes / 1024.0, totalBytes);

            Path pathInputFile = Paths.get(inputPath);
            Path absolutePathInputFile = pathInputFile.toAbsolutePath();
            System.out.println("Input file absolute path: " + absolutePathInputFile.toString());

            Path pathOutFile = Paths.get(outputPath);
            Path absolutePathOutFile = pathOutFile.toAbsolutePath();
            System.out.println("Output file absolute path: " + absolutePathOutFile.toString());

            System.out.println("File extension: " + getFileExtension(outputPath));

            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;
            System.out.printf("File copied successfully in %.5f seconds\n", elapsedTime);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String getFileExtension(String filename) {
        if (filename == null) {
            return null;
        }
        int dotIndex = filename.lastIndexOf(".");
        if (dotIndex >= 0) {
            return filename.substring(dotIndex + 1);
        }
        return "";
    }
}

