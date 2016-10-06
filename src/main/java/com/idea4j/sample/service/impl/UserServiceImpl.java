package com.idea4j.sample.service.impl;

import com.idea4j.framework.ioc.annotation.Bean;
import com.idea4j.sample.entity.User;
import com.idea4j.sample.service.UserService;

/**
 * @author andaicheng
 */
@Bean
public class UserServiceImpl implements UserService {

    @Override
    public User selectById(long id) {
        User user = new User();
        user.setId(1L);
        user.setName("andyadc");
        return user;
    }
}
