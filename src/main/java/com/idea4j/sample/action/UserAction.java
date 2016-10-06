package com.idea4j.sample.action;

import com.idea4j.framework.ioc.annotation.Inject;
import com.idea4j.framework.mvc.annotation.Action;
import com.idea4j.framework.mvc.annotation.Request;
import com.idea4j.framework.mvc.bean.Result;
import com.idea4j.sample.service.UserService;

/**
 * @author andaicheng
 */
@Action
public class UserAction {

    @Inject
    private UserService userService;

    @Request.GET(value = "/user")
    public Object user(){
        Result result = new Result(true);
        result.setData(userService.selectById(1L));
        return result;
    }
}
