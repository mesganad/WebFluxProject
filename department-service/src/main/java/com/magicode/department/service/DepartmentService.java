package com.magicode.department.service;

import com.magicode.department.entity.Department;
import com.magicode.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartment(Long departmentId) {
        log.info("Inside findDepartment of DepartmentService");
        return departmentRepository.findById(departmentId).get();
    }
}
