//Your package name goes here

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        StudentAppClass jdbc = new StudentAppClass();
        Connection conn = jdbc.CreateConnection();
        jdbc.GetAllStudents(conn);

        jdbc.GetStudentById(conn, 3); // Change the 1 here to be a studentId you have in your database.
//        jdbc.AddStudent(conn, 1, "Bob", "bob@bptn.com", 123493);

        jdbc.CloseConnection(conn);
    }
}
