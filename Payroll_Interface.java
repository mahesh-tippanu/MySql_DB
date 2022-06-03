package Emp_IQ;
import java.util.List;

    interface Payroll_Interface {
        boolean CreateNewTable();
        boolean InsertRecordInTable();
        List<EmployeeData> ReadAllDataFromTable();
        boolean DisplayParticularData();
        boolean UpdateRecordInTable();
    }


