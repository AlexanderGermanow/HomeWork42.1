package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper {

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public boolean isNoReminderPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderTitlePresent() {
        return isTextPresent(By.id("recycle_title"));
    }

    public String isDateTextPresent() {
        return isTextPresent(By.id("recycle_date_time"));
    }

   public String isTypeReminderTextPresent() {
        return isTextPresent(By.id("recycle_repeat_info"));
   }
}
