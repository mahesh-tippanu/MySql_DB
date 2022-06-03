package Emp_IQ;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
public class EmpDB {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_serives?useSSL=false";
        String userName = "root";
        String password = "uttarasha8*T";
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find the driver in the classpath!", e);
        }
        listDrivers();
        try {
            System.out.println("connecting to database:" + jdbcURL);
            connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("connection is successful!!!!!!" + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listDrivers() {
        Enumeration<Driver> driverlist = DriverManager.getDrivers();
        while (driverlist.hasMoreElements()) {
            Driver driverClass = (Driver) driverlist.nextElement();
            System.out.println("  " + driverClass.getClass().getName());
        }
    }

    public static Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_serives?useSSL=false";
        String userName = "root";
        String password = "uttarasha8*T";
        Connection connection;
        connection = DriverManager.getConnection(jdbcURL, userName, password);
        System.out.println("DataBase Connected Successfully");
        return connection;

    }
}


