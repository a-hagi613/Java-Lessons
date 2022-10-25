//Your package name goes here

import java.sql.*;
public class feedAppClass {
    private static final String userName = "postgres";
    // If you've changed your password for your database, you will need to change the following line to match your new password:
    private static final String password = "1209";
    private static final String dbName = "feedApp";
    private static final String port = "5433";
    private static final String dbUrl = "localhost";
    public Connection CreateConnection() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager
                    .getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName,
                            userName, password);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return conn;
    }
    public void GetAllStudents(Connection conn) {
        try {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "SELECT * FROM \"UserID\"";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // Retrieve by column name
                System.out.print(" name: " + rs.getString("name"));
                System.out.print(", emailID: " + rs.getString("emailID"));
                System.out.print(", phoneNumber: " + rs.getString("phoneNumber"));
                System.out.print(", userPassword: " + rs.getString("userPassword"));
                System.out.println(", username: " + rs.getString("username"));
            }
            stmt.close();
        } catch (SQLException ex) {
            //handle exception
            System.out.println("Exception:" + ex.getMessage());
        }
    }

    public void GetStudentById(Connection conn, Integer studentId) {
        try {
            PreparedStatement stmt = null;
            String sql = "SELECT * FROM students WHERE \"studentId\" = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, studentId);  //1 specifies the first parameter in the query
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Retrieve by column name
                System.out.print(" name: " + rs.getString("name"));
                System.out.print(", emailID: " + rs.getString("emailID"));
                System.out.print(", phoneNumber: " + rs.getString("phoneNumber"));
                System.out.print(", userPassword: " + rs.getString("userPassword"));
                System.out.println(", username: " + rs.getString("username"));
            }
            stmt.close();
        } catch (SQLException ex) {
            //Handle exceptions, in case of any errors:
            System.out.println("Exception:" + ex.getMessage());
        }
    }

    public void AddStudent(Connection conn, String name, String emailID, String phoneNumber, String userPassword, String username) {
        try {
            PreparedStatement stmt = null;
            String sql = "INSERT INTO \"UserID\" (\"name\", \"emailID\", \"phoneNumber\", \"userPassword\", \"username\") VALUES (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, emailID);
            stmt.setString(3, phoneNumber);
            stmt.setString(4, userPassword);
            stmt.setString(5, username);
            int resultCount = stmt.executeUpdate();
            System.out.println(resultCount + " record(s) inserted");
            stmt.close();
        } catch (SQLException ex) {
            //handle exception
            System.out.println("Exception:" + ex.getMessage());
        }
    }
    public boolean CloseConnection(Connection conn) {
        boolean flag = true;
        try {
            conn.close();
            System.out.println("Connection closed successfully ");
        } catch (SQLException ex) {
            flag = false;
            // Handle exception, in case of any errors:
            System.out.println("Exception:" + ex.getMessage());
        }
        return flag;
    }
}