package com.yuanwei.mapper;


import com.yuanwei.pojo.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * 查询所有部门
     * @return
     */

    @Select("select id, name, create_time, update_time from dept order by update_time desc;")
    List<Dept> findAll();


    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);


    @Insert("insert into dept(name, create_time, update_time) values(#{name}, #{createTime}, #{updateTime})")
    int add(Dept dept);
}
