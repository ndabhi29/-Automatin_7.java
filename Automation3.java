package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3 {
   static WebDriver driver;
    public static void main(String[]arg){
        System. setProperty("webdriver.chrome.driver", "C:\\SOFT\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get ("https://www.tescoviews.com/");
       driver.close();

    }
}
