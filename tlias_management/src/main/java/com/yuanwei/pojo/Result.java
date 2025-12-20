package com.yuanwei.pojo;

import lombok.Data;


/**
 * 统一返回结果
 */
@Data
public class Result {
    private Integer code;//状态码:1成功，0失败
    private String msg;//提示信息
    private Object data;// 数据

    public static Result success(){
    	Result result = new Result();
    	result.code = 1;
    	result.setMsg("操作成功");
    	return result;
    }

    public static Result success(Object object){
    	Result result = new Result();
        result.data = object;
    	result.code = 1;
    	result.msg ="success";
    	return result;
    }

    public static Result error(String msg){
    	Result result = new Result();
    	result.msg = msg;
        result.code = 0;
    	return result;
    }
}
