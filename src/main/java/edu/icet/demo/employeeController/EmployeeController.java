package edu.icet.demo.employeeController;

import edu.icet.demo.dto.Employee;
import edu.icet.demo.entity.EmployeeEntity;
import edu.icet.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService employeeService;

    @PostMapping("add-employee")
    public void persist(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping("get-all")
    public Iterable<EmployeeEntity> getAll(){return employeeService.getAll();
    }
}
