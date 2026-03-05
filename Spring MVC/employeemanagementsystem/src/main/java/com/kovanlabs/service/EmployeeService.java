package com.kovanlabs.service;

import com.kovanlabs.dao.EmployeeDAO;
import com.kovanlabs.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public String addEmployee(EmployeeModel employeeModel){
        return employeeDAO.createEmployee(employeeModel);
    }

    public List<EmployeeModel> viewEmployee(){
        return employeeDAO.readEmployee(new EmployeeModel());
    }

    public String updateEmployee(EmployeeModel employeeModel){
        return employeeDAO.updateEmployee(employeeModel);
    }

    public String deleteEmployee(int id){
        return employeeDAO.deleteEmployee(id);
    }
}