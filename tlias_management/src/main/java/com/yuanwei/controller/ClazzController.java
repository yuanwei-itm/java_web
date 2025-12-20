package com.yuanwei.controller;

import com.yuanwei.pojo.Clazz;
import com.yuanwei.pojo.Result;
import com.yuanwei.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RequestMapping("/clazzs")
@RestController
public class ClazzController {


    @Autowired
    private ClazzService clazzService;

    /**
     * 查询所有班级
     */
    @GetMapping("/list")
    public Result list() {

        log.info("查询所有班级");
        List<Clazz> clazzList = clazzService.findAll();
        return Result.success(clazzList);
    }
}
