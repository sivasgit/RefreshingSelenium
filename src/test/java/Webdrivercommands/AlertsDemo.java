package Webdrivercommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;



public class AlertsDemo {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(" https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();

        Alert alert = driver.switchTo().alert();
        String alertmsg = alert.getText();
        System.out.println(alertmsg);
        alert.dismiss();

        String actmsg = driver.findElement(By.id("demo")).getText();
        System.out.println(actmsg);
        Assert.assertEquals("You pressed Cancel!",actmsg);





    }
}
