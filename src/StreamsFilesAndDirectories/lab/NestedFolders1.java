package StreamsFilesAndDirectories.lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class NestedFolders1 {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        File root = new File("C:\\Стоил\\Програми\\Java\\Задачи\\Advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04.Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams");

        System.out.println(Files.walk(root.toPath()).map(Path::toFile).map(File::getName)
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
