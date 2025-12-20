package com.yuanwei.service;

import com.yuanwei.pojo.Clazz;

import java.util.List;

public interface ClazzService {
    /**
     * 查询所有班级
     * @return
     */
    List<Clazz> findAll();
}
