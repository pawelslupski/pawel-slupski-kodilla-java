package com.kodilla.patterns2.facade.dao;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(public * com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
    "&& args(order, userId) && target(object)")
    public void logTheEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Logging the event - processOrder() execution....");
        LOGGER.info("Class: " + object.getClass().getName() + ", Arguments: [" + order + ", " + userId + "]");
    }
}
