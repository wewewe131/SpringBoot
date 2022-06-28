package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.NewsUser;
import com.example.springbootdemo.mapper.NewsUserMapper;
import com.example.springbootdemo.service.INewsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2022-06-28
 */
@Service
public class NewsUserServiceImpl extends ServiceImpl<NewsUserMapper, NewsUser> implements INewsUserService {

}
