package com.kovan.streamsandlambda.controller;


import com.kovan.streamsandlambda.model.EmployeeModel;
import com.kovan.streamsandlambda.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/groupByDepartment")
    public Map<String, List<EmployeeModel>> setEmployeeService() {
        return employeeService.employeeDepartment();
    }
}
