package com.yuanwei.service;

import com.yuanwei.pojo.Dept;

import java.util.List;

public interface DeptService {

    /**
     * 查询所有部门
     * @return
     */
    List<Dept> findAll();


    /**
     * 删除部门
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param dept
     * @return
     */
    boolean add(Dept dept);
}
