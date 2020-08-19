package com.isoft.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    public static final int STATUS_NONE_ACTIVE = 0 ;
    public static final int STATUS_ACTIVE = 1 ;

    @TableId(value = "userId",type = IdType.AUTO)
    private Integer userId;
    @TableField("userName")
    private String userName;
    @TableField("userPass")
    private String userPass;
    @TableField("userPhone")
    private String userPhone;
    @TableField("userEmail")
    private String userEmail;
    @TableField("userCreateTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "Asia/Shanghai")
    private Date userCreateTime;
    @TableField("userState")
    private Integer userState;
    @TableField("userPhotoUrl")
    private String userPhotoUrl;
    private String activecode;
}
