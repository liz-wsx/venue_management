package com.j2ee.venue_management.Service.impl;

import com.j2ee.venue_management.DO.Admin;
import com.j2ee.venue_management.Repository.AdminRepository;
import com.j2ee.venue_management.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param: none
 * @description: 用于实现Service层
 * @author: YQ
 * @create: 2018-11-23 20:52
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin findByNameAndPassword(String name, String password){
        return adminRepository.findByNameAndPassword(name, password);
    }

}