package dao;

import model.Department;
import model.Employee;
import service.*;

import java.util.ArrayList;

public class Employee_data {

    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private DepartmentServiceImpl dsi = new DepartmentServiceImpl();
    private static int currendId = 0;


//    public Employee_data() {
//        Employee employee1 = new Employee();
//        employee1.setId(1);
//        employee1.setName("John Smith");
//        employee1.setPassword("123");
//        employee1.setPower(1);
//        employee1.setDepartmentID(1);
//        employee1.setDepartment(dsi.findById(1));
//        employee1.setProfessional("主管");
//        employeeList.add(employee1);
//    }

    public Employee findEmployeeById(int id) {
        for(Employee emp : employeeList) {
            if(emp.getId() == id)
                return emp;
        }
        return null;
    }

    public ArrayList<Employee> findAllEmployee() { return employeeList; }

    public int insertEmployee(Employee emp) {
        emp.setId(currendId++);
        employeeList.add(emp);
//        currendId++;
        return 1;
    }

    public void deleteEmployee(int id) {
        for(Employee emp : employeeList) {
            if(emp.getId() == id) {
                employeeList.remove(emp);
                break;
            }
        }
    }

    public void updateEmployee(Employee emp) {
        for(Employee temp : employeeList) {
            if(emp.getId() == temp.getId()) {
                employeeList.remove(temp);
                employeeList.add(emp);
            }
        }
    }

    public int getCurrendId() { return currendId; }

    public Employee findEmployeeByName(String name) {
        for(Employee employee : employeeList) {
            if(employee.getName().equals(name))
                return employee;
        }
        return null;
    }
}
