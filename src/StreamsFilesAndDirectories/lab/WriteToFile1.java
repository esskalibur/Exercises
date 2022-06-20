package StreamsFilesAndDirectories.lab;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile1 {
    public static void main(String[] args) {

        String inPath="input.txt";
        String outPath="output.txt";

       try{
           FileInputStream inputStream=new FileInputStream(inPath);
           FileOutputStream output=new FileOutputStream(outPath);
           Set<Character> symbols=Set.of('.', ',', '!', '?');
           int read= inputStream.read();
           while (read!=-1){
               if(!symbols.contains((char) read)){
                   output.write(read);
               }
               read=inputStream.read();

           }
       } catch (IOException ignored) {
       }

    }
}
