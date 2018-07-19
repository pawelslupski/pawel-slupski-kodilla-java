package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getLoggerInstance().log("The update of app has been installed");
        String lastLog = Logger.getLoggerInstance().getLastLog();
        //Then
        Assert.assertEquals("The update of app has been installed", lastLog);
    }
}
