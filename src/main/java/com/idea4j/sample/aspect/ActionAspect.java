package com.idea4j.sample.aspect;

import com.idea4j.framework.aop.AspectProxy;
import com.idea4j.framework.aop.annotation.Aspect;
import com.idea4j.framework.mvc.annotation.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @author andaicheng
 */
@Aspect(annotation = Action.class)
public class ActionAspect extends AspectProxy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActionAspect.class);

    private long begin;

    @Override
    public void begin() {
        LOGGER.info("---------- begin ----------");
    }

    @Override
    public void end() {
        LOGGER.info("---------- end ----------");
    }

    @Override
    public boolean intercept(Class<?> cls, Method method, Object[] params) throws Throwable {
        return true;
    }

    @Override
    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        LOGGER.info("---------- before ----------");
        begin = System.currentTimeMillis();
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
        LOGGER.info("---------- after ----------");
        LOGGER.info("time: {}", System.currentTimeMillis() - begin);
    }
}
