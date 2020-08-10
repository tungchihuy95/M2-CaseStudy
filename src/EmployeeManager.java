package Nhansu;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Employee> search(String keywords) {
        // duyet employees, filter by keywords
        // @todo ve code
        return employees;
    }

    public void addNew(Employee employee) {
        employees.add(employee);
    }

    public void update(int id, Employee employee) {
         for (int i = 0; i < employees.size(); i++) {
             if (employee.getId() == id) {
                 employees.set(i, employee);
             }
         }
    }

    public void delete(int id) {
        // for arraylist employees
        //   if employee.getId() == id
        //      employees.remove(i)
    }

    // Click tab nao thi tryen department cua tab do
    // Sau do goi ham show data len mainList cua cai tab do
    public ArrayList<Employee> filterByDepartment(DepartmentEnum department) {
        ArrayList<Employee> results = new ArrayList<Employee>();
        for (Employee employee: employees) {
            if (employee.getDepartment() == department) {
                results.add(employee);
            }
        }
        return results;
    }
}
