package com.kovan.streamsandlambda.service;

import com.kovan.streamsandlambda.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    public  Map<String, List<EmployeeModel>> employeeDepartment(){

        List<EmployeeModel> employeeList = new ArrayList<>
                (List.of(
                        new EmployeeModel("Ram", "IT"),
                        new EmployeeModel("Arun", "HR"),
                        new EmployeeModel("Anu", "IT"),
                        new EmployeeModel("Kumar", "Finance"),
                        new EmployeeModel("Meena", "HR")
                ));
        return employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeModel::getDepartment));
        // groupingBy - Create a Map internally, compute keys, group values, return the Map -> done by the Collector
    }
}
