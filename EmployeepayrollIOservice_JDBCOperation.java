package Emp_IQ;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeepayrollIOservice_JDBCOperation implements Payroll_Interface {
    public boolean CreateNewTable() {
        try(Connection connection = EmpDB.getConnection();
            Statement statement = connection.createStatement();
        ) {
            String sql = "CREATE TABLE employee_payroll(id int,name varchar(225),salary double,Start_Date DATE)";
            statement.executeUpdate(sql);
            System.out.println("Table Created Successfully !!!!");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //Method to Insert Records in Table
    public boolean InsertRecordInTable() {
        try(Connection connection = EmpDB.getConnection();
            Statement stmt = connection.createStatement();
        ) {
            String sql = "INSERT INTO employee_payroll VALUES(908,'Sony',65000,'2017-01-01')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //Retrive all the data from Table
    public List<EmployeeData> ReadAllDataFromTable(){
        String sql="SELECT * FROM employee_payroll";
        List<EmployeeData> employeeDataList=new ArrayList<>();
        try{
            Connection connection=EmpDB.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                double salary=resultSet.getDouble("salary");
                String Start_Date=resultSet.getString("Start_Date");
                String Gender=resultSet.getString("Gender");
                employeeDataList.add(new EmployeeData(id,name,salary,Start_Date,Gender));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeDataList;
    }
    //Display Particular record from Table
    public boolean DisplayParticularData(){
        String sql="SELECT salary FROM employee_payroll WHERE name = 'Mahesh' or  WHERE start_date BETWEEN '2020-01-01' AND DATE(NOW())";
        try{
            Connection connection=EmpDB.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getString("salary"));
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Update Gender column inside the table
    public boolean UpdateRecordInTable() {
        try(Connection conn = EmpDB.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            String sql = "UPDATE employee_payroll SET Gender='F' WHERE name='Mounica'";
            stmt.executeUpdate(sql);
            System.out.println("Record Updated Successfully...");
            List<EmployeeData> employeeData=ReadAllDataFromTable();
            for(EmployeeData data:employeeData)
            {
                System.out.println(data);
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

















