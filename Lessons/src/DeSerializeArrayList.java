import java.io.*;
import java.util.*;

public class DeSerializeArrayList {
public static void main(String[] args)  throws IOException, ClassNotFoundException {
        ArrayList<String> cars = null;

        try{
        FileInputStream filein = new FileInputStream("C:\\Users\\hagiA\\Coding Extra\\Cars.txt");
        ObjectInputStream in = new ObjectInputStream(filein);
        cars =(ArrayList<String>) in.readObject();
        in.close();
        filein.close();
        }
        finally {
        System.out.println("DeSerializing Cars");
        System.out.println("CARS: " + cars);
        }

    }
}
