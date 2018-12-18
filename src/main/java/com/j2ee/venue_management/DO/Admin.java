package com.j2ee.venue_management.DO;

import lombok.Data;

import javax.persistence.*;
/**
 * @param: none
 * @description: 对应数据表的admin类
 * @author: YQ
 * @create: 2018-12-9
 **/
@Entity
@Data
@Table(name = "admin")
public class Admin {

    /* 管理员ID */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    /* 管理员名 */
    @Column(name = "name")
    private String name;

    /* 管理员密码 */
    @Column(name = "password")
    private String password;

    public Admin(){
    }

    public Admin(String name, String password){
        this.name = name;
        this.password = password;
    }

}
