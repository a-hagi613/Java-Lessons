import java.io.*;
import java.io.FileInputStream;



public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = null;

        try{
            FileInputStream filein = new FileInputStream("C:\\Users\\hagiA\\Coding Extra\\Employee.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            emp =(Employee) in.readObject();
            in.close();
            filein.close();
        }
        finally {
            System.out.println("DeSerializing Employee");
            System.out.println("name of employee: " + emp.name);
            System.out.println("name of employee: " + emp.address);
        }

    }
}
