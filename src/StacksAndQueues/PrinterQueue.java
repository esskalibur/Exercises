package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileNames=scanner.nextLine();
        ArrayDeque<String>printerFiles=new ArrayDeque<>();
        while (!fileNames.equals("print")){
            if(fileNames.equals("cancel")){
                if(printerFiles.isEmpty()){
                     System.out.println("Printer is on standby");
                }else{
                    String firstFile = printerFiles.poll();
                     System.out.println("canceled"+firstFile);
                }
            }else{
                printerFiles.offer(fileNames);
            }
            fileNames=scanner.nextLine();
        }
        for (String printerFile : printerFiles) {
             System.out.println(printerFile);
        }
    }
}
