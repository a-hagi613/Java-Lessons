import java.io.*;
import java.util.*;

class Employee implements Serializable {
    public String name;
    public String address;

}

public class Serialization {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "Abdullahi";
        emp.address = "Ottawa";

        try {
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\hagiA\\Coding Extra\\Employee.txt");
            ObjectOutputStream out = new ObjectOutputStream (fileout);

            out.writeObject(emp);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved into Java.txt");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}