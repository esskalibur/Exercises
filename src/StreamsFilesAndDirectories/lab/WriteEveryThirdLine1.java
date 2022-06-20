package StreamsFilesAndDirectories.lab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteEveryThirdLine1 {
    public static void main(String[] args) throws IOException {

        String path="input.txt";

        List<String> lines = Files.readAllLines(Paths.get(path));
        for(int i=2;i< lines.size();i+=3){
            System.out.println(lines.get(i));
        }

    }
}
