package com.zpark.ssm.booksystem.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回给前台的结果集对象
 * 包含的属性有：
 * 状态码(如果返回x则成功，如果返回y表示失败)
 * 状态信息
 * 携带的参数
 */
@Data
@Accessors(chain = true)
public class Result {

    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    public static Result ok(String message) {
        Result result = new Result();
        result.setCode(1);
        result.setMessage(message);
        return result;
    }

    public static Result error(String message) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage(message);
        return result;
    }

    public Result addData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}
