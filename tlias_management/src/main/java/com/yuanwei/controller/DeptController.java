package com.yuanwei.controller;


import com.yuanwei.pojo.Dept;
import com.yuanwei.pojo.Result;
import com.yuanwei.service.DeptService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询所有部门
     * @return
     */
    @GetMapping("/depts")
    public Result list() {
        System.out.println("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

//    /**
//     * 删除部门 方式一：使用HttpServletRequest 获取参数
//     */
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request) {
//        String idStr = request.getParameter("id");
//        int id = Integer.parseInt(idStr);
//        System.out.println("删除部门id：" + id);
//        return Result.success();
//    }

//    /**
//     * 删除部门 方式二：使用@RequestParam 获取参数
//     * @param depid
//     * @return
//     */
//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam("id") Integer depid) {
//        System.out.println("删除部门id：" + depid);
//        return Result.success();
//    }
    /**
     *  删除部门  方式三：直接定义参数名与请求参数名一致
     * @param id
     * @return
     */
    @DeleteMapping("/depts")
    public Result delete(Integer id) {
        System.out.println("删除部门id：" + id);
        deptService.deleteById(id);
        return Result.success();
    }

    /**
     * 添加部门
     */
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept) {
        System.out.println("添加部门：" + dept);
        return deptService.add(dept) ? Result.success() : Result.error("添加失败");
    }


    /**
     * 根据id查询部门
     */
    @GetMapping("/depts/{id}")
    public Result getInfo(@PathVariable Integer id) {
        System.out.println("查询部门id：" + id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门
     */
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept) {
        System.out.println("修改部门：" + dept);
        deptService.updateById(dept);
        return Result.success();
    }
}
