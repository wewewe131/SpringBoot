package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.News;
import com.example.springbootdemo.mapper.NewsMapper;
import com.example.springbootdemo.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2022-06-27
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
