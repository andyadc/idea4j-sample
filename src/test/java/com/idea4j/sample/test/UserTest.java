package com.idea4j.sample.test;

import com.idea4j.framework.ioc.BeanHelper;
import com.idea4j.framework.test.FrameworkJUnit4ClassRunner;
import com.idea4j.sample.service.UserService;
import com.idea4j.sample.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andaicheng
 */
@RunWith(FrameworkJUnit4ClassRunner.class)
public class UserTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserTest.class);

    private UserService userService = BeanHelper.getBean(UserServiceImpl.class);

    @Test
    public void testGetById() {
        LOGGER.info("---");
        LOGGER.info("{}", userService.selectById(1L).getName());
    }

}
