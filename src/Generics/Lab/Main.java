package Generics.Lab;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> jar=new Jar<>();
        jar.add(13);
        jar.add(72);

         System.out.println(jar.remove());
         System.out.println(jar.remove());
    }
}
