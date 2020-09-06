package com.itheima.springboot.controller;

import com.itheima.springboot.pojo.Department;
import com.itheima.springboot.pojo.Employee;
import com.itheima.springboot.service.DepartmentService;
import com.itheima.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> employees = employeeService.getAll();
        model.addAttribute("employees",employees);
        return "emp/list.html";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model){
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addemp(Employee employee){
        employeeService.add(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id")Integer id, Model model){
        List<Department> departments = departmentService.getDepartments();
        Employee employee = employeeService.getEmployeeById(id);

        model.addAttribute("departments",departments);
        model.addAttribute("emp",employee);
        return "emp/edit";
    }

    @RequestMapping("/updateEmp")
    public String update(Employee employee){
        System.out.println(employee);
        employeeService.add(employee);
        return "redirect:/emps";
    }

    @RequestMapping("/delemp/{id}")
    public String del(@PathVariable("id")Integer id){
        employeeService.remove(id);
        return "redirect:/emps";
    }


}
