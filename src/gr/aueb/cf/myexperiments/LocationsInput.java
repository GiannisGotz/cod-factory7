package gr.aueb.cf.myexperiments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LocationsInput {

    public static void main(String[] args) throws IOException {
        String inputFile = "C:/tmp/Locations.txt";
        String outputFile = "C:/tmp/LocationsStringOut.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile), StandardCharsets.UTF_8);
             PrintStream ps = new PrintStream(Files.newOutputStream(Paths.get(outputFile)), true, StandardCharsets.UTF_8.name())) {

            String line;
            String[] tokens;

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",");
                ps.printf("{\"Locations\": \"%s\", \"latitude\": \"%s\", \"longitude\": \"%s\" }%n", tokens[0], tokens[1], tokens[2]);
                System.out.printf("{\"Locations\": \"%s\", \"latitude\": \"%s\", \"longitude\": \"%s\" }%n", tokens[0], tokens[1], tokens[2]);
            }

        } catch (IOException e) {
            System.err.println("Error reading or writing the file: " + e.getMessage());
        }
    }
}




