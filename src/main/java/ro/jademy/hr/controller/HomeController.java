package ro.jademy.hr.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.jademy.hr.model.Employee;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

//    @RequestMapping("/")
//    public String hello() {
//        return "Hello";
//    }


    @RequestMapping("/helloAgain")
    public String helloAgain() {
        return "Hello again!";
    }

    @RequestMapping("/")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }


}