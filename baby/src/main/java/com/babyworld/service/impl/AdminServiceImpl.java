package com.babyworld.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.babyworld.dao.AdminDao;
import com.babyworld.domain.Admin;
import com.babyworld.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }

    public List<Admin> findAdmins(Map<String, Object> map) {

        return adminDao.findAdmins(map);
    }

    public Integer getCount(Map<String, Object> map) {

        return adminDao.getCount(map);
    }

    public Integer addAdmin(Admin admin) {

        return adminDao.addAdmin(admin);
    }

    public Integer updateAdmin(Admin admin) {

        return adminDao.updateAdmin(admin);
    }

    public Integer deleteAdmin(Integer id) {

        return adminDao.deleteAdmin(id);
    }

}