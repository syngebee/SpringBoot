package com.itheima.springboot.dao.impl;

import com.itheima.springboot.dao.DepartmentDao;
import com.itheima.springboot.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
    //模拟数据库数据
    private static Map<Integer,Department> departments = null;

    static{
        departments = new HashMap<>();
        departments.put(101,new Department(101,"Development Department"));
        departments.put(102,new Department(102,"Test Department"));
        departments.put(103,new Department(103,"Sales Department"));
        departments.put(104,new Department(104,"Operational Department"));
        departments.put(105,new Department(105,"Others"));
    }

    //获取所有部门信息
    public Collection<Department> getDepratments(){
        return departments.values();
    }
    //通过ID获取部门
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}
