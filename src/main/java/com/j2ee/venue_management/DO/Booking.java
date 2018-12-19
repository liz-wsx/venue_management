package com.j2ee.venue_management.DO;

import lombok.Data;
import java.util.*;

import javax.persistence.*;
/**
 * @param: none
 * @description: 对应数据表的booking类
 * @author: YQ
 * @create: 2018-12-9
 **/
@Entity
@Data
@Table(name = "booking")
public class Booking {

    /* 订单ID */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    /* 用户ID*/
    @Column(name = "userid")
    private Integer userid;

    /*用户名*/
    @Column(name = "username")
    private String username;

    /* 场馆ID*/
    @Column(name = "venueid")
    private Integer venueid;

    /*场馆名*/
    @Column(name = "venuename")
    private String venuename;

    /* 日期*/
    @Column(name = "date")
    private Date date;

    /* 开始时间*/
    @Column(name = "opentime")
    private Integer Opentime;

    /*时长*/
    @Column(name ="length")
    private Integer length;

    @Column(name ="status")
    private Integer status;

    public Booking(){
    }

    /*用于查找某一天某一场馆的预约情况*/
    public Booking(Integer venueid, Date date){
        this.venueid = venueid;
        this.date = date;
    }

    /*用于查找某一用户的全部订单*/
    public Booking(Integer userid, String username){
        this.userid = userid;
        this.username = username;
    }

    /*用于查找某一场馆的全部订单*/
    public Booking(String venuename,Integer venueid){
        this.venueid = venueid;
        this.venuename = venuename;
    }

}
