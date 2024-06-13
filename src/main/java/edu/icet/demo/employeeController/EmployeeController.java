package edu.icet.demo.employeeController;

import edu.icet.demo.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/emp-controller")
public class EmployeeController {
    List<Employee> employeeList = new ArrayList<>();
    @PostMapping("add-employee")
    public void persist(@RequestBody Employee employee){
        employeeList.add(employee);
    }
    @GetMapping("get-all")
    public List<Employee> getAll(){
        return employeeList;
    }
}
