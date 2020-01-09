package com.babyworld.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.babyworld.dao.DepartmentDao;
import com.babyworld.domain.Department;
import com.babyworld.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public List<Department> findDepartments(Map<String, Object> map) {

        return departmentDao.findDepartments(map);
    }

    public Integer getCount(Map<String, Object> map) {

        return departmentDao.getCount(map);
    }

    public Integer addDepartment(Department department) {

        return departmentDao.addDepartment(department);
    }

    public Integer updateDepartment(Department department) {

        return departmentDao.updateDepartment(department);
    }

    public Integer deleteDepartment(Integer id) {
        Integer flag = null;
        try {
            flag = departmentDao.deleteDepartment(id);
        } catch (Exception e) {
            throw new RuntimeException();
        }

        return flag;
    }
}