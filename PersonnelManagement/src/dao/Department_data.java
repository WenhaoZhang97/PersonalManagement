package dao;

import java.util.*;

import model.Employee;
import model.Department;

public class Department_data {

    private static ArrayList<Department> departmentList = new ArrayList<>();

    private static int currentId = 0;

    public Department_data() {
        Department internet = new Department();
        internet.setName("网络部");
        internet.setId(1);
        internet.setMaName("马化腾");
        departmentList.add(internet);
        currentId++;

        Department human = new Department();
        human.setName("人力资源部");
        human.setId(2);
        human.setMaName("张三");
        departmentList.add(human);
        currentId++;

        Department assist = new Department();
        assist.setName("秘书部");
        assist.setId(3);
        assist.setMaName("习四");
        departmentList.add(assist);
        currentId++;

        Department gong = new Department();
        gong.setName("公关部");
        gong.setId(4);
        gong.setMaName("王五");
        departmentList.add(gong);
        currentId++;
    }

    public Department findDepartmentById(int id) {
        for(Department dep : departmentList) {
            if(dep.getId() == id)
                return dep;
        }
        return null;
    }

    public Department findDepartmentByName(String name) {
        for(Department dep : departmentList) {
            if(dep.getName() == name)
                return dep;
        }

        return null;
    }

    public ArrayList<Department> findAllDepartment() { return departmentList; }

    public void insertDepartment(Department entity) {
        entity.setId(currentId++);
        departmentList.add(entity);
    }

    public void deleteDepartment(Department entity) {
        for(Department temp : departmentList) {
            if(temp.getId() == entity.getId()) {
                departmentList.remove(temp);
                break;
            }
        }
    }

    public void updateDepartment(Department entity) {
        for(Department temp : departmentList) {
            if(temp.getId() == entity.getId()) {
                temp.setMaName(entity.getMaName());
                temp.setName(entity.getName());
            }
        }
    }
}
