package StreamsFilesAndDirectories.lab;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class ListFiles1 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        File root = new File("C:\\Стоил\\Програми\\Java\\Задачи\\Advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04.Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams");

        Arrays.stream(root.listFiles()).filter(File::isFile)
                .forEach(f -> System.out.println(f.getName() + ": " + "[" + f.length() + "]"));
    }
}
