package StreamsFilesAndDirectories.Exercises;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String inPath = "input.ex.txt";
        String outputPath = "output.ex.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            writer.println(line);
        }
        writer.close();
    }
}
