package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.Admin;

public interface AdminService {
    Admin findByNameAndPassword(String name, String password);
}
