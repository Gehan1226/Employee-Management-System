package edu.icet.demo.Controller;

import edu.icet.demo.dto.Department;
import edu.icet.demo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
@CrossOrigin
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public Department addDep(@RequestBody Department department){
        return departmentService.addDep(department);
    }
}
