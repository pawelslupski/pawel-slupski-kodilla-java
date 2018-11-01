package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] Args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement selectDayField = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDayBox = new Select(selectDayField);
        selectDayBox.selectByIndex(5);

        WebElement selectMonthField = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthBox = new Select(selectMonthField);
        selectMonthBox.selectByIndex(12);

        WebElement selectYearField = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYearBox = new Select(selectYearField);
        selectYearBox.selectByIndex(35);
    }
}
