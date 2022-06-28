package com.example.springbootdemo.entity.vo;

import com.example.springbootdemo.entity.News;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsSearchVo extends News{
    private Long id;

    private String title;

    private String content;
    @Past//输入必须是过去的日期
    private Date startdate;
    @Past//输入必须是过去的日期
    private Date enddate;
    @Min(1)
    private Integer pageNo;

    private Integer pageSize;
}