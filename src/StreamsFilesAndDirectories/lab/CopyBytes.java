package StreamsFilesAndDirectories.lab;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        String inPath = "input.txt";
        String outputPath = "output.txt";

        try (InputStream in = new FileInputStream(inPath);
             OutputStream out = new FileOutputStream (outputPath)) {
            int oneByte;
            while ((oneByte = in.read ()) >= 0) {
                if (oneByte == 32 || oneByte == 10) out.write(oneByte);
                else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        out.write(digits.charAt(i));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
