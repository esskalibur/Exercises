package StreamsFilesAndDirectories.lab;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String inPath = "input.txt";
        String outputPath = "output.txt";

        BufferedReader in = new BufferedReader(new FileReader(inPath));
        PrintWriter out = new PrintWriter(new FileWriter(outputPath));

        int counter = 1;
        String line;
        while ((line = in.readLine()) != null) {
            if (counter % 3 == 0) out.println(line);
            counter++;
        }
        out.close();
    }
}
