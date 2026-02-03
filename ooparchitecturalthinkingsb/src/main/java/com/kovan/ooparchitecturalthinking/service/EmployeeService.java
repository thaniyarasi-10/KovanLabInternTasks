package com.Kovan.OopArchitecturalThinking.Service;

import com.Kovan.OopArchitecturalThinking.Model.Employee;

public class EmployeeService {
    public Employee getEmployee(){
        return new Employee(5, "Intern", 50000);
    }
}
