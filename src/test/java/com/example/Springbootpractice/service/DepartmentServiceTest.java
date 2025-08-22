package com.example.Springbootpractice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Springbootpractice.entity.Department;
import com.example.Springbootpractice.repository.DepartmentRepository;



import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;
    
    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department=Department.builder()
        .deptname("AI")
        .deptcode("CSE1007")
        .deptlocation("Vijayawada")
        .deptid(1L)
        .build();

        Mockito.when(departmentRepository.findByDeptnameIgnoreCase("AI")).thenReturn(department);
    }

    @Test
    public void testFetchDepartmentByName() {
        String departmentName="AI";
        Department found= departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDeptname());
    }

    
}
