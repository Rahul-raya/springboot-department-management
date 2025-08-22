package com.example.Springbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springbootpractice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDeptname(String deptname);
    public Department findByDeptnameIgnoreCase(String deptname);

}
