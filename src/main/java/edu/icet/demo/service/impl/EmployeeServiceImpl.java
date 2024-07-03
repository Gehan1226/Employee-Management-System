package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.Employee;
import edu.icet.demo.entity.EmployeeEntity;
import edu.icet.demo.repository.EmployeeRepository;
import edu.icet.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new ObjectMapper().convertValue(employee, EmployeeEntity.class);
        employeeRepository.save(employeeEntity);
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();

        employeeRepository.findAll().forEach(employeeEntity ->
                employeeList.add(new ObjectMapper().convertValue(employeeEntity, Employee.class)
        ));
        return employeeList;
    }

    @Override
    public void deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
        }
    }
}
