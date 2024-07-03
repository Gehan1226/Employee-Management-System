package edu.icet.demo.Controller;

import edu.icet.demo.dto.Employee;
import edu.icet.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService employeeService;

    @PostMapping("add-employee")
    @ResponseStatus(HttpStatus.CREATED)
    public void persist(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping("get-all")
    public List<Employee> getAll(){return employeeService.getAll();
    }

    @DeleteMapping("/delete-emp/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "Deleted";
    }
}
