package StreamsFilesAndDirectories.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path inputOne = Paths.get("inputOne.txt");
        Path inputTwo = Paths.get("inputTwo.txt");
        Path result = Paths.get("result.txt");

        List<String> linesInFiles = new ArrayList<>();
        linesInFiles.addAll(Files.readAllLines(inputOne));
        linesInFiles.addAll(Files.readAllLines(inputTwo));
        Files.write(result, linesInFiles);
    }
}
