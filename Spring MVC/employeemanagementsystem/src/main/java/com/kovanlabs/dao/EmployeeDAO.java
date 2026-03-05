package com.kovanlabs.dao;

import com.kovanlabs.model.EmployeeModel;

import java.util.List;

public interface EmployeeDAO {
    String createEmployee(EmployeeModel employeeModel);
    List<EmployeeModel> readEmployee(EmployeeModel employeeModel);
    String  updateEmployee(EmployeeModel employeeModel);
    String  deleteEmployee(int id);
}
