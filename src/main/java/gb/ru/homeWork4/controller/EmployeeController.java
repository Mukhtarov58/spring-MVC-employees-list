package gb.ru.homeWork4.controller;

import gb.ru.homeWork4.model.Employee;
import gb.ru.homeWork4.repository.EmployeeRepositiry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeRepositiry employeeRepositiry;

    @GetMapping("/employees")
    public String getEmployee(Model model) {
        model.addAttribute("employees", employeeRepositiry.getEmployees());
        return "employees";
    }

    @PostMapping("/employees")
    public String addEmployee(Employee employee, Model model) {
        employeeRepositiry.addEmploye(employee);
        model.addAttribute("employees", employeeRepositiry.getEmployees());
        return "employees";
    }
}
