package StreamsFilesAndDirectories;

import java.io.File;


public class GetFolderSize {
    public static void main(String[] args) {
        File file = new File("Exercises Resources");

        System.out.println("Folder size: " + getDirectorySizeIncludingSubfolders(file));

    }

    private static int getDirectorySizeIncludingSubfolders(File file) {
        int sum = 0;
        File[] files = file.listFiles();
        if (files == null) {
            sum += file.length();
        } else {
            for (File file1 : files) {
                sum += getDirectorySizeIncludingSubfolders(file1);
            }
        }
        return sum;
    }
}
