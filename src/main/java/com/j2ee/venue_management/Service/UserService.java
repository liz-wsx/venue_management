package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.User;

public interface UserService {

    User findOne(Integer id);

    User findByNameAndPassword(String name, String password);

    //User changeByNameAndPassword(String name,String password);

    User createUser(User user);

    void deleteUserById(Integer id);
        }
