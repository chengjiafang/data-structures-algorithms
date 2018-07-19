package com.zhanghuanfa.some;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhanghuanfa  2018-06-13 17:30
 */
@Data
public class AddClassTeachingTimeParam implements Serializable {

    private static final long serialVersionUID = -3389467011834247468L;
    private String code;			// 代码
    private Integer beginHour;		// 开始小时
    private Integer beginMinute;	// 开始分钟
    private Integer endHour;		// 结束小时
    private Integer endMinute;		// 结束分钟

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
