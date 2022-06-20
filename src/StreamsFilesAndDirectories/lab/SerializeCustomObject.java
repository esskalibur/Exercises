package StreamsFilesAndDirectories.lab;

import java.io.*;

public class SerializeCustomObject {
    public static class Cube implements Serializable{
        String color;
        double height;
        double length;
        double depth;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cube cube=new Cube();
        cube.color="blue";
        cube.height=15.2;
        cube.length=2.3;
        cube.depth=5.4;

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("blue.txt"));
        objectOutputStream.writeObject(cube);
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("blue.txt"));
        Object object = (Cube)objectInputStream.readObject();
    }
}
