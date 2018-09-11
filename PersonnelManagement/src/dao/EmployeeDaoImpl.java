package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import model.Employee;
import service.DepartmentServiceImpl;

public class EmployeeDaoImpl implements IEmployeeDao {


    DepartmentServiceImpl dsi = new DepartmentServiceImpl();

    private static Employee_data employee_data = new Employee_data();
    //通过人员编号查找人员信息
    public Employee findById(int id) {
        Employee employee = null;
        employee = employee_data.findEmployeeById(id);
        return employee;
    }

    //查找所有人员信息
    public ArrayList<Employee> findAll() {
        return employee_data.findAllEmployee();
    }
    public Vector findAll_vector() {
        Vector EmployeeVector = new Vector();
        ArrayList<Employee> allData = findAll();
        for(Employee temp : allData) {
            Vector hang=new Vector();
            hang.add(temp.getId());
            hang.add(temp.getName());
            hang.add(temp.getProfessional());
//                 hang.add(rs.getString(dsi.findById(rs.getInt("departmentID")).getName());

            hang.add(dsi.findById(temp.getDepartmentID()).getName());
            hang.add(temp.getPower());
            hang.add(temp.getPassword());
            EmployeeVector.add(hang);
        }
        return EmployeeVector;
    }
    //添加人员信息
    public int insert(Employee entity) {
        int em = employee_data.insertEmployee(entity);
        return em;
    }

    //删除人员信息
    public int delete(int id) {
        int em = 1;
        employee_data.deleteEmployee(id);
        return em;
    }

    //修改人员信息
    public int update(Employee entity) {
        int em = 1;
        employee_data.updateEmployee(entity);
        return em;
    }

    public Employee findByName(String name) {
        return employee_data.findEmployeeByName(name);
    }
}
