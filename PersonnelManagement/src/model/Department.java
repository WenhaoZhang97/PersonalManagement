/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Department {

    private int id;         //部门编号
    private String name;    //部门名称
    private String MaName;  //部门经理名称
    private List<Department> downDepartmentList = new LinkedList<>();   // 该部门的下属部门

    private List<Employee> employeeList = new LinkedList<Employee>();   // 该部门的职员

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaName() {
        return MaName;
    }

    public void setMaName(String MaName) {
        this.MaName = MaName;
    }

    public List<Department> getDownDepartmentList() { return downDepartmentList; }

    public void addDownDepartment(Department department) { downDepartmentList.add(department); }

   

    @Override
    public String toString() {
        return "Department{" + "id=" + id
                + ", name=" + name
                + ", MaName=" + MaName+  '}';
    }

}
