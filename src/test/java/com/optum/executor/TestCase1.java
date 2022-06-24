package com.optum.executor;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {

    @Test
    public void verifyTitle()
    {
        String title=driver.getTitle();
        Assert.assertEquals(title,"Google");
    }
}
