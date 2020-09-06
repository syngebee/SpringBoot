package com.itheima.springboot.dao.impl;

import com.itheima.springboot.dao.EmployeeDao;
import com.itheima.springboot.pojo.Department;
import com.itheima.springboot.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    //模拟数据库
    private static Map<Integer,Employee> employees = null;

    static{
        employees = new HashMap<>();
        employees.put(1001,new Employee(1001,"AA","995402495@qq.com",1,new Department(101,"Development Department")));
        employees.put(1002,new Employee(1002,"BB","995402495@qq.com",0,new Department(102,"Test Department")));
        employees.put(1003,new Employee(1003,"CC","995402495@qq.com",1,new Department(103,"Sales Department")));
        employees.put(1004,new Employee(1004,"DD","995402495@qq.com",0,new Department(104,"Operational Department")));
        employees.put(1005,new Employee(1005,"EE","995402495@qq.com",1,new Department(105,"Others")));
    }


    //主键自增变量
    private static Integer initId = 1006;

    //增,一般会带员工信息和部门id
    @Override
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }
        employees.put(employee.getId(),employee);
    }
    //删
    @Override
    public void delete(Integer id){
        employees.remove(id);
    }
    //改

    //查
    @Override
    public Collection<Employee> getAll(){
        return employees.values();
    }

    @Override
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    @Override
    public void remove(Integer id) {
        employees.remove(id);
    }
}
