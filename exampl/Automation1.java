package org.exampl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

  static  WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SOFT\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tfl.gov.uk/");
        driver.close();
    }

}
