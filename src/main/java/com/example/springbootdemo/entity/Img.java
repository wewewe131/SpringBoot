package com.example.springbootdemo.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author baomidou
 * @since 2022-06-27
 */
@ApiModel(value = "Img对象", description = "")
public class Img implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;

    private String uid;

    private String imgpath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    @Override
    public String toString() {
        return "Img{" +
            "id=" + id +
            ", uid=" + uid +
            ", imgpath=" + imgpath +
        "}";
    }
}
