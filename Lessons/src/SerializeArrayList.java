import java.io.*;
import java.util.*;

public class SerializeArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


//        CREATING FILESTREAMS
        try {
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\hagiA\\Coding Extra\\Cars.txt");
            ObjectOutputStream out = new ObjectOutputStream (fileout);

            out.writeObject(cars);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved into Cars.txt");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

            finally {
            System.out.println("DeSerializing Cars" + cars);
        }
    }
}

