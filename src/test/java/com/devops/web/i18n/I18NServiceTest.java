package com.devops.web.i18n;

import com.devops.DevopsbuddyApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Locale;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DevopsbuddyApplication.class)
@WebAppConfiguration
public class I18NServiceTest {

    @Autowired
    private I18NService i18NService;

    //@Test todo
    public void test() throws Exception{
        String expectedResult = "Bootstrap starter template";
        String message = i18NService.getMessage("index.main.callout", Locale.ENGLISH);
        Assert.assertTrue(expectedResult.equals(message));
    }
}