package com.yuanwei.mapper;

import com.yuanwei.pojo.Clazz;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClazzMapper {
    /**
     * 查询所有班级
     * @return
     */
    @Select("select id, name, room, begin_date, end_date, master_id, subject, create_time, update_time from clazz order by update_time desc;")
    List<Clazz> findAll();
}
