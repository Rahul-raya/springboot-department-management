package com.example.Springbootpractice.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

import com.example.Springbootpractice.Error.DeptNotFoundException;
import com.example.Springbootpractice.entity.Department;
import com.example.Springbootpractice.repository.DepartmentRepository;

@Service
public class DepartmentServiceimp implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
        
    }
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    @Override
    public Department fetchDepartmentById(Long id) throws DeptNotFoundException {
       Optional<Department> department= departmentRepository.findById(id);
       if(!department.isPresent()){
           throw new DeptNotFoundException("Department not found with id: " + id);
       }
         return department.get();
    }
    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updatebyId(Long id, Department department) {
        Department dep=departmentRepository.findById(id).get();
        if(Objects.nonNull(department.getDeptname()) && !"".equalsIgnoreCase(department.getDeptname())){
            dep.setDeptname(department.getDeptname());
        }
        if(Objects.nonNull(department.getDeptlocation()) && !"".equalsIgnoreCase(department.getDeptlocation())){
            dep.setDeptlocation(department.getDeptlocation());
        }
        if(Objects.nonNull(department.getDeptcode()) && !"".equalsIgnoreCase(department.getDeptcode())){
            dep.setDeptcode(department.getDeptcode());
        }

        return departmentRepository.save(dep);
    }
    @Override
    public Department fetchDepartmentByName(String deptname) {
        return departmentRepository.findByDeptnameIgnoreCase(deptname);
    }
}
