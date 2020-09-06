package com.itheima.springboot.service.impl;

import com.itheima.springboot.dao.DepartmentDao;
import com.itheima.springboot.dao.EmployeeDao;
import com.itheima.springboot.pojo.Department;
import com.itheima.springboot.pojo.Employee;
import com.itheima.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employeeById = employeeDao.getEmployeeById(id);
        return employeeById;
    }

    @Override
    public List<Employee> getAll() {
        Collection<Employee> all = employeeDao.getAll();
        return new ArrayList<>(all);
    }

    @Override
    public void add(Employee employee) {
        Integer id = employee.getDepartment().getId();
        Department departmentById = departmentDao.getDepartmentById(id);
        employee.setDepartment(departmentById);
        employeeDao.save(employee);
    }

    @Override
    public void remove(Integer id) {
        employeeDao.remove(id);
    }

}
