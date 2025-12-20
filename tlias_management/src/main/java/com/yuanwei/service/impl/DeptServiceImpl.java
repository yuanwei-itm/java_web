package com.yuanwei.service.impl;

import com.yuanwei.mapper.DeptMapper;
import com.yuanwei.pojo.Dept;
import com.yuanwei.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
        System.out.println("删除部门id：" + id);
    }

    @Override
    public boolean add(Dept dept) {

        // 设置创建时间
        dept.setCreateTime(LocalDateTime.now());
        // 设置更新时间
        dept.setUpdateTime(LocalDateTime.now());

        // 调用Mapper层方法添加部门
        if (deptMapper.add(dept) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public void updateById(Dept dept) {
        // 设置更新时间
        dept.setUpdateTime(LocalDateTime.now());

        // 调用Mapper层方法
        deptMapper.updateById(dept);

    }
}
