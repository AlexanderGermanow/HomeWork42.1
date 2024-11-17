package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

    @Test
    public void appLaunchTests() {
        //verify No Reminder element is present
        Assert.assertTrue(app.getMainScreen().isNoReminderPresent());
    }
}
