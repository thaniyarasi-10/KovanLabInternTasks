package com.Kovan.OopArchitecturalThinking.Controller;

import com.Kovan.OopArchitecturalThinking.Model.Employee;
import com.Kovan.OopArchitecturalThinking.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public Employee getEmployee(){
        return employeeService.getEmployee();
    }
}
