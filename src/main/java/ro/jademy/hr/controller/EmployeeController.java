package ro.jademy.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.hr.model.Employee;
import ro.jademy.hr.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository; //== new ... (automatically)

    @RequestMapping("/employees/{id}")
    public String employee(@PathVariable("id") int id, Model model) {
        // return "Showing employee with id " + id;


        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
//        List<Employee> employeeList = new ArrayList<>();

        if(optionalEmployee.isPresent()){
            model.addAttribute("employee", optionalEmployee.get());
        }
//        employeeList.add(new Employee(1, "Ion", "Ionescu", "M"));
//        employeeList.add(new Employee(2, "Maria", "Marinescu", "F"));
//        employeeList.add(new Employee(3, "Gigi", "Gigescu", "M"));

//        for (Employee employee : employeeList) {
//            if (employee.getId() == id) {
//////                return employee.toString();
//                model.addAttribute("employee", employeeList);
//            }
//        }
        return "show_employee";
    }

    @RequestMapping("/employees")
    public String allEmployee(Model model) {
        // return "Showing employee with id " + id;


        List<Employee> employeeList = employeeRepository.findAll();


        model.addAttribute("employees", employeeList);
        return "all_employees";
    }
}
