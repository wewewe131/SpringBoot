package com.example.springbootdemo.controller;

import com.example.springbootdemo.common.Exception.CustomerException;
import com.example.springbootdemo.entity.vo.NewsSearchVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2022-06-27
 */
@RestController
@RequestMapping("/v1/news")
public class NewsController {

    @GetMapping("/test/{test}")
    public void test(@Valid NewsSearchVo vo){

    }

}
