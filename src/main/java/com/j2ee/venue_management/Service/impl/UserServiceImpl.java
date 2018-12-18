package com.j2ee.venue_management.Service.impl;

import com.j2ee.venue_management.DO.User;
import com.j2ee.venue_management.Repository.UserRepository;
import com.j2ee.venue_management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param: none
 * @description: 用于实现Service层
 * @author: KingJ
 * @create: 2018-11-23 20:52
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(Integer id){return userRepository.findById(id).get();};

    @Override
    public User findByNameAndPassword(String name, String password){
        return userRepository.findByNameAndPassword(name, password);
    }

//    @Override
//    public User changeByNameAndPassword(String name, String password)
//    {
//        return userRepository.changeByNameAndPassword(name,password);
//    }

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id){
        userRepository.deleteById(id);
    }

}