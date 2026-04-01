package com.kovanlabs.controller;

import com.kovanlabs.model.EmployeeModel;
import com.kovanlabs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.addEmployee(employeeModel);
    }

    @GetMapping("/display")
    public List<EmployeeModel> viewEmployee(){
        return employeeService.viewEmployee();
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.updateEmployee(employeeModel);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }
}
