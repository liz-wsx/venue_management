package com.j2ee.venue_management.DO;

import lombok.Data;

import javax.persistence.*;
/**
 * @param: none
 * @description: 对应数据表的User类
 * @author: KingJ
 * @create: 2018-11-17 17:01
 **/
@Entity
@Data
@Table(name = "user")
public class User {

    /* 用户ID */
    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer id;

    /* 用户名 */
    @Column(name = "name")
    private String name;

    /* 用户密码 */
    @Column(name = "password")
    private String password;

    /* 手机号 */
    @Column(name = "phone")
    private String phone;

    /* 邮箱 */
    @Column(name = "email")
    private String email;

    public User(){
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public User(String name, String password,String phone, String email){
        this.name = name;
        this.password = password;
        this.phone=phone;
        this.email=email;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public void setPhone(String phone)
    {
        this.phone=phone;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }


}
