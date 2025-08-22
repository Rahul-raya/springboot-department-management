package com.example.Springbootpractice.service;

import com.example.Springbootpractice.Error.DeptNotFoundException;
import com.example.Springbootpractice.entity.Department;
import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);
    public List<Department> getAllDepartments();
    public Department fetchDepartmentById(Long id) throws DeptNotFoundException;
    public void deleteDepartmentById(Long id);
    public Department updatebyId(Long id, Department department);
    public Department fetchDepartmentByName(String deptname);

}
