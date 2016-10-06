package com.idea4j.sample.service;

import com.idea4j.sample.entity.User;

/**
 * @author andaicheng
 */
//@Impl(value = UserServiceImpl.class)
public interface UserService {

    User selectById(long id);
}
