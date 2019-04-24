package ro.jademy.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.hr.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping("/employee/{id}/show")
    public String employee(@PathVariable("id") int id, Model model) {
        // return "Showing employee with id " + id;


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Ion", "Ionescu", "M"));

        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
////                return employee.toString();
            model.addAttribute("employee", employee);
            }
        }
        return "show_employee";
    }
}
