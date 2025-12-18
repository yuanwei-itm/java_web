package com.yuanwei.service.impl;

import com.yuanwei.mapper.DeptMapper;
import com.yuanwei.pojo.Dept;
import com.yuanwei.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
