package com.j2ee.venue_management.DO;

import lombok.Data;

import javax.persistence.*;
/**
 * @param: none
 * @description: 对应数据表的message类
 * @author: YQ
 * @create: 2018-12-9
 **/
@Entity
@Data
@Table(name = "message")
public class Message {

    /* 留言ID */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    /* 用户ID */
    @Column(name = "UserID")
    private Integer UserID;

    /* 内容 */
    @Column(name = "content")
    private String content;

    public Message(){
    }

}
