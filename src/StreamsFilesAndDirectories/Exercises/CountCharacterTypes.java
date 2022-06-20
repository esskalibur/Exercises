package StreamsFilesAndDirectories.Exercises;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String inPath = "input.ex.txt";
        String outPath = "output.ex.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outPath));

        Set<Character> vowel = new HashSet<>();
        Collections.addAll(vowel, 'a', 'e', 'i', 'o', 'u' );

        Set<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation, '.', '!', '?', ',');

        int vowels= 0;
        int consonants = 0;
        int punctuations = 0;

        String line;
        while ((line= reader.readLine()) != null){
            for (char c : line.toCharArray()) {
                if(vowel.contains(c)) vowels++;
                else if(punctuation.contains(c)) punctuations++;
                else if(c != ' ') consonants++;
            }
        }
        writer.println("Vowels: " + vowels);
        writer.println("Consonants: " + consonants);
        writer.println("Punctuation: " + punctuations);
        writer.close();
    }
}
