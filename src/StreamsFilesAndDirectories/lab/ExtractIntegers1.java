package StreamsFilesAndDirectories.lab;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers1 {
    public static void main(String[] args) throws IOException {

        String inPath = "input.txt";
        FileInputStream inputStream = new FileInputStream(inPath);
        Scanner scanner = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(new FileOutputStream("output.txt"));
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                writer.println(scanner.next());
            } else {
                scanner.next();
            }
        }
        writer.close();
    }
}
