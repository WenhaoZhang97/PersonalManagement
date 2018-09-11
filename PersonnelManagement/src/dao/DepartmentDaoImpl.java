/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import model.Department;

/**
 *
 * @author Administrator
 */
public class DepartmentDaoImpl implements IDepartmentDao{
    
    private static Department_data department_data = new Department_data();
    
    //通过部门编号查找部门信息
    public Department findById(int id) {
        return department_data.findDepartmentById(id);
        }

    public Department findByName(String name) {
       return department_data.findDepartmentByName(name);
        }   
    
    
    //查找部门的所有信息
    public ArrayList<Department> findAll() {
        ArrayList<Department> departmentList = department_data.findAllDepartment();
        return departmentList;
    }

    public Vector findAll_vector() {
        Vector department = new Vector();
        ArrayList<Department> allDepartment = department_data.findAllDepartment();
        for(Department department1 : allDepartment) {
            Vector hang=new Vector();
            hang.add(department1.getId());
            hang.add(department1.getName());
            hang.add(department1.getMaName());
            department.add(hang);
        }

        return department;
    }
    
    //添加部门信息
    public int insert(Department entity) {
        department_data.insertDepartment(entity);
        return 1;
    }

    //删除部门信息
    public int delete(Department entity) {
        department_data.deleteDepartment(entity);
        return 1;
    }

    //更新部门信息
    public int update(Department entity) {
        department_data.updateDepartment(entity);
        return 1;
    }
    
}
