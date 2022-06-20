package StreamsFilesAndDirectories.lab;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {
        String inPath = "input.txt";
        String outputPath = "output.txt";
        Set<Character> punctuations = new HashSet<>();
        Collections.addAll(punctuations, '.', ',', '!', '?');

        try (InputStream in = new FileInputStream(inPath);
             OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte;
            while ((oneByte = in.read()) >= 0) {
                if(!punctuations.contains((char) oneByte)){
                    out.write(oneByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
