package com.magicode.department.controller;

import com.magicode.department.entity.Department;
import com.magicode.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping
    public ResponseEntity<?> addDepartment(@RequestBody Department department){
        Department addedDept= departmentService.saveDepartment(department);
        log.info("Inside addDepartment of DepartmentController");
        System.out.println("Inside addDepartment of DepartmentController");
        return new ResponseEntity<Department>(addedDept, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDepartment(@PathVariable(name = "id") Long departmentId){
        Department foundDept= departmentService.findDepartment(departmentId);
        log.info("Inside getDepartment of DepartmentController");
        if(foundDept!=null){
            return new ResponseEntity<Department>(foundDept,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
