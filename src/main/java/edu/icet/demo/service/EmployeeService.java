package edu.icet.demo.service;

import edu.icet.demo.dto.Employee;
import edu.icet.demo.entity.EmployeeEntity;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Iterable<EmployeeEntity> getAll();
}
