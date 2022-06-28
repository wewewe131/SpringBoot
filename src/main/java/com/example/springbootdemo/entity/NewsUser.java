package com.example.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author baomidou
 * @since 2022-06-28
 */
@TableName("news_user")
@ApiModel(value = "NewsUser对象", description = "")
public class NewsUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

    private String uName;

    private String uPwd;

    private LocalDate uBirth;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }
    public LocalDate getuBirth() {
        return uBirth;
    }

    public void setuBirth(LocalDate uBirth) {
        this.uBirth = uBirth;
    }

    @Override
    public String toString() {
        return "NewsUser{" +
            "uId=" + uId +
            ", uName=" + uName +
            ", uPwd=" + uPwd +
            ", uBirth=" + uBirth +
        "}";
    }
}
