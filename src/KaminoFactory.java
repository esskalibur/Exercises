import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String line=scanner.nextLine();
        while (!line.equals("Clone them!")){
            String data = line.replaceAll("!", "");
            String[] dna = data.split("0");
            int currentLength=0;
            for(int i=0;i< dna.length;i+=1){
                if(dna[i].length()>currentLength){

                }
            }
            line=scanner.nextLine();
        }
    }
}
