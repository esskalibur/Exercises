package StreamsFilesAndDirectories.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path inPath = Paths.get("input.txt");
        Path outputPath = Paths.get("output.txt");

        List<String> lineInFile = Files.readAllLines(inPath);
        Collections.sort(lineInFile);
        Files.write(outputPath, lineInFile);
    }
}
