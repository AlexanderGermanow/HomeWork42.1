package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getMainScreen().tapAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
    }

    @Test
    public void addReminderTestTitlePositiveTest() {
        app.getReminder().tapSaveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }

    @Test
    public void addReminderDatePositiveTest() {
        app.getReminder().tapDateField();
        app.getReminder().swipeToMonth("future",2,"DEC");
        app.getReminder().selectDate(23);
        app.getReminder().tapYear();
        app.getReminder().swipeYear("future","2025");
        app.getReminder().tapOK();
        app.getReminder().tapSaveReminder();
        Assert.assertTrue(app.getMainScreen().isDateTextPresent().contains("24/12/2025"));
    }

    @Test
    public void addReminderTimePositiveTest() {
        app.getReminder().tapTimeField();
        app.getReminder().selectTime("am", 269,926,543,656);
        app.getReminder().tapOK();
        app.getReminder().tapSaveReminder();
        Assert.assertTrue(app.getMainScreen().isDateTextPresent().contains("9:00"));
    }

    @Test
    public void addReminderTypeOfRepetitionPositiveTest() {
        app.getReminder().pause(500);
        app.getReminder().swipe(0.8,0.3);
        app.getReminder().tapTypeOfRepetitionField();
        app.getReminder().selectType("Week");
        app.getReminder().tapSaveReminder();
        Assert.assertTrue(app.getMainScreen().isTypeReminderTextPresent().contains("Week"));
    }

}

