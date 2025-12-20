package com.yuanwei.service.impl;

import com.yuanwei.mapper.ClazzMapper;
import com.yuanwei.pojo.Clazz;
import com.yuanwei.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public List<Clazz> findAll() {
        return clazzMapper.findAll();
    }
}
