import java.util.HashMap;
public class test {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        HashMap <String,Integer> students = new  HashMap <String,Integer>();
        students.put("Abdullahi", 01);
        students.put("student2", 02);
        students.put("student3", 03);
        students.put("student4", 04);
        students.put("student5", 05);

        for(String i : students.keySet()){
            System.out.println("Student name is: " + i + " and Student Id is :" +students.get(i) );
        }

    }

}
