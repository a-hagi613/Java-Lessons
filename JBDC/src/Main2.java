//Your package name goes here

import java.sql.Connection;

public class Main2 {
    public static void main(String[] args) {
        feedAppClass jdbc = new feedAppClass();
        Connection conn = jdbc.CreateConnection();
        jdbc.GetAllStudents(conn);

//        jdbc.GetStudentById(conn, 3); // Change the 1 here to be a studentId you have in your database.
//       jdbc.AddStudent(conn,"Hagi Abdullahi", "hagiAbdullahi@gmail.com", "0987654321", "HA321", "Hagi");

        jdbc.CloseConnection(conn);
    }
}
