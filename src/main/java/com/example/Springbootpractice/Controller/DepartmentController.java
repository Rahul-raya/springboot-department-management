package com.example.Springbootpractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.Springbootpractice.Error.DeptNotFoundException;
import com.example.Springbootpractice.entity.Department;
import com.example.Springbootpractice.service.DepartmentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {

            return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
    
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable ("id") Long id) throws DeptNotFoundException {
        return departmentService.fetchDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable ("id") Long id){
        departmentService.deleteDepartmentById(id);
        return "Department is deleted Succesfully!!";
    }

    @PutMapping("/departments/{id}")
    public Department updatebyId(@PathVariable ("id") Long id, @RequestBody Department department){
        return departmentService.updatebyId(id,department);
    }

    @GetMapping("/departments/name/{name}")   
    public Department fetchDepartmentByName(@PathVariable ("name") String deptname){
        return departmentService.fetchDepartmentByName(deptname);
    }

}
