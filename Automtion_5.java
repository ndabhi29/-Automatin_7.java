package org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automtion_5 {
   static WebDriver driver;
    public static void main (String[]args){
        System. setProperty("webdriver.chrome.driver","C:\\SOFT\\chromedriver.exe");

         driver = new ChromeDriver();
         driver.get("https://www.itv.com/news/london/");
         driver.quit();
    }

}
