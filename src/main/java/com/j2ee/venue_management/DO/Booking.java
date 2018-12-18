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
    @Column(name = "userID")
    private Integer userID;

    /*用户名*/
    @Column(name = "userName")
    private String userName;

    /* 场馆ID*/
    @Column(name = "venueID")
    private Integer venueID;

    /*场馆名*/
    @Column(name = "venueName")
    private String venueName;

    /* 日期*/
    @Column(name = "date")
    private Date date;

    /* 开始时间*/
    @Column(name = "openTime")
    private Integer OpenTime;

    /*时长*/
    @Column(name ="length")
    private Integer length;

    public Booking(){
    }

    /*用于查找某一天某一场馆的预约情况*/
    public Booking(Integer venueID, Date date){
        this.venueID = venueID;
        this.date = date;
    }

    /*用于查找某一用户的全部订单*/
    public Booking(Integer userID, String userName){
        this.userID = userID;
        this.userName = userName;
    }

    /*用于查找某一场馆的全部订单*/
    public Booking(String venueName,Integer venueID){
        this.venueID = venueID;
        this.venueName = venueName;
    }

}
