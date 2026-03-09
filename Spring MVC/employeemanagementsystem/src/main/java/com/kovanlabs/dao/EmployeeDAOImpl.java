package com.kovanlabs.dao;

import com.kovanlabs.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private DataSource ds;

    // CREATE
    @Override
    public String createEmployee(EmployeeModel employeeModel) {

        String query = "INSERT INTO employee (id,name,designation) VALUES (?,?,?)";

        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setLong(1, employeeModel.getId());
            ps.setString(2, employeeModel.getName());
            ps.setString(3, employeeModel.getDesignation());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Employee Added";
    }

    // READ
    @Override
    public List<EmployeeModel> readEmployee(EmployeeModel employeeModel) {

        List<EmployeeModel> employeeList = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                EmployeeModel emp = new EmployeeModel();

                emp.setId(rs.getLong("id"));
                emp.setName(rs.getString("name"));
                emp.setDesignation(rs.getString("designation"));

                employeeList.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    // UPDATE
    @Override
    public String updateEmployee(EmployeeModel employeeModel) {

        String sql = "UPDATE employee SET name=?, designation=? WHERE id=?";

        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, employeeModel.getName());
            ps.setString(2, employeeModel.getDesignation());
            ps.setLong(3, employeeModel.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Employee Updated";
    }

    // DELETE
    @Override
    public String deleteEmployee(int id) {

        String sql = "DELETE FROM employee WHERE id=?";

        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Employee Deleted";
    }
}