package StreamsFilesAndDirectories.lab;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Стоил\\Програми\\Java\\Задачи\\Advanced" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04.Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams");

        if(file.exists()){
            File[] files = file.listFiles();
            for (File f : files != null ? files : new File[0]) {
                if(!f.isDirectory()){
                    System.out.println(f.getName() + ": [" + f.length() + "]");
                }
            }
        }
    }
}
