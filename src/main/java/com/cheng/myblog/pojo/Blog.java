package com.cheng.myblog.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Blog {
    public int blogId;
    public String title;
    public String content;
    public Timestamp postTime;
    public int userId;
}

