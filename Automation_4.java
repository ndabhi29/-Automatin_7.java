package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_4 {
    WebDriver  driver;
    public static void main (String[]args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SOFT\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
         driver.get("https://www.bbc.co.uk/news");
         driver.quit();
    }
}
