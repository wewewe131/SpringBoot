package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.Img;
import com.example.springbootdemo.mapper.ImgMapper;
import com.example.springbootdemo.service.IImgService;
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
public class ImgServiceImpl extends ServiceImpl<ImgMapper, Img> implements IImgService {

}
