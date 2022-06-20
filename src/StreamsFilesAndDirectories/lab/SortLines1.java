package StreamsFilesAndDirectories.lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines1 {
    public static void main(String[] args) throws IOException {

        String path="input.txt";

        List<String> sortedLines = Files.readAllLines(Paths.get(path))
                .stream().sorted().collect(Collectors.toList());

        Path outputPath=Paths.get("sorted-lines-out.txt");
        Path write=Files.write(outputPath,sortedLines);

    }
}
