package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_11 {

   static WebDriver driver;
    public static void main(String[]args){
        System. setProperty("webdriver.chrome.driver", "C:\\SOFT\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.get("");
          driver.close();
    }
}
